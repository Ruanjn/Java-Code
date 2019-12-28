package unit2;

public class Problem2_13 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double times=1+0.05/12;
		double sum=0;
		for(int index=0;index<6;index++) {
			sum=(100+sum)*times;
		}
		System.out.println(sum);
	}

}
