#include <stdio.h>
#include <math.h>

int main(){
	
	double x, y, z, t;
	
	x = atan(sin(32*M_PI/180)*cos(32*M_PI/180));
	printf("%lf\n",x);
	
	y = pow(exp(1.67)*pow(1.65,((log(8))/(log(20)))),0.25);
	printf("%lf\n",y);
	
	z = log(pow(21,log(35)))/log(7);
	printf("%lf\n",z);
	
	t = exp(sqrt(log(4))+sqrt(log(5)));
	printf("%lf\n",t);
	
	return 0;
}
