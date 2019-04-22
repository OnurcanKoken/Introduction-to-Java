public class CountingCharacters{
	/* I have generated 100 random characters of digits,
	lowercase, and uppercases but I didnt do this part: sum of three numbers should be 100
	I couldnt understand what I need to do exactly	*/
	public static void main(String args[]){
		int n, r;  char chr = 'a'; int sum = 0; int total = 0;
		
		n = 100;
		char C[];
		C = new char[n];
		
		for(int i = 0; i<n;i++){ 
						
			r = (int)(Math.random()*3+1); /* generate random value between 1-3 */
			switch(r){
				case 1:
					C[i] = getRandomLowerCaseLetter();
					break;
				
				case 2:
					C[i] = getRandomUpperCaseLetter();
					break;
				
				case 3:
					C[i] = getDigitCharacter();
					break;
				
				default: // do not do any operation
					break;
			}
			
			sum = sum + (int)C[i];
			System.out.print(sum);
			System.out.println(" " + C[i]);
			
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
	
} // end of class