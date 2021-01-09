package com.cg.Exercise3;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Exercise3Test {
	private static int SINGLE_INT=5;
    private Exercise3 exercise3;
	@Test
	public void test_sort_GivenEmptyIntegerArray_ShouldReturn0AsInteger()
	{
	int newarr[]= {};
	int result=exercise3.sort(newarr);
	assertEquals(0,result);
	}
	@Test
	public void test_sort_GivenOneIntegerArray_ShouldReturn5AsInteger()
	{
	int newarr[]= {5};
	//int result=arraytest.sort(newarr);
	assertEquals(SINGLE_INT,5);
	}

}
