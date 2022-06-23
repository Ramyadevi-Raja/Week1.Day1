package week1.Day2.Assignments;

import java.util.Arrays;

public class FindSecondLargest {
public static void main(String[] args) {
	int[] data = {3,2,11,4,6,7,9,12,15,18,20,21,23};
	Arrays.sort(data);
	for (int i=0; i<=data.length-1;i++)
	{
		System.out.println(data[i]);
	}
	int length = data.length-2;
	//Last two largest numbers
	System.out.println(" Last two largest number");
	for (int j=length;j>=length;j++)
	{
		System.out.println(data[length]);
		break;
	}
}
}
