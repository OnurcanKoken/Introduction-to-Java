import java.util.Scanner; // Built-in Scanner class

public class CircleArea{
	public static void main(String args[]){
		double radius; // diameter
		double area;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		
		area = 3.14 * radius * radius;
		
		System.out.print("Area = ");
		System.out.println(area); // method 1
		System.out.printf("Area = %f\n", area); // method 2
		System.out.println("Area = " + area); // method 3
	}
}