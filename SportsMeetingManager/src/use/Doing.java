package use;
import java.util.Scanner;

public class Doing {
	public static Log loging=new Log();					//��½��
	public static Functions Funing=new Functions();		//����ѡ����
	public static void main(String[] args) {

		// TODO �Զ����ɵķ������
		String command="1";
		Scanner input=new Scanner(System.in);
		User.initUserData();							//��ʼ�����ݿ�
		//�׽���	
		System.out.println("----------------------------------------------------");
		System.out.println("-------��ӭʹ���ﾶ�˶������ϱ���ϵͳ---------");
		System.out.println("----------------����\\help��ȡ����---------------\n");
		//��¼����
		System.out.print("������\\ol���е�¼����\\q�˳���: ");
		command=input.nextLine();
		while(!command.equals("\\q")) {								//����\q�˳�
			if(command.equals("\\help")){
				System.out.println("------------------------------------------------------------------");
				System.out.println("---------��ʼ��������\\ol��\\q�����е�¼�����˳� n -------");
				System.out.println("--------��¼ʱ�����û��������룬��ѡ���Ƿ�Ϊϵͳ����Ա-----");
				System.out.println("------ѧԺ����Ա�û���ΪѧԺ�ܳƼ�ƴ����ʼ����Ϊ123456----");
				System.out.println("--------��½�ɹ����û���������ָ��޸��Լ��ĸ�����Ϣ-----");
				System.out.println("---ѧԺ�û�������Ϣ���û��������룬��ϵ�绰��ѧԺ�Լ�Ȩ�����---");
				System.out.println("-����ѧԺ����Ա�����޸��Լ�����ϵ�绰�����룬�޷��޸��û�����ѧԺ-");
				System.out.println("------------ϵͳ����Ա�����޸����룬��ϵ�绰-----------");
				System.out.println("---------------------------------------------");
				command=input.nextLine();
				continue;
			}else if(command.equals("\\ol")) {						//�����½            
				Funing.select(loging.check());//�˲���
				System.out.println("---------------���˳���½----------------");
				System.out.print("������\\ol���е�¼����\\q�˳���: ");
				command=input.nextLine();
				continue;
			}else {													//��������ָ��
				System.out.print("δָ֪����������룺 ");
				command=input.nextLine();
				continue;
			}
		}
		System.out.println("-----------��лʹ�ã��ٻᣡ------------");
		input.close();
		
	}

}
