package work;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		distinctNumber number1 = new distinctNumber();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		while(true) {
			int i=input.nextInt();
			if(number1.icount==10)break;
			number1.setNumber(i);
		};
		number1.printNumber();
	}
	
}

class distinctNumber{
	int numberArray[]= new int[10];
	int icount=0;
	int index=0;
	
	public void setNumber(int n) {
		int i=0;
		int flag=0;
		for(i=0;i<index;i++) {
			if(numberArray[i]==n) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			numberArray[index]=n;
			index++;
		}
		icount++;
	}
	
	public void printNumber() {
		int i=0;
		System.out.println("The number of distinct number is "+index);
		System.out.print("The distinct numbers are: ");
		for(i=0;i<index;i++) {
			System.out.print(numberArray[i]+" ");	
		}
	}
}