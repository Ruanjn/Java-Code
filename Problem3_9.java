package ������Ԫ;
import java.util.Scanner;
public class Problem3_9 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int ISBN=0;
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enther the ISBN number:");
		ISBN=input.nextInt();
		System.out.print("The ISBN-10 number is "+ISBN);
		for(int i=9;ISBN!=0;i--) {
			sum+=i*(ISBN%10);
			ISBN/=10;
		}
		if(sum%11==10) {
			System.out.println("X");
		}else {
			System.out.println(sum%11);
		}
		
	}

}
