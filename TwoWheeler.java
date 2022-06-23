package week1.Day2.Assignments;

public class TwoWheeler 
{
	public void noOfWheels()
	{
		System.out.println("No of wheels = 2");
	}
	public int noOfMirrors(int a)
	{
		return a;
	}
	public long chassisNumber(long s)
	{
		return s;
	}
	public boolean isPunctured()
	{
		return true;
	}
	public String bikeName()
	{
		return "pulsar";
	}
	public double runningKM()
	{
		return 150;
	}
	public static void main(String[] args) 
		{
			TwoWheeler obj = new TwoWheeler();
			obj.noOfWheels();
			int b = obj.noOfMirrors(2);
			System.out.println("No of mirrors is "+b);
			long c=obj.chassisNumber(123456987);
			System.out.println("Chasis number is "+c);
			boolean d=obj.isPunctured();
			System.out.println("IsPunctured "+d);
			String e = obj.bikeName();
			System.out.println("Name of the bike is "+e);
			double f=obj.runningKM();
			System.out.println("Running KM "+f);
			
		}
}
