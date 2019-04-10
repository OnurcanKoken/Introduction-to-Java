#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/* funtion declaration */
char getRandomLowerCaseLetter(); // lowercase letter
char getRandomUpperCaseLetter(); // uppercase letter
char getRandomDigitCharacter(); // digit character
// char getRandomCharacter(); // random character if it will be needed

int main(){
	
	int i = 0;	int r, n; char chr[] = "";
	srand(time(NULL));
	
	printf("Length of the variable? ");
	scanf("%d",&n);
	
	for(i = 0; i<n; i++){
		
		r = rand()%4 + 1;
		
		switch(r){
			case 1:
				chr[0] = getRandomLowerCaseLetter();
				break;
			case 2:
				chr[0] = getRandomUpperCaseLetter();
				break;
			case 3:
				chr[0] = getRandomDigitCharacter();
				break;
			case 4:
				if((i+1)%n == 0) printf("_");
				else printf("_");
				break;
			default: // for any case
				chr[0] = "a";
				break;
		}
		if(r == 4) continue;
		if((i+1)%n == 0) printf("%c \n", chr[0]);
		else printf("%c", chr[0]);	
	}
	return 0;
} // end main

char getRandomLowerCaseLetter(){
	
	char randomletter = 'a' + (rand() % 26);
	return randomletter;
	
}

char getRandomUpperCaseLetter(){
	
	char randomletter = 'A' + (rand() % 26);
	return randomletter;
	
}

char getRandomDigitCharacter(){
	
	char randomletter = '0' + (rand() % 10);
	return randomletter;
	
}
/* this function can be used for random variable generation
char getRandomCharacter(){
	
	char randomletter = rand() % 129; // after 129 they can not be display
	return randomletter;
	
} */
