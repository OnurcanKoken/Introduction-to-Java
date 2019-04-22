#include <stdio.h>
#include <stdlib.h>	// for malloc

// C: typical way of array size definition 
// using "#define" (macro) constant
#define ARRAY_SIZE	10

void print_int_array(const int A[], const char array_name[], int size)
{
  int i;  // C: variable definition usually in the beginning of functions

  // A.length does not work.
  // The size of the array should be handled by programmers
  // Programmer should be aware of the array size using variables or constants
  fprintf(stdout,"%s: ",array_name);
  for (i=0; i<size; i++) fprintf(stdout,"%d ",A[i]);
  fprintf(stdout,"\n");
}

int main()
{
  // Array creation with initial values
  int A1[ARRAY_SIZE];	// ok, no initial values
  int A2[ARRAY_SIZE] = {1,2,3,4,5,6,7};	// ok, 7 values in 10 spaces
  int A3[]   = {1,2,3,4,5,6,7};	// ok, automatic size: 7 spaces
  //int A4[2]  = {1,2,3};  // (runtime) size error

  // dynamic allocation, using pointers and memory allocation function
  //int B2[] = (int*) malloc(sizeof(int)*ARRAY_SIZE);
  // error: B2[] is constant pointer definition, so cannot assign
  // dynamically allocated memeory pointer
  int *B2 = (int*) malloc(sizeof(int)*ARRAY_SIZE);
  //int *B3 = {1,2,3};  // error: not compatible

  // [Q]: what value will be assigned when initial values are not given?
  //      in other words, what are the default values for arrays?
  // [A]: don't know. Sometimes 0, but not guaranteed

  print_int_array(A1,"A1",ARRAY_SIZE);
  print_int_array(A2,"A2",ARRAY_SIZE);
  print_int_array(A3,"A3",7);	// not ARRAY_SIZE
  print_int_array(B2,"B2",ARRAY_SIZE);

  free(B2);
}

