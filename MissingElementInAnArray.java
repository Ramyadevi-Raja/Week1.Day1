package week1.Day2.Assignments;

import java.util.Arrays;

public class MissingElementInAnArray 
{
public static void main(String[] args) 
{
	int[] array = {1,6,3,4,2,5,8};
	Arrays.sort(array); 
	System.out.println("sorted arrays");
	for(int i=0; i<=array.length-1;i++)
	{
		System.out.println(array[i]);
	}
	//find missing elements
	for(int j=0;j<=array.length-1;j++)
	{
		if(array[j]!=j+1){
			System.out.println("missing element is ");
			System.out.println(j+1);
			break;
		}
	}
}
}
