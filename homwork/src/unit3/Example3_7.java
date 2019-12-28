package unit3;

import java.util.Scanner;

public class Example3_7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		boolean isLeapYear= 
				(year % 4== 0&& year %100!=0)||(year%400==0);
		System.out.println(year+ " is a leap year? "+isLeapYear);
	}

}
