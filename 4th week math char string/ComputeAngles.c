#include <stdio.h>
#include <math.h>

int main(){
	
	double x1, x2, x3, y1, y2, y3;
	/* promt the user to enter three points */
	printf("Enter three points: ");
	scanf("%lf",&x1); scanf("%lf",&y1);
	scanf("%lf",&x2); scanf("%lf",&y2);
	scanf("%lf",&x3); scanf("%lf",&y3);
	
	/* compute three sides */
	double a = sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
	double b = sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
	double c = sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	
	/* compute three angles */
	double A = (acos((a*a-b*b-c*c)/(-2*b*c)))*180.0/M_PI;
	double B = (acos((b*b-a*a-c*c)/(-2*a*c)))*180.0/M_PI;
	double C = (acos((c*c-b*b-a*a)/(-2*a*b)))*180.0/M_PI;
	
	/* display results */
	printf("The three angles are %.2lf %.2lf %.2lf", A, B, C);
	
	return 0;
}
