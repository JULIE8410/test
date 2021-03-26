package practiceQuestions;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String data = "Hello \n New \n World \n";
		
		
		while(sc.hasNext()) {
			String input = sc.nextLine();
			System.out.println(++count + " " + input);			
		}
	}

}
