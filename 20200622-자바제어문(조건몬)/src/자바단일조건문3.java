/*
 *  if(���ǹ�) : ���ǹ��� ������ ����� => true/false
 *    => �ʿ��� ��쿡�� ������ ���� (����:true�� ����)
 *       false�� ��쿡�� �ǳʶڴ� (������ �������� ���Ѵ�))))000000000000000000000000000
 */


public class �ڹٴ������ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		System.out.println(1);
		System.out.println(2);
		
		if(a%2==0)
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		
		// ���ĺ��� ���� => �빮��, �ҹ���
		char alpha='\t';
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"�� �빮���Դϴ�");
		if(alpha>='��' && alpha<='�R')
			System.out.println(alpha+"�� �빮���Դϴ�");
		 
		// Ư������
		if(alpha=='\t' || alpha=='\n') // Ư�����ڴ� �ο��� ���ڰ� ����.
			System.out.println("Ư������ �Դϴ�.");
	}

}
