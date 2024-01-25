package com.DayThree;
import java.util.*;
public class LinearSearch {
	public static void main(String[]args) {
		
		int arr []=new int[5];
		int key;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Element of Array ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter a Key ");
		key = sc.nextInt();
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				System.out.println("Key Found "+arr[i]);
				
			}
			
		}
		
		
}

}
