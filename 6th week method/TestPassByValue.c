#include <stdio.h>

int swap(int num1, int num2); /* funtion declaration */

int main(){
	
	int num1 = 1; int num2 = 2;
	printf("Before invoking swap, num1 is %d and num2 is %d \n", num1, num2);
	swap(num1, num2);
	printf("After invoking swap, num1 is %d and num2 is %d \n", num1, num2);
	
	return 0;
}

int swap(int n1, int n2){ 
	
	printf("\tBefore swapping, n1 is %d and n2 is %d \n", n1, n2);
	// swap n1 with n2
	int temp = n1; n1 = n2; n2 = temp;
	printf("\tAfter swapping, n1 is %d and n2 is %d \n", n1, n2);
	
	return 0;
}
