package com.DayThree;
import java.util.*;
public class ReverseArray {
	
	public static void main(String[]args)
	{
		int [] arr = {7,2,3,15,4,5,18,6,5,3,7,8};
		int [] newArr = new int[arr.length];
		int indx=0;
		for(int i =arr.length-1;i>=0;i--)
		{
			newArr[indx++]=arr[i];
	}
		System.out.println(Arrays.toString(newArr));
	
		
		
			
			
		
		
		
	}

}
