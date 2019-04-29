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

import java.util.Scanner;

public class RandPerm {
  public static void main(String args[]) {
    Scanner sc;
    int rv;
    int n, count;
    boolean is_generated[];

    System.out.print("n? ");
    sc = new Scanner(System.in);
    n = sc.nextInt();

    is_generated = new boolean[n];
    for (count=0; count < n; count++) {
      // although we already know that the initial values of the arrays
      // in java are all zero (false for boolean),
      // it is desirable to make sure by filling in false initially
      is_generated[count] = false;
    }
    for (count=0; count < n; ) {
      rv = (int)(Math.random() * n);	// 0...n-1
      if ( !is_generated[rv] ) {
	is_generated[rv] = true;
	System.out.print((rv+1) + " ");
	count++;	// increase the number of generated values
      }
    }
    System.out.println("");
  }
}
