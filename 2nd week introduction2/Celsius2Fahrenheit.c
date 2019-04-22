#include <stdio.h>
int main(){
	printf("Celsius 35 is Fahrenheit degree \n");
	int a = (9/5)*35+32;
	float b = (9.0/5.0)*35+32;
	
	printf("%d\n", a);
	printf("%.2f", b);
	
	return 0;
}