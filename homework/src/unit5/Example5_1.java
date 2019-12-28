package unit5;

import java.util.Scanner;

public class Example5_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		
		Scanner input=new Scanner(System.in);
		System.out.print("What is "+ number1+" + "+number2+"? ");
		int answer = input.nextInt();
		
		while(number1+number2!=answer) {
			System.out.print("Wrong answer. Try again. What is "+
					number1+" + "+number2+"? ");
			answer = input.nextInt();
		}
		
		System.out.println("You got it!");
	}

}
