package week1.Day1.Assignments;

public class PrimeNumbers {
	// To find  given number is prime number or not
	public static void main(String[] args) {
		
		int value = 13;
		boolean flag = false;
		
		for(int i=2; i<=value;i++)
		{
			if(value%i==0) 
			{
				flag=true;
			}
		}
			if(!flag)
			{
				System.out.println(value+" is a prime number");
			}
				else
				{
					System.out.println(value+" is not a prime number");
				}
	}

}
