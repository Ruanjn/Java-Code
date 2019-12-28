package unit7;
import java.util.Scanner; 
public class Problem7_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Number number1 = new Number();
		Scanner input=new Scanner(System.in);
		while(true) {
			int i=input.nextInt();
			if(i==0)break;
			number1.setNumber(i);
		};
		number1.printNumber();
	}
	
}

class Number{
	int numberArray[]= new int[20];
	int timesArray[]=new int[20];
	int index=0;
	
	public void setNumber(int n) {
		int i=0;
		int flag=0;
		for(i=0;i<index;i++) {
			if(numberArray[i]==n) {
				timesArray[i]++;
				flag=1;
				break;
			}
		}
		if(flag==0) {
			numberArray[index]=n;
			timesArray[index]=1;
			index++;
		}
	}
	
	public void printNumber() {
		int i=0;
		for(i=0;i<index;i++) {
			if(timesArray[i]>1)
				System.out.println(numberArray[i]+" occurs "+
								timesArray[i]+" times");
			else
				System.out.println(numberArray[i]+" occurs "+
								timesArray[i]+" times");	
		}
	}
}