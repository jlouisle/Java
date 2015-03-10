import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		GameOfLife gol = new GameOfLife();
		
		JFrame frame = new JFrame("Conway's Game of Life");
		frame.setUndecorated(false);
		frame.setSize(1280, 800);
		frame.setPreferredSize(frame.getSize());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		frame.add(gol, BorderLayout.CENTER);
		
		frame.setVisible(true);
		
		gol.setTilesize(10);
		
		gol.setWidth(1280);
		gol.setHeight(800);
		
		gol.start();
	}
	
}
