public class Constant{
	public static void main (String args[]){
		// integer constant example
		final int x = 100; // named constant for 1st integer
		final int y = 200; // named constant for 2nd integer
		int sum; // variable for sum of two integers
		
		sum = x+y;
		System.out.println(sum);
		
		final String str_x = "100"; // named constant for string 1
		final String str_y = "200"; // named constant for string 2
		String str_sum; // string variable for sum of two integers
		
		str_sum = str_x + str_y;
		System.out.println(str_sum);
	}
}