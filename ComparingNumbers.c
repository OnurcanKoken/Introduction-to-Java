#include <stdio.h>

void print_boolean_ln(int b);

int main(){
	
	char aByte = 'a';
	short aShort = -9025;
	int anInt = 50000;
	
	long long aLong = 809230972398749L;
	float aFloat = 5.0F;
	double aDouble = 3.1415926535897;
	char char1 = 'A', char2 = 'B', char3 = 'a';
	
	int x;
	
	printf("Compare long   & float: ");
	print_boolean_ln(aLong == aFloat);
	
	printf("\nCompare byte   & int  : ");
	print_boolean_ln(aByte <= anInt);
	
	printf("\nCompare double & short: ");
	print_boolean_ln(aDouble != aShort);
	
	printf("\nCompare char1  & char3: ");
	print_boolean_ln(char1 == char3);
	
	printf("\nCompare char3  & char2: ");
	print_boolean_ln(char3 < char2);
	
	long long expr = 15%4*7+15>=1||7<12||!(-8!=7&&7<=10&&5>7);
	printf("\nValue of long expression: ");
	print_boolean_ln(expr);
	
	return 0;
}

void print_boolean_ln(int b){
	
	if (b!=0){
		printf("true ");
	}
	else{
		printf("false ");
	}
	
}
