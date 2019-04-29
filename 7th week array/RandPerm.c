/*
 Ex 7-5: Random Permutation
 Objective: Write Java and C programs that
 1. Generates a random permutation of 1...n where n is given
 2. Your program should use a boolean (or int in C) array
    to check if the number is generated or not
 3. All the arrays should by dynamically-sized
    (use "new" in Java, and "malloc" in C)
 Submission: RandPerm.java, RandPerm.c

$ java RandPerm
n?  9
9 1 6 3 2 5 7 8 4
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
  int rv;
  int n, count;
  short *is_generated;	// to save the space, use 2 byte short

  // set random time seed
  srand((unsigned) time(NULL));

  printf("n? ");
  scanf("%d",&n);

  is_generated = (short*)malloc(sizeof(short)*n);
  for (count=0; count < n; count++) {
    // in C, newly allocated array's values are undefined
    // so we should initialize manually
    is_generated[count] = 0;
  }

  for (count=0; count < n; ) {
    rv = rand() % n;	// 0...n-1
    if ( !is_generated[rv] ) {
      is_generated[rv] = 1;
      printf("%d ",(rv+1));
      count++;	// increase the number of generated values
    }
  }
  printf("\n");
  free(is_generated);
}
