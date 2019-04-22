#include <stdio.h> 
#include <stdlib.h> 
#include <time.h> 

int main(void){ 
    
    srand(time(NULL));
    int i; int n; int iTemp; int j;
    
    printf("n? ");
  	scanf("%d",&n);
    
    while(n>0){
    	
    	int A[n];
    	
    	// random number generation
    	for(i = 0; i<n; i++){
    		A[i] = rand()%9 + 1;
		}
		
		// sorting part
		iTemp = 1;
		for (i = 0; i < n; i++){
    		for (j = i + 1; j <= n; j++){
        		if (A[j] < A[i]){
            		iTemp = A[i];
            		A[i] = A[j];
            		A[j] = iTemp;
        		}
    		}
		}
		
		// displaying the array
		for(i = 0; i<n; i++){
        	printf("%d ", A[i]);
		}
		printf("\n");
		
    	printf("n? ");
  		scanf("%d",&n);
    	
	}
	
    return 0; 
} 
