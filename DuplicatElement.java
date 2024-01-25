package com.DayThree;
import java.util.*;
public class DuplicatElement {
	public static void main(String[]args)
	{
		int [] arr = {7,1,9,2,3,4,5,1,6,5,3,7,8};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
					
					
				}
			}
		}
	}

}
