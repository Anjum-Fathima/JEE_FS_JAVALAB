/**
 * Exercise 1: Create a method which accepts a hash map and return
 *  the values of the map in sorted order as a List.
 */
package prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Prob1main 
{
	public static void main(String args[])
	{
		prob1serviceimpl p=new prob1serviceimpl();
		List vals=p.getValues();
		System.out.println(vals);
		}
		
	}


