import java.util.Scanner;

public class LCM{
	public static void main(String[] args){
		int x, y, r, holdx, holdy, g, lcm;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		holdx = x; holdy = y;
		
		if(x<y){
			// swap x and y to satisfy x>= y
			r = x; x = y; y = r;
		}
		while(y!=0){
			r = x%y; x = y; y = r;
		}
		g = x; // the greatest common divisor
		lcm = holdx*holdy/g;
		System.out.print("here is the number: " + lcm);
		
	}
}