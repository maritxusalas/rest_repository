package Demo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UtilityPackageDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sentence ? ");
		String userString = sc.nextLine();
		
		//userString = userString.strip();
		
		StringTokenizer st = new StringTokenizer(userString," ");
		System.out.println(st);
		
		//loop to iterate over each word in a string and identifying number of vowels in them
		
		System.out.println("\nVowel count for each word in given string are");
		while(st.hasMoreTokens()) {
			String word = st.nextToken();
			System.out.println("Processing word " + word);
			int vowelCount = 0;
			for (char c: word.toCharArray()) {
				c = Character.toLowerCase(c);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelCount ++;
				}
			}
			System.out.println("The word " +word + " has " +vowelCount + " vowels");
		}
		
		
	}

}
