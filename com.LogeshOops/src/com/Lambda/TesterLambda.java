package com.Lambda;

import java.util.Scanner;

interface person{
	void greet(String s1,String s);
}
interface adition{
	int sum(int a,int b);
}
interface ageValidate {
	boolean validate(int age);
}
public class TesterLambda {
	public static void main(String[] args) {
//		person p =(s1,s)->System.out.println(s + s +".....!");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first Greeting message and Second greeting message");
//		String s1 = sc.nextLine();
//		String s = sc.nextLine();
//		p.greet(s1,s);
//		
//		adition a1 =(a,b)->a+b;
//		System.out.println("Enter one number and press enter and enter second number");
//		int value =a1.sum(sc.nextInt(),sc.nextInt());
//		System.out.println(value);
		
		ageValidate v =(age)->{
			if(age>=18)return true;
			else return false;
		};
		System.out.println(v.validate(5));

	}
}
