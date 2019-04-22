import java.util.Scanner;
public class SortedRandomDescending{
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
			}
			java.util.Arrays.sort(C);
			
			int t = C.length/2;
			for(int i = 0; i<t; i++){
				int temp = C[i];
				C[i] = C[C.length-i-1];
				C[C.length-i-1] = temp;
			}			
			
			for(int i = 0; i<n; i++){
				System.out.print(C[i] + " ");
			}
			System.out.println("");
		}
	}
}