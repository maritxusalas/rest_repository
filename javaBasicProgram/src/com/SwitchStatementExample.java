package com;

import java.util.Scanner;
public class SwitchStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int choice = 8;
//	switch(choice) {
//	case 1:System.out.println("1st block");
//		break;
//	case 2:System.out.println("2st block");
//		break;
//	case 3:System.out.println("3st block");
//		break;
//	case 4:System.out.println("4st block");
//		break;
//	}
//	System.out.println("finish");
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1:add 2:sub 3:mul 4:div");
	int choice;
	System.out.println("Enter YOUR CHOICE");
	choice =sc.nextInt();
	System.out.println("Enter the value of a");
	int a=sc.nextInt();
	System.out.println("Enter the value of b");
	int b=sc.nextInt();
	int add,sub,mul,div;
	switch(choice) {
	case 1: add = a+b;
		System.out.println("Addition of two number is "+add);
		break;
	case 2: sub = a-b;
		System.out.println("Sub of two number is "+sub);
		break;
	case 3: mul = a*b;
		System.out.println("Mul of two number is "+mul);
		break;
	case 4: div = a/b;
		System.out.println("Div of two number is "+div);
		break;
	default: System.out.println("Wrong choice");
	
	}
	System.out.println("finish");
	sc.close();
	}

}
