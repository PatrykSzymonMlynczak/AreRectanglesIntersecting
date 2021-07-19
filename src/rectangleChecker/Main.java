package rectangleChecker;

import model.Point;
import model.Rectangle;

public class Main {
    public static void main(String[] args) {
    	
    	Rectangle rectangleA = new Rectangle(new Point(2,4), new Point(1,2));
    	Rectangle rectangleB = new Rectangle (new Point(4,4), new Point(8,2));
    	
    	RectangleVectorsComputer rectangleVectorsComputer = new RectangleVectorsComputer();
    	if( rectangleVectorsComputer.checkRectangles(rectangleA,rectangleB))
    		System.out.println("Rectangles intersect");
    	else 
    		System.out.println("Rectangles do not intersect");
    }
}
