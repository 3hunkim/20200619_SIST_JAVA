/*
 * ����� �Է� ==> 0, 1, 2
 * 
 * => 0�̸� => ����
 * => 1�̸� => ����
 * => 2�̸� => ��
 * 
 */
import java.util.*;
public class �ڹ����ǹ�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan=new Scanner(System.in); S
		 * System.out.println("����������:");
		 * int a=scan.nextInt();
		 * 
		 * if(a==0) { System.out.println("����"); } else if(a==1) {
		 * System.out.println("����"); } else if(a==2) { System.out.println("��"); } else {
		 * System.out.println("���������� ��?"); }
		 */
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("����(0) ����(1) ��(2) ����");
		
		int user=scan.nextInt();
				
		if(user==0) // ����(==)
		{
			System.out.println("Player:����");
		}
		if(user==1)
		{
			System.out.println("Player:����");
		}
		if(user==2)	
		{
			System.out.println("Player:��");
		}
		
		// ��ǻ��
		
		int com=(int)(Math.random()*3); // math.random()�� 0.0~0.99�� ��, �ű⿡ * 3�ϸ� 0.0~2.9(������)
		
		if(com==0)
		{
			System.out.println("Computer:����");
		}
		if(com==1)
		{
			System.out.println("Computer:����");
		}
		if(com==2)
		{
			System.out.println("Computer:��");
		}
		
		/* �迭�� Ȱ���ϸ� 3�� �� ����
		 * String[] value= {"����","����","��"} 
		 * System.out.println("��ǻ��:"+value[com]);
		 * System.out.println("����:"+value[user]);
		 */
		
		/*
		 *  ��ǻ�� : 
		 *    ���� => 0
		 *    	 ����� : user
		 *       ���� => 0 => 0
		 *       ���� => 1 => (-1)
		 *       �� => 2 => (-2)
		 *    ���� => 1
		 *       ����� : user 1,1
		 *       ���� => 0 => 1
		 *       ���� => 1 => 0
		 *       �� => 2 => (-1)
		 *    �� => 2
		 *       ����� : user 2,-1
		 *       ���� => 0 => (2)
		 *       ���� => 1 => 1
		 *       �� => 2 => 0
		 *             
		 *  if(com-user==-2 || com-user==1)
		 *  {
		 *  	System.out.println("Computer Win!!");
		 *  }
		 *  if(com-user==-1 || com-user==2)
		 *  {
		 *  	System.out.println("Player Win!!");
		 *  }
		 *  if(com-user==0)
		 *  {
		 *  	System.out.println("����!!");
		 *  }
		 *  
		 *  == ����,�Ǽ�,������ ��쿡�� ����� ����
		 *  "" ���ڿ��� ==���� �񱳰� �Ұ��� => equals()
		 */
		
		//��ǻ�Ͱ� ������ ��
		if(com==0)
		{
			if(user==0) //��ø if��, if(com==0 && user==0)
			{
				System.out.println("����!!");
			}
			if(user==1)
			{
				System.out.println("Player Win!!");
			}
			if(user==2)
			{
				System.out.println("Computer Win!!");
			}
		}
		if(com==1)
		{
			if(user==0)
			{
				System.out.println("Computer Win!!");
			}
			if(user==1)
			{
				System.out.println("����!!");
			}
			if(user==2)
			{
				System.out.println("Player Win!!");
			}
		}
		if(com==2)
		{
			if(user==0)
			{
				System.out.println("Player Win!!");
			}
			if(user==1)
			{
				System.out.println("����!!");
			}
			if(user==2)
			{
				System.out.println("Computer Win!!");
			}
		}
	}

}
