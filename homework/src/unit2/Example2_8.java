package unit2;

import java.util.Scanner;

public class Example2_8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter purchase amout: ");
		double purchaseAmout = input.nextDouble();
		
		double tax = purchaseAmout * 0.06;
		System.out.println("Sale tax is $"+(int)(tax*100)/100.0);
	}

}
