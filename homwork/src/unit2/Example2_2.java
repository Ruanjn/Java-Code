package unit2;
import java.util.Scanner;
public class Example2_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input =new Scanner(System.in);
		
		
		
		System.out.print("Enter a number for radius");
		double radius = input.nextDouble();
		
		double area =radius * radius * 3.14159;
		
		System.out.println("The area for the cicrle of radius"+
		radius + " is "+ area);
	}
	

}
