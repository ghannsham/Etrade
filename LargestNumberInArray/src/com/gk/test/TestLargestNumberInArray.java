package com.gk.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gk.src.MaxNumInArray;

public class TestLargestNumberInArray {

	MaxNumInArray objMaxNum = new MaxNumInArray();
	@Test
	public void test_getMaxNumber_success() throws Exception {
		int inputArray[] = new int[]{40,5,-3,909,768,26,-676,989,234,345};
		int expectedNum = 989;
		assertEquals(expectedNum, objMaxNum.getMaxNumber(inputArray));
	}

	@Test
	public void test_getMaxNumber_NegativeNumbers() throws Exception {
		int inputArray[] = new int[]{-40,-5,-3,-768,-26,-676,-989,-234,-345};
		int expectedNum = -3;
		assertEquals(expectedNum, objMaxNum.getMaxNumber(inputArray));
	}
	@Test
	public void test_getMaxNumber_OneElementInArray() throws Exception {
		int inputArray[] = new int[]{40};
		int expectedNum = 40;
		assertEquals(expectedNum, objMaxNum.getMaxNumber(inputArray));
	}
	
	@Test(expected=Exception.class)
	public void test_getMaxNumber_emptyArray() throws Exception {
		int inputArray[] = new int[]{};
		int expectedNum = -1;
		assertEquals(expectedNum, objMaxNum.getMaxNumber(inputArray));
	}
	
	@Test(expected=Exception.class)
	public void test_getMaxNumber_NullArray() throws Exception {
		int expectedNum = -1;
		assertEquals(expectedNum, objMaxNum.getMaxNumber(null));
	}
}
