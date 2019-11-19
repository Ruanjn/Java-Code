package 第三单元;
import java.util.Scanner;
public class Problem3_15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int guessNumber=0;
		int randomNumber=0;
		int flag=0;
		int icount=0;
		Scanner input = new Scanner(System.in);
		randomNumber=(int)(900*Math.random()+100);
		System.out.print(randomNumber);
		System.out.print("Enter the number your guess:");
		guessNumber=input.nextInt();
		for(int i=1;i<4;i++){
			int chu=(int)Math.pow(10,i);
			if(guessNumber%chu!=randomNumber%chu) {
				break;
			}
			if(i==3) {
				System.out.println("10000$");
				System.exit(1);
			}else if(i>1)flag=1;
		}
		for(int i=0;i<3;i++){
			int chu=(int)Math.pow(10,i);
			for(int j=0;j<3;j++) {
				int chu2=(int)Math.pow(10,j);
				if(guessNumber/chu%10==randomNumber/chu2%10) {
					flag=1;
					icount++;
				}
			}
			
		}
		if(icount==3) {
			System.out.println("3000$");
		}else if(flag==1){
			System.out.println("1000$");
		}else System.out.println("0$");
	}
}