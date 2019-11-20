package 第五单元;

import java.util.Scanner;

public class Problem5_17 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int interger=0;
		String number="";
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number: ");
		interger=input.nextInt();
		for(int i=0;interger!=0;i++) {
			number=interger%8+number;
			interger/=8;
		}
		System.out.println(number);
		input.close();
	}

}
