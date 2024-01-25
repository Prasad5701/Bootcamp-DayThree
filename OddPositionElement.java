package com.DayThree;

public class OddPositionElement {
	public static void main(String[]args)
	{
		int [] arr = {7,2,3,15,4,5,18,6,5,3,7,8};
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
