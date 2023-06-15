package Demo;

import java.util.Scanner;

public class DisplayContent {
	
		public static void main(String[] args) {
		// Factorial program example
		// 3! = 3*2*1=6
		int n;
		int factNum = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero del que quieres sacar el factorial");
		n = sc.nextInt();
		//	    for (int i=1; i<=n; i++) {
//			factNum = factNum*i;
//		}
		int i =1;
		while (i <= n)  {
		
			factNum =factNum*i;
			i++;
		}
				
		System.out.println("El factorial de " +n+ "es " +factNum);
		sc.close();
	}
}

