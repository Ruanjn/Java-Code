package unit3;

import java.util.Scanner;

public class Example3_7 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		boolean isLeapYear= 
				(year % 4== 0&& year %100!=0)||(year%400==0);
		System.out.println(year+ " is a leap year? "+isLeapYear);
	}

}
