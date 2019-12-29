package use;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;
public class User {
	static int CurrentUserIndex;
	
	static ArrayList<student>students=new ArrayList<student>();
	static ArrayList<administrator>administrartors=new ArrayList<administrator>();
//	初始化数据库
	public static void initUserData() {
		student stu1=new student("hzgjfwgcxy","123456","杭州国际服务工程学院");
		student stu2=new student("jhyxy","123456","经亨颐学院");
		student stu3=new student("sjrfxy","123456","沈钧儒法学院");
		student stu4=new student("lxy","123456","理学院");
		student stu5=new student("albbsxy","123456","阿里巴巴商学院");
		student stu6=new student("clyhxhgxy","123456","材料与化学化工学院");
		student stu7=new student("yyxy","123456","音乐学院");
		student stu8=new student("msxy","123456","美术学院");
		student stu9=new student("jjyglxy","123456","经济与管理学院");
		student stu10=new student("yxy","123456","医学院");
		administrator adm1=new administrator("sudoLls","sudo123456","李青老师");
		administrator adm2=new administrator("sudoHls","sudo123456","黄忠兴老师");
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		students.add(stu4);
		students.add(stu5);
		students.add(stu6);
		students.add(stu7);
		students.add(stu8);
		students.add(stu9);
		students.add(stu10);
		administrartors.add(adm1);
		administrartors.add(adm2);
	}
//	遍历容器，校对用户名与密码
	public static boolean traversename(String name,String key,String isAds) {
		
		boolean flag=false;
		if(isAds.equals("y")) {
			
			ListIterator<administrator> e = administrartors.listIterator();
			administrator temp=new administrator();
			while (e.hasNext()) {
	    		CurrentUserIndex=e.nextIndex();
				temp=(administrator) e.next();
			      if(name.equals(temp.getStudentsName())) {//			核查用户名
			    	  if(key.equals(temp.getStudentsKey())) {//			查验到核对密码

			    		  flag=true;
			    		  break;
			    	  }
			      }
			    }
			if(flag) {
				System.out.println("登陆成功!");//			密码正确登录成功
			}else {
				System.out.println("登录失败");
				System.out.println("请检查密码或用户名或管理员选项");//			密码不正确或者用户名错误或者登录失败
			}
//       	
		}else {
			//构造管理员遍历器
			ListIterator<student> e = students.listIterator();
			student temp=new student();
			while (e.hasNext()) {
				CurrentUserIndex=e.nextIndex();
				temp=(student) e.next();
			      if(name.equals(temp.getStudentsName())) {//			核查用户名
			    	  if(key.equals(temp.getStudentsKey())) {//			查验到核对密码
			    		  flag=true;
			    		  break;
			    	  }
			      }
			    }
			if(flag) {
				System.out.println("登陆成功!");//			密码正确登录成功
			}else {
				System.out.println("登录失败");
				System.out.println("请检查密码或用户名或管理员选项");//			密码不正确或者用户名错误或者登录失败
			}
		}
		return flag;
	}
	
//	更改密码
	public static void userChangeInform(boolean type) {
		Scanner input=new Scanner(System.in);
		String mode;
		if(type) {
			administrator temp=new administrator();
			temp=administrartors.get(CurrentUserIndex);
			while(true) {
				System.out.println("----------------输入你要更改的信息---------------");
				System.out.println("----------\\key更改密码  \\phone更改联系方式----------");
				System.out.println("----\\f完成修改并退出修改\\w查看修改后数据\\wo查看原始数据---");
				mode=input.nextLine();
				switch(mode) {
				case "\\key":
					temp.UpdateKey();
					break;
				case "\\phone":
					temp.UpdatePhoneNumber();
					break;
				case "\\w":
					printInform(temp);
					break;
				case "\\wo":
					printInform(true);
					break;
				case "\\f":
					administrartors.set(CurrentUserIndex, temp);
					return;
				}
			}

		}else {
			student temp = new student();
			temp=students.get(CurrentUserIndex);
			System.out.println("----------------输入你要更改的信息---------------");
			System.out.println("----------\\key更改密码  \\phone更改联系方式----------");
			System.out.println("----\\f完成修改并退出修改\\w查看修改后数据\\wo查看原始数据---");
			while(true) {
				mode=input.nextLine();
				switch(mode) {
				case "\\key":
					temp.UpdateKey();
					break;
				case "\\phone":
					temp.UpdatePhoneNumber();
					break;
				case "\\w":
					printInform(temp);
					break;
				case "\\wo":
					printInform(false);
					break;
				case "\\f":
					students.set(CurrentUserIndex, temp);
					return;
				case "\\help":
					System.out.println("----------------输入你要更改的信息---------------");
					System.out.println("----------\\key更改密码  \\phone更改联系方式----------");
					System.out.println("----\\f完成修改并退出修改\\w查看修改后数据\\wo查看原始数据---");
					break;
				}
			}
		}
	}
	
	
//	显示个人信息
//	传入boolean类型选择是否为管理员
//	根据遍历时获取的下标，显示信息
	public static void printInform(boolean type) {
		if(type) {
			administrator temp=new administrator();
			temp=administrartors.get(CurrentUserIndex);
			System.out.printf("用户名: %s 联系电话: %s\n老师: %s\n",
					temp.getStudentsName(),
					temp.getStudentsPhoneNumber(),
					temp.getCollega());
		}else{
			student temp = new student();
			temp=students.get(CurrentUserIndex);
			System.out.printf("用户名: %s 联系电话: %s\n学院: %s\n",
					temp.getStudentsName(),
					temp.getStudentsPhoneNumber(),
					temp.getCollega());
		}		
		return;
	}
//	显示个人信息
//	传入学生信息
	public static void printInform(student temp) {
			System.out.printf("用户名: %s 联系电话: %s\n学院: %s\n",
					temp.getStudentsName(),
					temp.getStudentsPhoneNumber(),
					temp.getCollega());	
		return;
	}
//	显示个人信息
//	传入管理员信息
	public static void printInform(administrator temp) {
		System.out.printf("用户名: %s 联系电话: %s\n老师: %s\n",
				temp.getStudentsName(),
				temp.getStudentsPhoneNumber(),
				temp.getCollega());
		return;
}
}
//学生类
class student{
	private String name = new String();
	private String key = new String();
	private String collega= new String();
	private String phoneNumber=" ";
	private int root=0;
	
	
//	更改密码
	void UpdateKey() {
		String commond;
		
		Scanner input=new Scanner(System.in);
		System.out.println("密码修改");
		System.out.print("请输入原先值：");
		String temp=input.nextLine();
		while(true) {
			if(temp.equals("\\q")) {
				return;
			}
			if(temp.equals(key)) {
				System.out.print("请输入新值: ");
				temp=input.nextLine();
				if(temp.equals("\\q")) {
					return;
				}
				System.out.println("确认“"+temp+"”为新值？（y/n）");
				commond=input.nextLine();
				if(commond.equals("y")) {
					key=temp;
					System.out.println("修改成功！");
					return;
				}else if(commond.equals("\\q")) {
					return;
				}else {
					System.out.println("修改取消！请选择继续修改或输入其他任意值退出（\\c）");
					commond=input.nextLine();
					if(commond.equals("\\c"))continue;
					else return;
				}
			}else {
				System.out.println("错误！请重新输入");
				temp=input.nextLine();
			}
		}
	}
	
//	更改电话号码
	void UpdatePhoneNumber() {
		Scanner input=new Scanner(System.in);
		System.out.println("电话修改");
		System.out.print("请输入修改值：");
		String temp=input.nextLine();
		if(temp.equals("\\q")) {
			return;
		}else {
			phoneNumber=temp;
			System.out.println("修改成功");
			return;
		}
	}
	
//	返回个人信息
	String getStudentsKey() {
		return key;
	}
	String getStudentsName() {
		return name;
	}
	String getStudentsPhoneNumber() {
		return phoneNumber;
	}
	String getCollega() {
		return collega;
	}
	int getRoot() {
		return root;
	}
//	创建方法
	student(String Inname,String Inkey) {
		name=Inname;
		key=Inkey;
	}
	student(String Inname,String Inkey,String Incollega) {
		name=Inname;
		key=Inkey;
		collega=Incollega;
	}
	student(){
		
	}
}
// 管理员类，继承学生类
class administrator extends student{
	private int root=1;
	
	int getRoot() {
		return root;
	}
	administrator(String Inname, String Inkey) {
		super(Inname, Inkey);
		// TODO 自动生成的构造函数存根
	}
	administrator(String Inname, String Inkey,String Inteacher) {
		super(Inname, Inkey,Inteacher);
		// TODO 自动生成的构造函数存根
	}
	administrator(){
		
	}
	
}
