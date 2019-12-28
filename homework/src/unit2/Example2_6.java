package unit2;

import java.util.Scanner;

public class Example2_6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celsius = (5.0/9)*(fahrenheit -32);
		System.out.println("fahrenheit "+ fahrenheit + " is "+ 
				celsius + " in Celsius");
	}

}
