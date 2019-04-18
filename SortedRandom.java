import java.util.Scanner;
public class SortedRandom{
	public static void main(String[] args){
		int n = 1; int m = 0;
		Scanner sc = new Scanner(System.in);
		int C[];
		
		
		
		while(n>0){
			System.out.print("n? ");
			n = sc.nextInt();
			
			C = new int[n];
			for(int i = 0; i<n; i++){
				C[i] = (int)(Math.random()*9)+1;
				// System.out.print(C[i] + " ");
			}
			java.util.Arrays.sort(C);
			for(int i = 0; i<n; i++){
				//C[i] = (int)(Math.random()*9)+1;
				System.out.print(C[i] + " ");
			}
			System.out.println("");
		}
	}
}