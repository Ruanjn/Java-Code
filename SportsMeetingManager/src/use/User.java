package use;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;
public class User {
	static int CurrentUserIndex;
	
	static ArrayList<student>students=new ArrayList<student>();
	static ArrayList<administrator>administrartors=new ArrayList<administrator>();
//	��ʼ�����ݿ�
	public static void initUserData() {
		student stu1=new student("hzgjfwgcxy","123456","���ݹ��ʷ��񹤳�ѧԺ");
		student stu2=new student("jhyxy","123456","������ѧԺ");
		student stu3=new student("sjrfxy","123456","����巨ѧԺ");
		student stu4=new student("lxy","123456","��ѧԺ");
		student stu5=new student("albbsxy","123456","����Ͱ���ѧԺ");
		student stu6=new student("clyhxhgxy","123456","�����뻯ѧ����ѧԺ");
		student stu7=new student("yyxy","123456","����ѧԺ");
		student stu8=new student("msxy","123456","����ѧԺ");
		student stu9=new student("jjyglxy","123456","���������ѧԺ");
		student stu10=new student("yxy","123456","ҽѧԺ");
		administrator adm1=new administrator("sudoLls","sudo123456","������ʦ");
		administrator adm2=new administrator("sudoHls","sudo123456","��������ʦ");
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
//	����������У���û���������
	public static boolean traversename(String name,String key,String isAds) {
		
		boolean flag=false;
		if(isAds.equals("y")) {
			
			ListIterator<administrator> e = administrartors.listIterator();
			administrator temp=new administrator();
			while (e.hasNext()) {
	    		CurrentUserIndex=e.nextIndex();
				temp=(administrator) e.next();
			      if(name.equals(temp.getStudentsName())) {//			�˲��û���
			    	  if(key.equals(temp.getStudentsKey())) {//			���鵽�˶�����

			    		  flag=true;
			    		  break;
			    	  }
			      }
			    }
			if(flag) {
				System.out.println("��½�ɹ�!");//			������ȷ��¼�ɹ�
			}else {
				System.out.println("��¼ʧ��");
				System.out.println("����������û��������Աѡ��");//			���벻��ȷ�����û���������ߵ�¼ʧ��
			}
//       	
		}else {
			//�������Ա������
			ListIterator<student> e = students.listIterator();
			student temp=new student();
			while (e.hasNext()) {
				CurrentUserIndex=e.nextIndex();
				temp=(student) e.next();
			      if(name.equals(temp.getStudentsName())) {//			�˲��û���
			    	  if(key.equals(temp.getStudentsKey())) {//			���鵽�˶�����
			    		  flag=true;
			    		  break;
			    	  }
			      }
			    }
			if(flag) {
				System.out.println("��½�ɹ�!");//			������ȷ��¼�ɹ�
			}else {
				System.out.println("��¼ʧ��");
				System.out.println("����������û��������Աѡ��");//			���벻��ȷ�����û���������ߵ�¼ʧ��
			}
		}
		return flag;
	}
	
//	��������
	public static void userChangeInform(boolean type) {
		Scanner input=new Scanner(System.in);
		String mode;
		if(type) {
			administrator temp=new administrator();
			temp=administrartors.get(CurrentUserIndex);
			while(true) {
				System.out.println("----------------������Ҫ���ĵ���Ϣ---------------");
				System.out.println("----------\\key��������  \\phone������ϵ��ʽ----------");
				System.out.println("----\\f����޸Ĳ��˳��޸�\\w�鿴�޸ĺ�����\\wo�鿴ԭʼ����---");
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
			System.out.println("----------------������Ҫ���ĵ���Ϣ---------------");
			System.out.println("----------\\key��������  \\phone������ϵ��ʽ----------");
			System.out.println("----\\f����޸Ĳ��˳��޸�\\w�鿴�޸ĺ�����\\wo�鿴ԭʼ����---");
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
					System.out.println("----------------������Ҫ���ĵ���Ϣ---------------");
					System.out.println("----------\\key��������  \\phone������ϵ��ʽ----------");
					System.out.println("----\\f����޸Ĳ��˳��޸�\\w�鿴�޸ĺ�����\\wo�鿴ԭʼ����---");
					break;
				}
			}
		}
	}
	
	
//	��ʾ������Ϣ
//	����boolean����ѡ���Ƿ�Ϊ����Ա
//	���ݱ���ʱ��ȡ���±꣬��ʾ��Ϣ
	public static void printInform(boolean type) {
		if(type) {
			administrator temp=new administrator();
			temp=administrartors.get(CurrentUserIndex);
			System.out.printf("�û���: %s ��ϵ�绰: %s\n��ʦ: %s\n",
					temp.getStudentsName(),
					temp.getStudentsPhoneNumber(),
					temp.getCollega());
		}else{
			student temp = new student();
			temp=students.get(CurrentUserIndex);
			System.out.printf("�û���: %s ��ϵ�绰: %s\nѧԺ: %s\n",
					temp.getStudentsName(),
					temp.getStudentsPhoneNumber(),
					temp.getCollega());
		}		
		return;
	}
//	��ʾ������Ϣ
//	����ѧ����Ϣ
	public static void printInform(student temp) {
			System.out.printf("�û���: %s ��ϵ�绰: %s\nѧԺ: %s\n",
					temp.getStudentsName(),
					temp.getStudentsPhoneNumber(),
					temp.getCollega());	
		return;
	}
//	��ʾ������Ϣ
//	�������Ա��Ϣ
	public static void printInform(administrator temp) {
		System.out.printf("�û���: %s ��ϵ�绰: %s\n��ʦ: %s\n",
				temp.getStudentsName(),
				temp.getStudentsPhoneNumber(),
				temp.getCollega());
		return;
}
}
//ѧ����
class student{
	private String name = new String();
	private String key = new String();
	private String collega= new String();
	private String phoneNumber=" ";
	private int root=0;
	
	
//	��������
	void UpdateKey() {
		String commond;
		
		Scanner input=new Scanner(System.in);
		System.out.println("�����޸�");
		System.out.print("������ԭ��ֵ��");
		String temp=input.nextLine();
		while(true) {
			if(temp.equals("\\q")) {
				return;
			}
			if(temp.equals(key)) {
				System.out.print("��������ֵ: ");
				temp=input.nextLine();
				if(temp.equals("\\q")) {
					return;
				}
				System.out.println("ȷ�ϡ�"+temp+"��Ϊ��ֵ����y/n��");
				commond=input.nextLine();
				if(commond.equals("y")) {
					key=temp;
					System.out.println("�޸ĳɹ���");
					return;
				}else if(commond.equals("\\q")) {
					return;
				}else {
					System.out.println("�޸�ȡ������ѡ������޸Ļ�������������ֵ�˳���\\c��");
					commond=input.nextLine();
					if(commond.equals("\\c"))continue;
					else return;
				}
			}else {
				System.out.println("��������������");
				temp=input.nextLine();
			}
		}
	}
	
//	���ĵ绰����
	void UpdatePhoneNumber() {
		Scanner input=new Scanner(System.in);
		System.out.println("�绰�޸�");
		System.out.print("�������޸�ֵ��");
		String temp=input.nextLine();
		if(temp.equals("\\q")) {
			return;
		}else {
			phoneNumber=temp;
			System.out.println("�޸ĳɹ�");
			return;
		}
	}
	
//	���ظ�����Ϣ
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
//	��������
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
// ����Ա�࣬�̳�ѧ����
class administrator extends student{
	private int root=1;
	
	int getRoot() {
		return root;
	}
	administrator(String Inname, String Inkey) {
		super(Inname, Inkey);
		// TODO �Զ����ɵĹ��캯�����
	}
	administrator(String Inname, String Inkey,String Inteacher) {
		super(Inname, Inkey,Inteacher);
		// TODO �Զ����ɵĹ��캯�����
	}
	administrator(){
		
	}
	
}
