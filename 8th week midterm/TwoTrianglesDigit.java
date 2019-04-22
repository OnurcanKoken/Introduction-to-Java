import java.util.Scanner;

public class TwoTrianglesDigit{
	public static void main(String[] args){
		int n, m;
		int x = 0; int y = 0; int i = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many lines? ");
		n = sc.nextInt();
		
		int ctr = n/2 + 1;
		
		if(n%2 == 0) ctr -= 1;		
		for(x = 1; x<=ctr; x++){
			for(y = 1; y <= x; y++){
				i = i%9 + 1;
				System.out.print(i);
			}
			System.out.println("");
		}
		if(n%2 == 0){
			for(y = 1; y < x; y++){
				i = i%9 + 1;
				System.out.print(i);
			}
			System.out.println("");
		}
		for(x = ctr; x>=1; x--){
			for(m = 1; m<=(ctr - x) + 1; m++)
				System.out.print(" ");
			for(y = x - 1; y>=1; y--){
				i = i%9 + 1;
				System.out.print(i);
			}
			System.out.println("");
		
		}	
	}
}