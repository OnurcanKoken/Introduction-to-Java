public class LCM{
	public static void main(String[] args){
		int r, holdx, holdy, g, lcm;
		int i = 0; int j = 0;
		int x = 0; int y = 0;
		
		// holdx = x; holdy = y;
		
		System.out.print("     |");
		for(i = 20; i<30; i++){System.out.printf("%5d",i);}
		System.out.println("");
		for(i = 1; i<6; i++){System.out.printf("-",i);}
		System.out.printf("+");
		for(i = 6; i<56; i++){System.out.printf("-",i);}
		for(i = 10; i<20; i++){
			x = i;
			System.out.println("");
			System.out.printf("%3d",x);
			System.out.printf("  |");
			holdx = x;
			for(j = 20; j<30; j++){
				y = j; holdy = y; x = i;
				if(x<y){
					r = x; x = y; y = r;
				}
				while(y!=0){
					r = x%y; x = y; y = r;
				}
				g = x; // the greatest common divisor
				lcm = holdx*holdy/g;
				System.out.printf("%5d",lcm);
			}
		}
	} // end of main
}