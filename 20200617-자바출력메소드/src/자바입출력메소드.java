import java.util.*; // Scanner => ������ ������� �ڹ������� �о� �´�
/*
 * class Scanner {
 * } ��ĳ�ʸ� ��ü�� ��� ���� ����
 * 
 * ���� �Է�:
 * 100 
 * 
 * 
 */
public class �ڹ�����¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է°� �ޱ�
		/*
		 *  System.out.println("���� �Է�:"); ln = line
		 *  System.out.printf("���� �Է�:\n"); \n�� �� �� �� ���ֳ� �� ���ֳ� ����
		 */
		Scanner scan = new Scanner(System.in);
		System.out.printf("�Ǽ� �Է�:"); // \n , \t �� �ѱ��Ϸ��� ���� �����
		double a = scan.nextDouble(); 
		// double�� �Ǹ� a=100�� �ƴ϶� a=100.0�� �� (�Ǽ�)
		// char a=97 => a='a'
		System.out.println("a="+a);

	}

}
