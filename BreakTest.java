import java.util.Scanner;

public class BreakTest{
	public static void main(String args[]){
		int total = 0, count = 0; // initialize when declared
		Scanner sc = new Scanner(System.in);
		
		// This example shows exiting a loop not by counting
		while(true){
			int score; // can declare inside
			System.out.print("Your score? (negative number when done) ");
			score = sc.nextInt();
			if(score < 0)
				break; // (**) get out of the loop
			total += score;
			count++;
		}
		
		// (**) break jumps here
		// variable count is to compute average		
		System.out.printf("Average score is %.2f\n",(double)total/(double)count);
	}
}