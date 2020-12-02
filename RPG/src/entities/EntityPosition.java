package entities;

public class EntityPosition {
	
	public int x;
	public int y;
	
	public EntityPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveUp() { if (y > 0) y--; }
	
	public void moveDown() { if (y < 11) y++; }
	
	public void moveLeft() { if (x > 0) x--; }
	
	public void moveRight() { if (x <23) x++; }
	
	public void dead() {
		y=-1;
		x=-1;
	}
}
