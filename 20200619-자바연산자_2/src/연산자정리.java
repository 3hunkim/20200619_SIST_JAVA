
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		// char ccc=65;
		char cc=(char)(c+32); //�빮�ڶ� �ҹ����� ���̴� 32	        		
		//             ====
		//              A+32 => int+int=int�� �Ǽ� ����ȯ �ؾ���
		System.out.println(cc); // �ҹ��� ��ȯ => ����ȯ
		
		System.out.println(c>='A' && c<='Z' ? "�빮��":"�ҹ���");
	    /*                 =====     =====
	     * 				     T         T
	     * cc>='A' && cc<='Z' ==> �빮��, cc�� A���� Z����
	     * cc>='a' && cc<='z' ==> �ҹ���, cc�� a���� z����
	     */
	}

}
