#include <stdio.h>
#include <time.h>

int main(){
	
	srand(time(0));
	int i, x, both, hold1, hold2;
	int found1 = 0; int found2 = 0;
	
	for(i = 0; ;i++){
		
		x = (rand()%10)-(rand()%19);
		
		if(x==9){
			printf("Found 9 at %d\n",i);
			if(found1 == 0){
				hold1 = i;
			}
			found1 = 1; /* 9 has been found */
			
			if(found2 == 1){
				both = 1; /* both has been found */
			}
		}
		if(x==(-18)){
			printf("Found -18 at %d\n",i);
			if(found2 == 0){
				hold2 = i;
			}
			found2 = 1; /* -18 has been found */
			
			if(found1 == 1){
				both = 1; /* both has been found */
			}
		}
		if(both==1){
			break;
		}
	} // end for
	
	printf("The first appearance of -18 was at %d\n", hold2);
	printf("The first appearance of 9 was at %d\n", hold1);
	
	return 0;
}
