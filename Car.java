package week1.Day2.Assignments;

public class Car {
	
	public void applyBreak()
	{
		System.out.println("Break applied");
	}
	public boolean applyGear()
	{
		boolean a = true;
		return a;
	}
	public void switchOnAc()
	{
		System.out.println("Ac is switched on");
	}
	private boolean applyAcclerate()
	{
		boolean b=true;
		return b;
	}
public static void main(String[] args) 
{
	Car obj = new Car();
	obj.applyBreak();
	boolean gear = obj.applyGear();
	System.out.println(gear);
	obj.switchOnAc();
	boolean accelerate = obj.applyAcclerate();
	System.out.println(accelerate);
}
}
