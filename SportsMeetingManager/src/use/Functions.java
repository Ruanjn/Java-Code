package use;
import java.util.Scanner;
public class Functions {
	void select(boolean type) {
		Scanner input=new Scanner(System.in);
		String commond;
		System.out.println();
		System.out.println("---------输入\\help获取帮助--------------");
//		功能选择区块
		while(true) {
			System.out.print("请输入指令");
			commond=input.nextLine();
			switch(commond) {
			case "\\quit":
				System.out.println("------------感谢使用！再会！----------");
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
				System.out.println("|\\quit     退出程序       \\wU	         查看个人信息 |");
				System.out.println("|\\change  更改个人信息  \\commit  查看报名表   |");
				System.out.println("|\\cCommit  更改报名表   \\help    查看帮助       |");
				System.out.println("|\\offline   退出登陆                                                      |");
				System.out.println("-------------------------------------");
				break;
			case "\\offline":
				return;
			}
		}
	}
}
