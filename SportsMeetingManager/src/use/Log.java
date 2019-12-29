package use;
import java.util.Scanner;
public class Log {
	Scanner input=new Scanner(System.in);
	String username=new String();
	String userkey=new String();
	String c=new String();
//	登陆检查
	public boolean check() {
		System.out.print("请输入用户名: ");
		username=input.nextLine();
		System.out.print("请输入密码: ");
		userkey=input.nextLine();
		System.out.print("请选择是否为管理员?(y/n): ");
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
