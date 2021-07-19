package rectangleChecker;

import model.Point;
import model.Vector;

public class VectorIntersectChecker {

	
	public boolean checkVectors(Vector vectorAB, Vector vectorCD) {
		boolean areIntersecting = false;
    	boolean areTouching = false;
    	
    	int productAB_C = product(vectorAB,new Vector(vectorAB.getFirst(), vectorCD.getFirst() ));
    	int productAB_D = product(vectorAB, new Vector(vectorAB.getFirst(), vectorCD.getSecond() ));
    	
    	int isNegAB = productAB_C * productAB_D;
    	
    	int productCD_A = product(vectorCD, new Vector(vectorCD.getFirst(), vectorAB.getFirst() ));
    	int productCD_B = product(vectorCD, new Vector(vectorCD.getFirst(), vectorAB.getSecond() ));
    	
    	int isNegCD = productCD_A * productCD_B;
    	
    	if (isNegAB < 0 || isNegCD < 0) 
    		areIntersecting = true;

    	if(productAB_C == 0 && checkIfTouch(vectorAB.getFirst(), vectorAB.getSecond(), vectorCD.getFirst()))
    		areTouching = true;

    	if(productAB_D == 0 && checkIfTouch(vectorAB.getFirst(), vectorAB.getSecond(), vectorCD.getSecond()))
    		areTouching = true;

    	if(productCD_A == 0 && checkIfTouch(vectorCD.getFirst(), vectorCD.getSecond(), vectorAB.getFirst()))
    		areTouching = true;

    	if(productCD_B == 0 && checkIfTouch(vectorCD.getFirst(), vectorCD.getSecond(), vectorAB.getSecond()))
    		areTouching = true;    	
    	
    	if (areIntersecting == true || areTouching == true) 
    	return true; 	
    	else return false;
	}
	
	public int product(Vector vectorA, Vector vectorB) {
		return vectorA.getX()*vectorB.getY() - vectorB.getX()*vectorA.getY();
	}

	boolean checkIfTouch(Point X, Point Y, Point Z)
	{
		return Math.min(X.getX(), Y.getX()) <= Z.getX() && Z.getX() <= Math.max(X.getX(), Y.getX()) 
			&& Math.min(X.getY(), Y.getY()) <= Z.getY() && Z.getY() <= Math.max(X.getY(), Y.getY());
	}

}
