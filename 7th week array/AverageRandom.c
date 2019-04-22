#include <stdio.h> 
#include <stdlib.h> 
#include<time.h> 

int main(void){ 
    
    srand(time(0));
    int i; int n; double sum = 0; double average; int above = 0;
  
  	printf("n? ");
  	scanf("%d",&n);
  	
  	int A[n];
  	
    for(i = 0; i<n; i++){
    	A[i] = rand()%9 + 1;
        printf("%d ", A[i]);
        sum = sum + A[i];
	}
	printf("\n");
	average = sum/n;
	printf("Average = %f\n", average);
	
	for(i = 0; i<n; i++){
        if(A[i]>average){
        	above += 1;
		}
	}
	
	printf("Number of values above the average = %d", above);
	
    return 0; 
} 
