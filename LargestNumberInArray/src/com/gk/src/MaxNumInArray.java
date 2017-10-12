package com.gk.src;

import java.util.Arrays;

public class MaxNumInArray {

	public MaxNumInArray() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxNumInArray maxNumInArray = new MaxNumInArray();
		
		int inputNumbers[] = new int[]{2,38,4,56,93};
		int maxNum=-1;
		try
		{
			maxNum = maxNumInArray.getMaxNumber(inputNumbers);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured !! " + e.getMessage());
		}
		System.out.println("INput " + Arrays.toString(inputNumbers));
		System.out.println("Max Number " + maxNum);
	}
	
	public int getMaxNumber(int []inputNumbers) throws Exception
	{
		if(inputNumbers == null || inputNumbers.length == 0)
		{
			throw new Exception("Input array is either null or empty");
		}
		int maxNum = inputNumbers[0];
		for(int num : inputNumbers)
		{
			if(num >= maxNum)
				maxNum=num;
		}
		return maxNum;
	}

}
