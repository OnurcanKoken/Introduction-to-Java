import java.util.Scanner;

public class Ex45_CountingSpaces{
	public static void main(String[] args){
		
		int num_spaces = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a line ");
		String s = input.nextLine();
		
		for(int i = 0; i<s.length(); i++)
			if (s.charAt(i) == ' ') num_spaces++;
		System.out.printf("Number of spaces: " + num_spaces);
		
	}
}