public class Ex51.a{
	public static void main (String args[]){
		int n = 10;
		do{
			if (n<=0) break; // if n will be negative at the beginning
			System.out.println(n);
			n = n-3;
		}
		while(n>0); // end do while		
	}
}