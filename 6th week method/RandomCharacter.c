#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/* funtion declaration */
char* getRandomCharacterBetween(); // between ch1 and ch2
char* getRandomLowerCaseLetter(); // lowercase letter
char* getRandomUpperCaseLetter(); // uppercase letter
char* getRandomDigitCharacter(); // digit character
char* getRandomCharacter(); // random character


int main(){
	
	int num1 = 1; int num2 = 2; int i = 0;	
	int number_of_chars = 175; int chars_per_line = 25;
	
	srand(time(NULL));
	
	for(i = 0; i<number_of_chars; i++){
		
		if((i+1)%chars_per_line == 0) printf("%c \n", getRandomLowerCaseLetter());
		else printf("%c", getRandomLowerCaseLetter());	
	}
	return 0;
} // end main

char* getRandomCharacterBetween(){
	
	char ch1 = 'k'; char ch2 = 'c'; // as an example
	char difference = ch1 - ch2;
	
	char randomletter = ch1 + (rand() % difference+1);
	return randomletter;
	
}

char* getRandomLowerCaseLetter(){
	
	char randomletter = 'a' + (rand() % 26);
	return randomletter;
	
}

char* getRandomUpperCaseLetter(){
	
	char randomletter = 'A' + (rand() % 26);
	return randomletter;
	
}

char* getRandomDigitCharacter(){
	
	char randomletter = '0' + (rand() % 10);
	return randomletter;
	
}

char* getRandomCharacter(){
	
	char randomletter = rand() % 129; // after 129 they can not be display
	return randomletter;
	
}
