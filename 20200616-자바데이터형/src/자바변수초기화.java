
public class �ڹٺ����ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=78;
		int eng=85;
		int math=96;

		
		/*
		 * ���ڿ� ������ �� �� �߿�� ������ ��
		 * 7+7+"1"+7+7
		 * ===
		 * 14+"1"
		 * ===
		 * "141"+7
		 * "1417"+7
		 * "14177"
		 * 
		 * "����:78"+85 ==> ����:788596
		 */
		System.out.println("����:"+(kor+eng+math)); // ��ȣ�� ��, �� ������ ���� ����϶�� ��
		System.out.println("����:"+kor+eng+math);
		System.out.println("���:"+((kor+eng+math)/3));
		System.out.println("����:"+'C'+'+');
		
		int a=65;
		char c=65; // char => ����, ���� �� �� ���� �� �ִ�. �ٸ� ��½� ���� Ʋ��
		System.out.println("a="+a); // ���ڷ� �ؼ� ����
		System.out.println("c="+c); // ���ڷ� �ؼ� ���� 
		
		int b=97;
		char d=97;
		System.out.println("b="+b);
		System.out.println("d="+d);
		
		int x=1;
		int y='1';
		System.out.println("x="+x);
		System.out.println("y="+y);
	
		// char�� ����, ���� ����Ѵ�
		/*
		 *  long = int
		 *   8      4
		 *   
		 *   int = long
		 *    4     8   ====> ERROR
		 *    
		 *   double = int,long.float
		 *   int = double(x)
		 *   
		 *   ���� ==> char = int (�������� �� ����)
		 *   ������ ũ�⸦ �˾ƾ� �Ѵ�
		 *   
		 *   float f=10.6; �̰� �ȵ� �ֳ��ϸ� 10.6d���� d>f, ū���� �����Ϳ� x
		 *   
		 *   
		 */
		
		double f=10.6;
		float g=10.6f;
		
		// byte < char < int < long < float < double
		
		System.out.println(100); // 100�� int
		System.out.println(10.8); // �Ǽ��̸� double�� 10.8 double
		
		int i=21400000000L; // ����1) 21�� �̻� ����2) int<long 
		long k=21400000000; // �̰� �ȵ� �ڿ� L�� ����� (8��Ʈ, long���� ����)
		long j=21400000000L;
		double l=21400000000L; // �� ����
		 
		
		
	}

}
