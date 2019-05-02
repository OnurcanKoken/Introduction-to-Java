public class CircleWithStaticMembers{
	// the radius of the circle
	double radius;
	
	// the number of the objects created
	static int numberOfObjects = 0;
	
	// construct a circle with radius 1
	CircleWithStaticMembers(){ radius = 1.0; numberOfObjects++; }
	
	// construct a circle with a specified radius
	CircleWithStaticMembers(double newRadius){ radius = newRadius; numberOfObjects++; }
	
	// return numberOfObjects
	static int getNumberOfObjects(){ return numberOfObjects; }
	
	// return the area of this circle, not involved with static
	double getArea(){ return radius * radius * Math.PI; }
}