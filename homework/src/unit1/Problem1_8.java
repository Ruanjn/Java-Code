package unit1;

public class Problem1_8 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Cricle cricle1=new Cricle();
		cricle1.setrange(5.5);
		cricle1.printArea();
		cricle1.printCicle();
	}

}

class Cricle {
	double range;
	double area;
	double cicle;
	
	void setrange(double R){
		range=R;
	}
	void printArea() {
		area=range*range*Math.PI;
		System.out.println(area);
	}
	void printCicle() {
		cicle=2*range*Math.PI;
		System.out.println(cicle);
	}
}