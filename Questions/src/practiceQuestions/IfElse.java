package practiceQuestions;
/*
 * Java If-Else
 * https://www.hackerrank.com/challenges/java-if-else/problem
 * 
 * */
import java.util.Scanner;

public class IfElse {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = 4;

		if (1 <= N && N <= 100) {
			if (N % 2 != 0) {
				System.out.println("Weird");
			} else {
				if (N % 2 == 0) {
					if (2 <= N && N <= 5) {
						System.out.println("Nor Weird");
					} else if (6 <= N && N <= 20) {
						System.out.println("Weird");
					} else if (20 < N) {
						System.out.println("Not Weird");
					}
				}
			}

			//정답
			if (N % 2 == 0) {
				if (N >= 2 && N <= 5) {
					System.out.println("Not Weird");
					
				} else if (N >= 6 && N <= 20) {
					System.out.println("Weird");
				} else {
					System.out.println("Not Weird");
				}
			} else {
				System.out.println("Weird");
			}

		}
	}
}
