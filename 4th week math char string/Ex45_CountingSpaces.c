#include <stdio.h>
#include <math.h>

int main(){
	
	char str[60];
	int i = 0; int j = 0;
	int num_spaces = 0;
	
	printf("Enter a line: ");
	fgets(str, 60, stdin);
	
	for(j = 0; str[j]!='\0';++j);
	
	for(i = 0; i<j; i++){
		if(str[i] == ' '){
			num_spaces++;
		}
	}
	
	printf("Number of spaces: %d", num_spaces);	
	
	return 0;
}
