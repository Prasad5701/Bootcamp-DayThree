package com.DayThree;
import java.util.*;
public class FrequencyOfElement {
	public static void main(String[]args)
	{
		int [] arr = {7,1,9,1,2,3,3,4,5,1,6,5,3,7,8,9};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;i<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				
				}
			}
			System.out.println(arr[i]+ " = "+ count);
			
		}
		
	}

}
