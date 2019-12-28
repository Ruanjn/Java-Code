package unit2;
import java.util.Scanner;
public class Example2_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds/60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds +" seconds is " + minutes+
				" minutes and "+ remainingSeconds +" seconds");
	}

}
