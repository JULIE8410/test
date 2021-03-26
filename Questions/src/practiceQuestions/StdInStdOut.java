package practiceQuestions;
/*
 * Java Stdin and Stdout II
 * https://www.hackerrank.com/challenges/java-stdin-stdout/problem
 * 
 * Java Output Formatting
 * https://www.hackerrank.com/challenges/java-output-formatting/problem
 * 
 * */

import java.util.Scanner;


public class StdInStdOut {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*
		int i = scan.nextInt();
		double d = scan.nextDouble();
		
		// int나 double 타입의 데이터 입력받고 나면 buffer 비워주고 String 입력받아야 함
		scan.nextLine();
		
		String s = scan.nextLine();
		*/
		
		
		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++)
         {
             String s1=sc.next();
             int x=sc.nextInt();
             //-15는 왼쪽에서 출력 타입은 s이므로 String타입, 03d는 정수 출력하고 3자리 차지함 빈자리는 0으로 채움
             System.out.printf("%-15s%03d\n", s1, x);
         }
         System.out.println("================================");
	}

}
