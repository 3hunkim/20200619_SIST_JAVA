/*
 * �ʿ�ÿ� �ٸ���
 * 
 *  double
 * 
 *  char + int = int
 *  ===
 *  int
 *  
 *  int + long = long // ���� ū ���� ���� ����. (�ڵ�����ȯ)
 *  ===
 *  long
 *  
 *  char + int + long + double = double (�ڵ�����ȯ ����)
 *  ===
 *  int
 *  ==========
 *  int
 *  =================
 *  long
 *  ==========================
 *  double
 *  
 *  (int)double => int // int�� �ȴ� ��������ȯ ū������=>���������ͷ� �����ϱ� ����
 *  (char)int => char // 
 *  
 *  ����ȯ ���ܻ�Ȳ
 *  1) boolean�� ����
 *  2) int���ϴ� ������ �ϸ� ������� int��
 *     char+char => int
 *     short+byte => int
 *     char+byte+short==> int
 * 
 *  
 */

public class ���׿�����_����ȯ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		byte c=20;
		byte d=(byte)(b+c); // byte d=b+c�� ������ ���ϴ�. int�� �ٲ�� ������
	    System.out.println("d="+d);
	    
	    int g='A'; // g=65
	    double h=10; // h=10.0
	    // int
	    char j=65; // j='A'
	    System.out.println("g="+g);
	    System.out.println("h="+h);
	    System.out.println("j="+j);
	    
	    // ��������ȯ
	    int i=(int)10.5348; //�ݿø� ���ϰ� �� ������
	    int ii='A';
	    int jj=(int)'A';
	    System.out.println("i="+i);
	    System.out.println("ii="+ii);
	    System.out.println("jj="+jj);
	}

}
