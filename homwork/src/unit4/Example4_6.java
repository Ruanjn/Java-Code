package unit4;

public class Example4_6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees",
				"Rasians","Sine","Cosine","Tangent");
		int degrees =60;
		double radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
				radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));
	}

}
