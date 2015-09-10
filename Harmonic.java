/* Name:       Dan Wilder
 * Class:      CMP SCI 2261 - E01
 * Due Date:   22 September 2014
 */

import java.util.Scanner;

public class Harmonic {
  public static void main(String[] args) {
	int n;    // n terms of harmonic
	float sum = 0;  // running total
    Scanner in = new Scanner(System.in);
    
    // Prompt user for input:
    System.out.println("Preparing to sum the first n terms for harmonic...\n");
    System.out.print("  Please enter a value for n ==> ");
    n = in.nextInt();    // Receive input from user 
    
    // Sum n terms of harmonic from left to right
    for (int i = 1; i < n; i++) {
      sum += (1/(float)i);
    }
    
    System.out.println("\n\nSum of n terms (left to right): " + sum);
    
    // Sum n terms of harmonic from left to right
    sum = 0;
    for (int i = n; i > 0; i--) {
      sum += (1/(float)i);
    }
    
    System.out.println("\n\nSum of n terms (right to left): " + sum);    
    in.close();
  }
}
