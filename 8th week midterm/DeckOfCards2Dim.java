public class DeckOfCards2Dim {
	public static void main(String[] args){
		
		int deck[][] = new int[13][4]; 
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; 
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		// Initialize cards 
		int c = 0;
		for(int i = 0; i<deck.length; i++){
			for(int j = 0; j<deck[i].length; j++){
				deck[i][j] = c; c++;
			}
		}
		
		// Shuffle the cards 
		for(int i = 0; i<deck.length; i++){
			for(int j = 0; j<deck[i].length; j++){
				int row = (int)(Math.random() * 13);
				int column = (int)(Math.random() * 4);
				int temp = deck[i][j];
				deck[i][j] = deck[row][column];
				deck[row][column] = temp;
			}
		}
		
		/* Displaying the cards randomly
		for (int i = 0; i < 4; i++) { 
			int j = (int)(Math.random()*4); 
			String suit = suits[deck[i][j] / 13]; // 0 1 2 3
			String rank = ranks[deck[i][j] % 13]; // 0 1 ... 11 12
			System.out.println("Card number " + deck[i][j] + ": " + rank + " of " + suit); 
		} */
		
		// Display the first four cards 
		for (int i = 0; i < 4; i++) { 
			String suit = suits[deck[0][i] / 13]; // 0 1 2 3
			String rank = ranks[deck[0][i] % 13]; // 0 1 ... 11 12
			System.out.println("Card number " + deck[0][i] + ": " + rank + " of " + suit); 
		}
		
	}
}