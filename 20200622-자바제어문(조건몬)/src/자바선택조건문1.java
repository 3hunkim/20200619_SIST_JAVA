/*
 * ���� ���ǹ� : if ~ else
 * 
 * ���ó)
 *		=> �α��� ó��
 *		=> ID �ߺ�üũ
 *		=> �۾���(����/���)
 *		=> ¦�� / Ȧ��
 *		=> �빮�� / �ҹ���
 *
 * ����)		
 * 		if(���ǹ�)
 * 		{
 * 			==> ������ true�� �� ó���ϴ� ����
 * 		}
 *  	else
 *  	{
 *  		==> ������ false�� �� ó���ϴ� ����
 *  	}
 * 
 */

import java.util.*;

public class �ڹټ������ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner�� ���� => Ű������ �Է°��� �ִ� ��쿡 ó��
		Scanner scan=new Scanner(System.in);
		// �ڹ��� ��� Ŭ����, ����� ���� Ŭ���� ==> ������ �� �� �ݵ�� new �̿��� ����
		int a=scan.nextInt(); // �Էµ� ���� �޾Ƽ� a��� �޸� ������ ����
		if(a<1 || a>100)
		{
			System.out.println("�߸��� �Է��Դϴ�\n���α׷��� �����մϴ�"); //
		}
		else
		{
			System.out.println(a+"�� �Է� �Ǿ����ϴ�~");
		}
	}
}

