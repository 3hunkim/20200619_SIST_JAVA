/*
 * ���� �ʱ�ȭ
 * 1) ���� ó��
 *    int a=100;
 * 2) ���� => Ű���忡�� �޾Ƽ� ����
 * 3) ������ ���� ���� (����) => ����, �ζ�
 * 4) �Է�â�� ���� ���� �޴� ���
 * 
 * 
 * ==> ���� ���ÿ� �ʱⰪ �ο� (�����ڿ�)
 *     int a=100;
 * ==> �����ϰ� ���߿� �ʱⰪ �ο� (����ڿ�) (����ڰ� �Է��� �� �޾ƾ� �ϴ� �̰� �� �� ����, ȸ��������)
 * 	   int a;
 *     a=200;
 *     
 */
import java.util.*;
// string, system, math => java.lang => ���� ����, ���� �� Ŭ���� �ȿ� ��� �ִ�.
public class �ʱⰪ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100; // ����� ���ÿ� �� ����
		System.out.println("a="+a);
		
		int b; // ����
		b=200; // �� ����
		System.out.println("b="+b);
		
		int c; // 98.5 => 98
		c=(int)(Math.random()*100)+1; // int�� �Ǽ� �Ҽ����� �� ������
		// 0.0~0.99 => *100 => 0.0~99.0 => int 0~99
		// 1~100
		System.out.println("c="+c);
	
		int d;
		Scanner scan=new Scanner(System.in);
		//system.in => Ű���� �Է°��� �о�´�.
		System.out.println("�����Է�:");
		d=scan.nextInt();
		
		System.out.println("d="+d);
	}

}
