package unit7;
import java.util.Scanner;

public class Problem7_17 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		GradeList List1=new GradeList();
		
		int iMount=input.nextInt();
		List1.Setgrade(iMount);
		List1.listDownSort();
		List1.printList_Name();
		input.close();
	};
}
class GradeList{
	student[] Student = new student[100];
	int Length=0;
	
	public void Setgrade(int total) {
		Scanner In = new Scanner(System.in);
		Length=total;
		for(int index=0;index<total;index++) {
			String s=new String();
			if(index!=0)
				s= new String(In.nextLine());
			Student[index]=new student();
			System.out.println("Enter Student's Name");
			Student[index].name=In.nextLine();
			System.out.println("Enter Student's Grade");
			Student[index].grade=In.nextInt();
		}
		In.close();
	}
	
	public void listDownSort() {
		student temp = new student();
			for(int i=0;i<Length;i++) {
				for(int j=i;j<Length;j++) {
					if(Student[i].grade<Student[j].grade) {
						temp=Student[i];
						Student[i]=Student[j];
						Student[j]=temp;
					}
				}
			}
		}
	
	public void printList_Name() {
		for(int i=0;i<Length;i++) {
			System.out.println(Student[i].name);
		}
	}
}
	
class student{
	int grade;
	String name=new String("");
}