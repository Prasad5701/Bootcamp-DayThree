package com.DayThree;

public class MaxMinElement {
	
	public static void main(String[]args)
	{
		int [] a = {34,5,45,65,23,2,23,42,10};
		int max = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Max Element of Array : "+max);
		
		int min =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Max Element of Array : "+min);
	}

}
