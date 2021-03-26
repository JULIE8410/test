package practiceQuestions;

/*
 * Java Loops II
 * https://www.hackerrank.com/challenges/java-loops/problem
 * 
 * */

public class LoopII {

	public static void main(String[] args) {

		int n, a, b, q;

		a = 0;
		b = 2;
		n = 10;
		q = 0;

		for (double i = 0.0; i < (double) n; i++) {
			q += (int) (Math.pow(2, i) * b);
			System.out.print((q + a) + " ");

		}

	}

}
