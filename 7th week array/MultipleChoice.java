public class MultipleChoice{
  public static void main(String args[]) {

    char key[] = {'D','B','D','C','C','D','A','E','A','D'};
	
	int correct[] = {0,0,0,0,0,0,0,0,0,0}; // # of correct answer
	
	char StudentAnswer [][] = {
		{'A','B','A','C','C','D','E','E','A','D'},
		{'D','B','A','B','C','A','E','E','A','D'},
		{'E','D','D','A','C','B','E','E','A','D'},
		{'C','B','A','E','D','C','E','E','A','D'},
		{'A','B','D','C','C','D','E','E','A','D'},
		{'B','B','E','C','C','D','E','E','A','D'},
		{'B','B','A','C','C','D','E','E','A','D'},
		{'E','B','E','C','C','D','E','E','A','D'},
	};
	for(int i = 0; i < StudentAnswer.length; i++){
		for(int j = 0; j < StudentAnswer[i].length; j++){
			if(key[j]==StudentAnswer[i][j]) // correct
				correct[i] = correct[i] + 1;
		}
		System.out.println("Student " + i + " correct answer number is: " + correct[i]);
	}
  }
}

