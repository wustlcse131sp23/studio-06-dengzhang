package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {
	public static void main(String[]args) {
	
		System.out.println();
	}
	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
		if(n==0) {
			return 0;
		}else if(n==1){
			return 0.5;
		}else {
			return Math.pow(0.5, n)+geometricSum(n-1);	
		}
		
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
		if(p%q==0) {
			return q;
		}else {
			return gcd(q,p%q);
		}
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
		int[] reversed = new int[array.length];
		int lastIndex = array.length - 1;
		int i;
		int mirrorIndex;
		if(array.length==0) {
			 return new int[0];
		}else if(array.length==1) {
			return array;
		} 
		return helper(array,0);
		}
		
		if(i==n)
		   {
		     return new int[0];
		   } 
		   else
		   {
			   toReversed(int[] array);
		   }
		//we know the gist of it

		
	}
	public static int[] helper(int[]array, int index) {
		if(index>=array.length/2) {
			return array;
		}else {
		reversed[index]=array[array.length-1-index];	
		}
		index++;
		return reversed;
		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
