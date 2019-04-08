#include <stdio.h>
#include <string.h>

void print_boolean_ln(int b);
int strcicmp(char const *a, char const *b);

int main(){
	
	char string1[20] = "aardvarks";
	char string2[20] = "boa constrictors";
	char string3[20] = "aardvarks";
	char string4[20] = "Aardvarks";
	char string5[20] = "aardvarks are cooler";
	
	print_boolean_ln(strcmp(string1, string2));
	print_boolean_ln(strcmp(string1, string3));
	print_boolean_ln(strcmp(string1, string4));
	print_boolean_ln(strcicmp(string1, string4));
	print_boolean_ln(strcmp(string1, string5));
	
	return 0;
	
}

void print_boolean_ln(int b){
	
	if (b==0){
		printf("true ");
	}
	else{
		printf("false ");
	}
	
}

int strcicmp(char const *a, char const *b){
	for(;;a++,b++){
		int d = tolower((unsigned char)*a)-tolower((unsigned char)*b);
		if(d!=0||!*a)
			return d;
	}
}
