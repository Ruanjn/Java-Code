package unit7;
import java.util.Scanner;
public class Problem7_19 {

	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			NumberJudge list1=new NumberJudge();
			list1.setlist();
			list1.isSorted();
	}

}
class NumberJudge{
	int[] numberList;
	int listLength=0;
	int OK=1;
	
	public int setlist() {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter list:");
		listLength=input.nextInt();
		for(int i=0;i<listLength;i++) {
			numberList[i]=input.nextInt();
		}
		input.close();
		return 1;
	};
	
	public boolean isSorted() {
		for(int i=0;i+1<numberList[0];i++) {
			if(numberList[i]>numberList[i+1]) {
				return false;
			}
		}
		return true;
	}
}
