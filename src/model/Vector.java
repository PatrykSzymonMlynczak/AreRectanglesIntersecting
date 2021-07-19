package model;

public class Vector {
	
	private int x;
	private int y;
	private Point first; 
	private Point second;
	
	public Vector(Point a, Point b) {
		x = b.getX() - a.getX();
		y = b.getY() - a.getY();
		this.first = a;
		this.second = b;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point getFirst() {
		return first;
	}

	public void setFirst(Point first) {
		this.first = first;
	}

	public Point getSecond() {
		return second;
	}

	public void setSecond(Point second) {
		this.second = second;
	}


	

	
	
}
