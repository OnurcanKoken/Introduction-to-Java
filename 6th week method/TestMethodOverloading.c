#include <stdio.h>

/* funtion declaration */
int max(int num1, int num2);
double max2Double(double num1, double num2);
double max3Double(double num1, double num2, double num3);

int main(){
	
	int num1 = 1; int num2 = 2;
	printf("max(3, 4) = %d \n", max(3, 4));
	printf("max(3.0, 5.4) = %.1lf \n", max2Double(3.0, 5.4));
	printf("max(3.0, 5.4, 10.14) = %.2lf \n", max3Double(3.0, 5.4, 10.14));
	
	return 0;
}

int max(int num1, int num2){
	
	if(num1>num2) return num1;
	else return num2;
} // end int max 

double max2Double(double num1, double num2){
	
	if(num1>num2) return num1;
	else return num2;
} // end double max for 2 variable

double max3Double(double num1, double num2, double num3){
	
	return max2Double(max2Double(num1, num2), num3);
	
}// end double max for 3 variable
