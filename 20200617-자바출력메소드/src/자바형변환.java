
/*
 * ����ȯ => �ڽ��� ���������� �ٸ� ������ ������������ ��ȯ
 * 
 * boolean : ���� (����ȯ �ȵ�)
 * byte < char < int < long < float < double
 * 
 * ���� => �Ǽ�, ����, ���� 
 * 		��) int a = 10L (10L�� int���� ũ��)
 * 		=> int a = (int)10L (long�� int��)
 * 		=> long a = (long)10
 * 		
 * 		��) double d = (double)10 
 * 
 * 		���� ���� ū �Ϳ� ������ �ڵ����� �ٲ�µ� (�ڵ� ������)
 * 		ū ���� ���� �Ϳ� ������ �ڵ����� �� �ٲ� ���� ������ �ؾ� �Ѵ�
 * 
 *		(�Ǽ�)double d = 10(����)
 *			�Ǽ�>���� = �ڵ� ������
 *		
 * 
 * �Ǽ� => ����, ����
 * ���� => ����, �Ǽ� 
 *
 * (����)int i='A'(����)
 *     ����>���� = �ڵ�������
 * 	   'A'=65
 *		(char)65
 * ���� ���ϴ� ������ �ٲ� ��, ����ȯ
 */

public class �ڹ�����ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 5/2;
		System.out.println("d="+d); // �̷��� �ϸ� ����/���� ���� ���� 2.0�� ���͹���
		
		double e = 5/(double)2; // (.�� ����� ���� �Ǽ��� �Ǳ� ������ �Ǽ��� ������� ������ �Ѵ�.)
		System.out.println("e="+e);
		
		double f = (double)5/2;
		System.out.println("f="+f);

	}

}
