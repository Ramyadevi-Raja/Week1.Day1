package week1.Day2.Assignments;

import week1.Day2.calculator;

public class MyCar {
	public static void main(String[] args) {
		Car obj1 = new Car();
		obj1.applyBreak();
		boolean a = obj1.applyGear();
		System.out.println(a);
		obj1.switchOnAc();
		calculator obj=new calculator();
		int c=obj.addTwoNumb(5,6);
		System.out.println("Add Two Numbers "+c);
	}

}