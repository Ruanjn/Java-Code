package use;
import java.util.Scanner;

public class Doing {
	public static Log loging=new Log();					//登陆类
	public static Functions Funing=new Functions();		//功能选择类
	public static void main(String[] args) {

		// TODO 自动生成的方法存根
		String command="1";
		Scanner input=new Scanner(System.in);
		User.initUserData();							//初始化数据库
		//首界面	
		System.out.println("----------------------------------------------------");
		System.out.println("-------欢迎使用田径运动会网上报名系统---------");
		System.out.println("----------------输入\\help获取帮助---------------\n");
		//登录操作
		System.out.print("请输入\\ol进行登录，或\\q退出！: ");
		command=input.nextLine();
		while(!command.equals("\\q")) {								//初入\q退出
			if(command.equals("\\help")){
				System.out.println("------------------------------------------------------------------");
				System.out.println("---------开始界面输入\\ol与\\q来进行登录或者退出 n -------");
				System.out.println("--------登录时输入用户名与密码，并选择是否为系统管理员-----");
				System.out.println("------学院管理员用户名为学院总称简拼，初始密码为123456----");
				System.out.println("--------登陆成功后用户可以输入指令，修改自己的个人信息-----");
				System.out.println("---学院用户个人信息由用户名，密码，联系电话，学院以及权限组成---");
				System.out.println("-其中学院管理员仅可修改自己的联系电话与密码，无法修改用户名与学院-");
				System.out.println("------------系统管理员可以修改密码，联系电话-----------");
				System.out.println("---------------------------------------------");
				command=input.nextLine();
				continue;
			}else if(command.equals("\\ol")) {						//进入登陆            
				Funing.select(loging.check());//核查用
				System.out.println("---------------已退出登陆----------------");
				System.out.print("请输入\\ol进行登录，或\\q退出！: ");
				command=input.nextLine();
				continue;
			}else {													//输入其他指令
				System.out.print("未知指令，请重新输入： ");
				command=input.nextLine();
				continue;
			}
		}
		System.out.println("-----------感谢使用！再会！------------");
		input.close();
		
	}

}
