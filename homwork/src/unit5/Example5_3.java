package unit5;

import java.util.Scanner;

public class Example5_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int number = (int)(Math.random()*101);
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.println("Guess a magic number between 0 and 100");
			
			System.out.print("\nEnter your guess: ");
			int guess = input.nextInt();
			if(guess == number) {
				System.out.println("yes,the number is "+ number);
				break;
			}else if (guess >number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}
	}

}
