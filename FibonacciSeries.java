package week1.Day1.Assignments;

public class FibonacciSeries {
/* To find Fibonacci Series for a given range
	
	My Learnings:
	1. Learned how to declare the variable
	2. Learned how to use FOR Loop
	3. Learned assignment operator
	 */
public static void main(String[] args) {
	
	int range = 8;
	int firstNum = 0, sum;
	int secNum = 1;
	System.out.println("Fibonacci Series");
	
	for(int i=0;i<=range;i++)
	{
	sum =firstNum+secNum;
	System.out.println(sum);
	firstNum=secNum;
	secNum=sum;
}
}
}
