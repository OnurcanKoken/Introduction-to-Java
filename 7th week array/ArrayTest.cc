#include <stdio.h>

// C: typical way of array size definition 
// using "#define" (macro) constant
//#define ARRAY_SIZE	10

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
  // C++ recommends using constant integer instead of macro constant
  const int array_size = 10;

  // Array creation with initial values
  int A1[array_size];	// ok, no initial values
  int A2[array_size] = {1,2,3,4,5,6,7};	// ok, 7 values in 10 spaces
  int A3[]   = {1,2,3,4,5,6,7};	// ok, automatic size: 7 spaces

  // dynamic allocation, using pointers and memory allocation function
  //int B2[] = new int[10];
  // error: B2[] is constant pointer definition, so cannot assign
  // dynamically allocated memeory pointer
  int *B2 = new int[array_size];

  // [Q]: what value will be assigned when initial values are not given?
  //      in other words, what are the default values for arrays?
  // [A]: don't know. Sometimes 0, but not guaranteed

  print_int_array(A1,"A1",array_size);
  print_int_array(A2,"A2",array_size);
  print_int_array(A3,"A3",7);	// not array_size!!
  print_int_array(B2,"B2",array_size);

  delete[] B2;
}

