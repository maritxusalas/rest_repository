package Demo;

import java.util.Scanner;

public class BaicJavaProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		int num1 =10, num2 = 20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		num1 =sc.nextInt();
		System.out.println("Enter second number ");
		num2 =sc.nextInt();
		System.out.println("artimetic operations on the numbers are");
		System.out.println("adition of numbers is " +(num1 + num2));
		System.out.println("sustraction of numbers is " +(num1 - num2));
		System.out.println("multiplication of numbers is " +(num1*num2));
		System.out.println("division of numbers is "+(num2/num1));
		System.out.println("modulo of numbers is "+(num2%num1));

	}

}
