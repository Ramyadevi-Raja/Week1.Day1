package week1.Day1.Assignments;

public class Factorialnumbers {
	/* To find Factorial for a given number
	
	My Learnings:
	1. Learned how to declare the variable
	2. Learned how to use FOR Loop
	3. Learned assignment operator
	4. Learned how to use syso effectively
	 */
	public static void main(String[] args) {
	int i, fact =1;
	int num =5;
	for(i=1; i<=num;i++)
	{
		fact = fact * i;
	}
	System.out.println("The Factorial number for "+num+" is:" +fact);
}
}