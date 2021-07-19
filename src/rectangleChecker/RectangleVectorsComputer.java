package rectangleChecker;

import model.Rectangle;

public class RectangleVectorsComputer {
	
	VectorIntersectChecker vectorChecker = new VectorIntersectChecker();

	
	public boolean checkRectangles(Rectangle rectangleA, Rectangle rectangleB) {
		if (
		//vA
		vectorChecker.checkVectors(rectangleA.getVectorA(), rectangleB.getVectorA())
		||
		vectorChecker.checkVectors(rectangleA.getVectorA(), rectangleB.getVectorB())
		||
		vectorChecker.checkVectors(rectangleA.getVectorA(), rectangleB.getVectorC())
		||
		vectorChecker.checkVectors(rectangleA.getVectorA(), rectangleB.getVectorD())
		||
		//vB
		vectorChecker.checkVectors(rectangleA.getVectorB(), rectangleB.getVectorB())
		||
		vectorChecker.checkVectors(rectangleA.getVectorB(), rectangleB.getVectorC())
		||
		vectorChecker.checkVectors(rectangleA.getVectorB(), rectangleB.getVectorD())
		||
		//vC
		vectorChecker.checkVectors(rectangleA.getVectorC(), rectangleB.getVectorC())
		||
		vectorChecker.checkVectors(rectangleA.getVectorC(), rectangleB.getVectorD())
		||
		//vD
		vectorChecker.checkVectors(rectangleA.getVectorD(), rectangleB.getVectorD()) == true) return true;

		return false;
	}
	

}
