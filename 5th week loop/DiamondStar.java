import java.util.Scanner;

public class DiamondStar{
	public static void main(String[] args){
		int n, m;
		int x = 0; int y = 0; int i = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many lines? ");
		n = sc.nextInt();
		
		int ctr = (n/2)+1;
		for(y = 1; y<=ctr; y++){
			for(x = ctr; x>y; x--){
				System.out.printf(" ");
			}
			for(i = 1; i<=(2*y-1); i++){
				System.out.printf("*");
			}
			System.out.println("");
		} // end of for1
		for(y = ctr; y>=1; y--){
			for(x = ctr; x>y; x--){
				System.out.printf(" ");
			}
			if(n%2!=0 && y == ctr) continue;
			for(i = 1; i<=(2*y-1); i++){
				System.out.printf("*");
			}
			System.out.println("");
		} // end of for2
	}
}