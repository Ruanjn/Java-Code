package unit3;

import java.util.Scanner;

public class Example3_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int number1=(int)(System.currentTimeMillis()%10);
		int number2=(int)(System.currentTimeMillis()/7%10);
		
		Scanner input=new Scanner(System.in);
		System.out.print(
				"What is "+ number1+ " + "+ number2 + "? ");
		
		int answer = input.nextInt();
		
		System.out.println(
			number1+ " + "+ number2 + " = "+ answer+" is "+
			(number1+number2==answer));
	}

}
