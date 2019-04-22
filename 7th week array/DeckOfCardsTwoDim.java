public class DeckOfCardsTwoDim {
	public static void main(String[] args){
		int deck[][] = new int[4][13]; 
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; 
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		// Initialize cards 
		int c = 0;
		for(int i = 0; i<4; i++){
			for(int j = 0; j<13; j++){
				deck[i][j] = c; c++;
			}
		}
		
		// Shuffle the cards 
		for(int i = 0; i<4; i++){
			for(int j = 0; j<13; j++){
				int row = (int)(Math.random() * 4);
				int column = (int)(Math.random() * 13);
				int temp = deck[i][j];
				deck[i][j] = deck[row][column];
				deck[row][column] = temp;
			}
		}
		
		// Display the first four cards 
		for(int i = 0; i<4; i++){
			String suit = suits[deck[i][3] / 13]; // 0 1 2 3
			String rank = ranks[deck[i][3] % 13]; // 0 1 ... 11 12
			System.out.println("Card number " + deck[i][3] + ": " + rank + " of " + suit); 
		}
		
		// this one has 13x4 dimention
		int deck[][] = new int[13][4]; 
		
		// Initialize cards 
		int c = 0;
		for(int i = 0; i<13; i++){
			for(int j = 0; j<4; j++){
				deck[i][j] = c; c++;
			}
		}
		
		// Shuffle the cards 
		for(int i = 0; i<13; i++){
			for(int j = 0; j<4; j++){
				int row = (int)(Math.random() * 13);
				int column = (int)(Math.random() * 4);
				int temp = deck[i][j];
				deck[i][j] = deck[row][column];
				deck[row][column] = temp;
			}
		}
	}
}