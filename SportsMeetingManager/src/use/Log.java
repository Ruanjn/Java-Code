package use;
import java.util.Scanner;
public class Log {
	Scanner input=new Scanner(System.in);
	String username=new String();
	String userkey=new String();
	String c=new String();
//	��½���
	public boolean check() {
		System.out.print("�������û���: ");
		username=input.nextLine();
		System.out.print("����������: ");
		userkey=input.nextLine();
		System.out.print("��ѡ���Ƿ�Ϊ����Ա?(y/n): ");
		c=input.nextLine();
		
		if(!User.traversename(username,userkey,c)) {
			check();
		}else if(c.equals("y")) {
			return true;
		}
		else {
			return false;
		}
		return false;
	}
}
