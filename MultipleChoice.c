#include <stdio.h>
 
int main () {

   /* an array with 8 rows and 10 columns*/
   char a[8][10] = {
   		{'A','B','A','C','C','D','E','E','A','D'},
		{'D','B','A','B','C','A','E','E','A','D'},
		{'E','D','D','A','C','B','E','E','A','D'},
		{'C','B','A','E','D','C','E','E','A','D'},
		{'A','B','D','C','C','D','E','E','A','D'},
		{'B','B','E','C','C','D','E','E','A','D'},
		{'B','B','A','C','C','D','E','E','A','D'},
		{'E','B','E','C','C','D','E','E','A','D'}};
   int i, j;
 
   char key[10] = {'D','B','D','C','C','D','A','E','A','D'};
   int correct[8] = {0,0,0,0,0,0,0,0};
   
   for ( i = 0; i < 8; i++ ) {
      for ( j = 0; j < 10; j++ ) {
         if(key[j] == a[i][j]){
         	correct[i] += 1;
		 }
      }
   }
   
   for ( i = 0; i < 8; i++ ) {
        printf("Student %d correct answer number is: %d\n", i, correct[i]);
    }
   
   
   return 0;
}
