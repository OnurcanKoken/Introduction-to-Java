#include <stdio.h>
int main(){
	
	double radius;
	double area;
	printf("Enter the radius: ");
	scanf("%lf", &radius);
	
	area = 3.14 * radius * radius;
	
	printf("Area = ");
	printf("%.4lf\n", area);
	printf("Area = %.6lf\n", area);
	printf("Area = %.4lf\n", area);	
	
	return 0;
}
