/*
 * char ���� ���� ==> ���� ����
 * => char alpha = 'A';
 * => alpha�� �빮�ڸ� ==> �ҹ��� ���
 * => alpha�� �ҹ��ڸ� ==> �빮�� ���
 * 
 * 1. ���
 * 	  ������ (��,��,����)
 *   	= �񱳿�����
 *         ���� : ==
 *         ���� �ʴ� : !=
 *         �۴� : <
 *         ũ�� : >
 *         �۰ų� ���� : <=
 *         ũ�ų� ���� : >= ===> ���� ������� true/false�̱� ������ �ַ� ���ǹ�(if)���� ����Ѵ�
 *      = ��������
 *         ���� && ���� ==> ������ �Ѵ� true�� �� true
 *         && : ����(�Ⱓ,����)
 *         ���� || ���� ==> ���� �߿� �� �� �̻��� true�� �� true
 *         || : ������
 *      = ���������� : �ݴ� ==> 
 *   �ܵ�ó�� => ���, ����, ����
 *   	      ==============
 *   		       ���� => ���
 *   ����ó�� => ����ȯ(���� ����ȯ)
 *   		   double => int ==> (int)double
 *             int    => char ==> (char)int
 *             
 *
 */


public class �ڹ����ǹ�����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha='K';
		
		if(alpha>='A' && alpha<='Z')
		{
			System.out.println((char)(alpha+32));
		}
		else
		{
			System.out.println((char)(alpha-32));	
		}
		
	}

}
