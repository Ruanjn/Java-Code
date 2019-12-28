package unit5;

import java.util.Scanner;

public class Example5_6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int data;
		int sum =0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print(
					"Enter an integer(the input ends if it is 0): ");
			data = input.nextInt();
			sum+=data;
		}while(data!=0);
			System.out.println("The sum is "+ sum);
	}

}
