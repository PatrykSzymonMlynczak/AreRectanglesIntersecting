package model;


public class Rectangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	private Vector vectorA; 
	private Vector vectorB; 
	private Vector vectorC; 
	private Vector vectorD;
	 

	public Rectangle(Point a, Point b) {
		this.pointA = a;
		this.pointB = b;
		this.pointC = new Point(a.getX(), b.getY());
		this.pointD = new Point(b.getX(), a.getY());

		vectorA = new Vector(pointA, pointB);
		vectorB = new Vector(pointA, pointC);
		vectorC = new Vector(pointD, pointB);
		vectorD = new Vector(pointD, pointC);
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	public Vector getVectorA() {
		return vectorA;
	}

	public void setVectorA(Vector vectorA) {
		this.vectorA = vectorA;
	}

	public Vector getVectorB() {
		return vectorB;
	}

	public void setVectorB(Vector vectorB) {
		this.vectorB = vectorB;
	}

	public Vector getVectorC() {
		return vectorC;
	}

	public void setVectorC(Vector vectorC) {
		this.vectorC = vectorC;
	}

	public Vector getVectorD() {
		return vectorD;
	}

	public void setVectorD(Vector vectorD) {
		this.vectorD = vectorD;
	}

	
}
