#include <stdio.h>
#include <math.h>

int main(){
	
	double ab = 4;
	double ac = 3;
	double bc = sqrt(ab*ab+ac*ac);
	
	/* compute radian */
	double a = (acos((ac*ac-ab*ab-bc*bc)/(-2*bc*ab)));
	double b = (acos((ab*ab-bc*bc-ac*ac)/(-2*bc*ac)));
	
	/* compute angle */
	double A = a*180.0/M_PI;
	double B = b*180.0/M_PI;
	
	/* display results */
	printf("alpha = %.2lf radians, %.1lf degrees\n", a, A);
	printf("beta = %.2lf radians, %.1lf degrees", b, B);
	
	return 0;
}
