package �ڶ���Ԫ;
import java.util.Scanner;
public class Problem2_6 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int number=0;
		int sum=0;
		System.out.print("Enter a number between 0 and 1000:");
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		while(number!=0) {
			sum+=number%10;
			number/=10;
		}
		System.out.println("The sum of the digits is "+sum);
	}

}
