package use;
import java.util.Scanner;
public class Functions {
	void select(boolean type) {
		Scanner input=new Scanner(System.in);
		String commond;
		System.out.println();
		System.out.println("---------����\\help��ȡ����--------------");
//		����ѡ������
		while(true) {
			System.out.print("������ָ��");
			commond=input.nextLine();
			switch(commond) {
			case "\\quit":
				System.out.println("------------��лʹ�ã��ٻᣡ----------");
				input.close();
				System.exit(0);
			case "\\wU":
				User.printInform(type);
				break;
			case "\\change":
				User.userChangeInform(type);
				break;
			case "\\commit":
				break;
			case "\\cCommit":
				break;
			case "\\help":
				System.out.println("-------------------------------------");
				System.out.println("|\\quit     �˳�����       \\wU	         �鿴������Ϣ |");
				System.out.println("|\\change  ���ĸ�����Ϣ  \\commit  �鿴������   |");
				System.out.println("|\\cCommit  ���ı�����   \\help    �鿴����       |");
				System.out.println("|\\offline   �˳���½                                                      |");
				System.out.println("-------------------------------------");
				break;
			case "\\offline":
				return;
			}
		}
	}
}
