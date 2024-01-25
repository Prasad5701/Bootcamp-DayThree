package com.DayThree;
import java.util.*;
public class LargestElement {
	
	public static void main(String[]args)
	{
		int [] arr = {7,1,1,2,3,15,4,5,18,6,5,3,7,8};
		int highest = arr[0];
		for(int j=0;j<arr.length;j++)
		{
			
				if(highest<arr[j])
				{
					highest =arr[j];
					
				}
			
		}
		System.out.println("Highest "+highest);
	}

}
