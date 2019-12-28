package unit3;
import java.util.Scanner;
public class Problem3_22 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		Point point=new Point();
		Cricle cricle1=new Cricle();
		cricle1.setsenter(0, 0);
		System.out.print("Enter the point X and Y:");
		point.setPoint(input.nextDouble(),input.nextDouble());
		System.out.println("The point is in cricle? "+cricle1.isInCricle(point));
		input.close();
	}

}

class Point{
	
	double x=0;
	double y=0;
	void setPoint(double Inx,double Iny) {
		x=Inx;
		y=Iny;
	}
}
class Cricle{
	Point center=new Point();
	double range=10;
	
	void setsenter(double Inx,double Iny) {
		center.setPoint(Inx, Iny);
	}
	boolean isInCricle(Point point) {
		double interval=0;
		interval=Math.pow(point.x-center.x,2)+Math.pow(point.y-center.y,2);
		if(interval>=range*range) {
			return false;
		}else {
			return true;
		}
	}
}