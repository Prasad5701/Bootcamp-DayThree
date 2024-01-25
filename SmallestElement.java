package com.DayThree;

public class SmallestElement {
	public static void main(String[]args)
	{
		int [] arr = {7,2,3,15,4,5,18,6,5,3,7,8};
		int smallest = arr[0];
		for(int num : arr)
		{
			if(smallest>num)
			{
				smallest=num;
			}
			
		}
		System.out.println("Smallest " + smallest);
	}
}
