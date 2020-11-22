package com.rajbhavsar.final450.array;

import java.util.Arrays;


public class ReverseArrayProb1
{
	public static void main(String[] args)
	{
		int[] ints = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(reverseArray(ints)));
		System.out.println(Arrays.toString(reverseArrayWithoutExtraMem(ints)));
	}

	public static int[] reverseArray(final int[] array)
	{
		int[] reversedArray= new int[array.length];
		int i = array.length-1;
		for (int x:array)
		{
			reversedArray[i] = x;
			i--;
		}
		return reversedArray;
	}

	public static int[] reverseArrayWithoutExtraMem(final int[] array)
	{
		int start = 0;
		int end = array.length-1;
		int temp;
		while (start <= end)
		{
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		return array;
	}
}
