import java.util.Scanner;
public class AverageRandom{
	public static void main(String[] args){
		int n; int m = 0; int sum = 0; double average = 0.0; int above = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n? ");
		n = sc.nextInt();
		
		int C[];
		C = new int[n];
		
		for(int i = 0; i<n; i++){
			C[i] = (int)(Math.random()*9)+1;
			System.out.print(C[i] + " ");
			sum = sum + C[i];
		}
		System.out.println("");
		average = ((double)sum/n);
		System.out.println("Average = " + average);
		
		for(int i = 0; i<n; i++){
			if(C[i]>average) above = above + 1;
		}
		
		System.out.println("Number of values above the average = " + above);
	}
}