/**
 *  Create a method that accepts a character array 
 *  and count the number of times each character is present in the array.
 */
package prob2;

import java.util.Map;

public class prob2main
{
public static void main(String args[])
{
	prob2serimpl p=new prob2serimpl();
	char[] arr= {'a','b','c','d','a','c'};
	Map a=p.getCount(arr);
	System.out.println(a);
}
}
