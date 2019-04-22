// class factorial computes n! = n(n-1)(n-2)...1
import java.util.Scanner;

public class Factorial10{
	public static void main(String args[]){
		long fac; // long: factorial is very large
		long pre_fac; // to check overflow
		int i, n;
		int num10 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n? ");
		n = sc.nextInt();
		
		// start from fac = 0! = 1
		for(i = 1, fac = 1L; i<=n; i++){
			pre_fac = fac;
			fac *= i;
			while((fac%10)==0){num10++; fac/=10; pre_fac/=10;} // to reduce zeros
			
			if(pre_fac != fac/i){
				System.out.println("Overflowed at " + i + "!");
				fac = pre_fac; // roll back to the previous, unoverflowed
				break;
			} // end of overflowed check			
		} // end of for loop
		n = num10; // holding num10
		System.out.printf((i-1) + "! = " + fac);
		while(num10>0){System.out.printf("0"); num10--;}
		System.out.printf("  (fac = "+fac+", num10 = "+n+")");
	} // end of main
} // end of class