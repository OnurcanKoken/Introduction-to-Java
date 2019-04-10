import java.util.Scanner;
public class VariableNameRandomGen{
	
	public static void main(String args[]){
		int n, r;  char chr = 'a';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Length of the variable? ");
		n = sc.nextInt();
		
		for(int i = 0; i<n;i++){ 
						
			r = (int)(Math.random()*4+1); /* generate random value between 1-5 */
			switch(r){
				case 1:
					chr = getRandomLowerCaseLetter();
					break;
				
				case 2:
					chr = getRandomUpperCaseLetter();
					break;
				
				case 3:
					chr = getDigitCharacter();
					break;
				
				case 4:
					if ((int)(Math.random()*2+1) == 1) chr = '_';
					else chr = '$';
					break;
				
				default: // do not do any operation
					break;
				
			}
			
			if((i+1)%n==0) System.out.println(chr);
			else System.out.print(chr);
		}
	}
	
	public static char getRandomCharacter(char ch1, char ch2){
		return (char)(ch1 + Math.random()*(ch2 - ch1 + 1));
	}
	
	/** Genetare a random lowercase letter */
	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a','z');
	}
	
	/** Generate a random uppercase letter */
	public static char getRandomUpperCaseLetter(){
		return getRandomCharacter('A','Z');
	}
	
	/** Generate a random digit character */
	public static char getDigitCharacter(){
		return getRandomCharacter('0','9');
	}
	
	/** This fuction can be used for generation character between '_' and '$' 
	public static char getRandomOtherCharacters(){
		return getRandomCharacter('_','$');
	} */
} // end of class