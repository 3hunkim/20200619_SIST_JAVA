/*
 * ����ÿ� ���� ����ϴ� ������
 *  => ���������� (++,--)
 *  => ��������� (+,-,*,/)
 *  => �񱳿�����, ��������
 *  => ���Կ����� (=, +=, -=)
 *  
 *  ==> ��Ÿ������
 *      => ���׿�����
 *         ����? ��1:��2
 *         ===
 *          => true => ��1
 *          => false => ��2
 */

import java.util.*;

// import java.lang.* ==> 
// ������ �Է� �޾Ƽ� ¦��/Ȧ��
public class ���׿�����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan=new Scanner(System.in); // System.in : Ű���� �Է� // System.out : ȭ��
		 * System.out.print("���� �Է�:"); // �Է� ���� ������ �����Ѵ� int a=scan.nextInt();
		 */
		int a=(int)(Math.random()*100)+1;
		/*     ===  =================  =
		 *      2          1           3
		 *  ������ �켱����
		 *  1) ()
		 *  2) ���׿�����
		 *  3) ���׿����� 
		 * (Math.random()*100)
		 *  =============
		 *   0.0~0.99 ==> 100 ==> 0.0~99.0
		 *   (int)(0.0~99.0) => (0~99)+1 ==> 1~100
		 */
		System.out.println("a="+a);
		System.out.println(a%2==0?"¦���Դϴ�":"Ȧ���Դϴ�");
		
		int x=2, y=10, z=0;
		z = x++*2 + --y-5 + x*(y%2);
		System.out.println(z);
		
		
		
		
	}

}
