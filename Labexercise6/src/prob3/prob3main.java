/*
 *  Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap
 */
package prob3;

import java.util.Map;

import prob2.prob2serimpl;

public class prob3main {

	public static void main(String[] args)
	{
		prob3serimpl p=new prob3serimpl();
		int[] arr= {1,2,3,4};
		Map a=p.getSquares(arr);
		System.out.println(a);

	}

}
