package unit6;
import java.util.Scanner;
public class Problem6_3 {
	public static int reverse(int number) {
		int reverseNumber=0;
		while(number!=0) {
			reverseNumber=reverseNumber*10+number%10;
			number/=10;
		}
		return reverseNumber;
	}
	public static boolean isPalindrome(int number) {
		if (number==reverse(number)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number");
		if(isPalindrome(input.nextInt())) {
			System.out.println("The number is Palindrome");
		}else System.out.println("The number is not Palindrome");
		input.close();
		
	}

}
