package Demo;

import java.util.Scanner;

public class QuizProgram2 {

	public static void main(String[] args) {
		//declaring variables
		int n;
		
		//creating scanner object here
		Scanner sc = new Scanner(System.in);
		
		
		//running infinite loop
		while (true) {
		//Display the set of quiz option
		System.out.println("Who is the founder of Blue Origin ?");
		System.out.println("1. Bill Gates\n2, Tim Cookn3\n3, Nodella\n4. Jeff Bezos\n5. Exit program ");
		
		
		//reading input from user
		System.out.println("Enter your choice/1/2/3/4/5)?");
		n = sc.nextInt();
		
		if (n==4) {
			System.out.println("Congratulations !!! You have gressed the correct answer");
			break;
		}
		else if (n ==5) {
			break;
		}
		else {
			System.out.println("Wrong choice, please try again");
		}
		}
		sc.close();
	}

	}