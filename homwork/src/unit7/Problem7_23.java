package unit7;

public class Problem7_23 {
	
	public static boolean turnboolean(boolean b) {
		if(b==true) {
			return false;
		}else { 
			return true;
		}
	}
	public static void main(String[] args) {
		boolean[] cabinet=new boolean[100];
		
		for(int i=0;i<100;i++) {
			cabinet[i]=false;
		}
		
		for(int i=0;i<100;i++) {
			for(int j=i;j<100;j+=i+1) {
				cabinet[j]=turnboolean(cabinet[j]);
			}
		}
		
		for(int i=0;i<100;i++) {
			if(cabinet[i]==true) {
				System.out.print(i+" ");
			}
		}
		
	}
	
}
