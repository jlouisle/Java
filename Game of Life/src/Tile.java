

public class Tile {
	public State state;
	
	public Tile() {
		state = State.dead;
	}
	
	public Tile(Tile t) {
		this.state = t.state;
	}
	
	public boolean alive() {
		return (state == State.alive);
	}
	
	public void die() {
		state = State.dead;
	}
}
