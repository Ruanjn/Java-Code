package unit6;
import java.util.Scanner;

public class Problem6_22 {
	/**
	 * Get the approximate square root of an integer
	 * @param n
	 * @return nextGuess
	 */
	public static double sqrt(long n) {
		double nextGuess=0;
		double lastGuess=1;
		while(true){
			nextGuess=(lastGuess+n/lastGuess)/2;
			if(nextGuess-lastGuess>0.0001||lastGuess-nextGuess>0.0001) {
				lastGuess=nextGuess;
				continue;
			}else return nextGuess;
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number");
		System.out.println("The sqrt of the number is "+sqrt(input.nextLong()));
		input.close();
	}

}
