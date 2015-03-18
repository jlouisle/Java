package model;

public class Location {
	
	private long x;
	private long y;
	
	public Location(long d, long e) {
		super();
		this.x = d;
		this.y = e;
	}

	public long getX() {
		return x;
	}

	public long getY() {
		return y;
	}
	
	public void move(long deltaX, long deltaY) {
		x += deltaX;
		y += deltaY;
	}
	
	public boolean exceeds (Location maxDimensions) {
		if ((this.x > maxDimensions.x) || (this.y > maxDimensions.y)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public long getDistance(Location other) {
		return (long) Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow(this.y - other.y, 2));
	}

	@Override
	public String toString() {
		return "Location [x=" + x + ", y=" + y + "]";
	}

}
