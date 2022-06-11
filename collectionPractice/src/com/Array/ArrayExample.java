package com.Array;

public class ArrayExample {
	public static void main(String[] args) {
		int sum=0;
		int[] a = { 11, 22, 4, 13, 6 };
		for (int i = 0; i < a.length; i++) 
		{
			for(int j=0;j<a.length;j++)
			{
				if(i != j)
				{
					sum=sum + a[j];
				}
			}
			System.out.print(sum+" ");
			sum=0;
		}
	}
}