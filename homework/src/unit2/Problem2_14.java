package unit2;
import java.util.Scanner;
public class Problem2_14 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		BIM bim1=new BIM();
		System.out.print("Enter weight in pounds:");
		bim1.getPounds(input.nextDouble());
		System.out.print("Enter hieght in inches:");
		bim1.getInches(input.nextDouble());
		bim1.showBIM();
	}

}
class BIM{
	double pounds=0;
	double inches=0;
	double BIMdata=0;
	
	void getPounds(double p) {

		pounds=p;
	}
	void getInches(double I) {

		inches=I;
	}
	void showBIM() {
		BIMdata=pounds*0.45359237/Math.pow(inches*0.0254,2);
		System.out.println(BIMdata);
	}
}