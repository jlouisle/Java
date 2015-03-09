

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameOfLife extends JPanel {
	private static final long serialVersionUID = 1L;

	public int width = 100;
	public int height = 100;
	public int TILESIZE = 10;

	boolean running = false;

	Tile[][] tiles;

	Point lastPressed = new Point(-1, -1);

	public GameOfLife() {
		width = getWidth();
		height = getHeight();

		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.getButton() == 1) lastPressed = e.getPoint();
				if (e.getButton() == 3) running = !running;
			}
		});
		this.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				if (e.getButton() == 1) lastPressed = e.getPoint();
			}
		});
		repaint();
	}

	public void start() {
		tiles = new Tile[width/TILESIZE][height/TILESIZE];

		for (int x = 0; x < tiles.length; x++) {
			for (int y = 0; y < tiles[0].length; y++) {
				tiles[x][y] = new Tile();
			}
		}

		t.start();
	}

	public void setTilesize(int size) {
		this.TILESIZE = size;
	}

	public int getTilesize() {
		return this.TILESIZE;
	}

	Thread t = new Thread() {
		public void run() {
			try {
				while (true) {
					tick();
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {}
		}
	};

	private int getNumLivingNeighbours(int x, int y) {
		int ret = 0;
		if (x != tiles.length-1) if (tiles[x+1][y].alive()) ret+=1;
		if (x != 0) if (tiles[x-1][y].alive()) ret+=1;
		if (y != tiles[0].length-1) if (tiles[x][y+1].alive()) ret+=1;
		if (y != 0) if (tiles[x][y-1].alive()) ret+=1;
		if (x != tiles.length-1 && y != tiles[0].length-1) if (tiles[x+1][y+1].alive()) ret+=1;
		if (x != tiles.length-1 && y != 0) if (tiles[x+1][y-1].alive()) ret+=1;
		if (x != 0 && y != 0) if (tiles[x-1][y-1].alive()) ret+=1;
		if (x != 0 && y != tiles[0].length-1) if (tiles[x-1][y+1].alive()) ret+=1;
		return ret;
	}

	private void tick() {
		Dimension transRect = new Dimension((getWidth()-width)/2, (getHeight()-height)/2);
		Tile[][] copy = new Tile[tiles.length][tiles[0].length];

		
		for (int x = 0; x < tiles.length; x++) {
			for (int y = 0; y < tiles[0].length; y++) {
				copy[x][y] = new Tile(tiles[x][y]);
				if (running) {
					
					int neighboures = getNumLivingNeighbours(x, y);
					
					if (neighboures < 2) copy[x][y].die(); //underpopulation
					else if (neighboures > 3) copy[x][y].die(); //overcrowding
					else if (neighboures == 3) copy[x][y].state = State.alive; //reproduce
					
					
				}

				if (lastPressed.x != -1) {
					if (new Rectangle(transRect.width+x*TILESIZE, transRect.height+y*TILESIZE, TILESIZE, TILESIZE).contains(lastPressed)) {
						copy[x][y].state = State.alive;
						lastPressed.x = -1;
					}
				}
			}
		}
		tiles = copy;
		repaint();
	}

	public void paint(Graphics g) {
		g.translate((getWidth()-width)/2, (getHeight()-height)/2);

		if (tiles != null) {
			for (int x = 0; x < tiles.length; x++) {
				for (int y = 0; y < tiles[0].length; y++) {
					if (tiles[x][y].state == State.dead) g.setColor(Color.BLACK);
					else g.setColor(Color.white);
					g.fillRect(x*TILESIZE, y*TILESIZE, TILESIZE, TILESIZE);
				}
			}
		} else {
			g.fillRect(0, 0, width, height);
		}

	}

}