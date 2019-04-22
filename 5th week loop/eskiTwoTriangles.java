import java.util.Scanner;

public class eskiTwoTriangles{
	public static void main(String[] args){
		int n, m;
		int x = 0; int y = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many lines? ");
		n = sc.nextInt();
		
		int ctr = (n/2)+1;
		for(y = 1; y<=ctr-1; y++){
			for(x = 1; x<=y; x++)	
				System.out.printf("*");
			System.out.println("");
		} // end for1
		for(y = ctr-1; y>=1; y--){
			for(x = 0; x<(ctr-y-1); x++)	
				System.out.printf(" ");
			if(n%2!=0 && y == ctr) continue;
			for(m = 1; m<=y; m++)	
				System.out.printf("*");
			System.out.println("");
		} // end for2
	}
}