#include <stdio.h>

int main(){
	
	int x, y, z;
	printf("Is the city a capital? (capital:1 non-capital:0) ");
	scanf("%d", &x);
	printf("Populatin? (in thousands) ");
	scanf("%d", &y);
	printf("Bourgeois? (in thousands) ");
	scanf("%d", &z);
	
	if((x && y >= 1000)||(z >= 500)){
		printf("Metropolis: True");
	}
	else{
		printf("Metropolis: False");
	}
	
	return 0;
	
}
