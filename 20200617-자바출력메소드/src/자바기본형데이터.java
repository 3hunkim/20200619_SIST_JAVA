/*
 * �ڹٿ��� ����ϴ� �⺻�� 
 * => �ڹٿ��� �����ϴ� ���������� '�⺻��'�̶�� �Ѵ�
 * 
 * 		1) ���� boolean (��: true/false)
 * 		= if(���ǹ�)�� ����� �� �ַ� ���� ��������
 * 		= ��(Turn)��, true/false�� �����ư��鼭
 * 		
 *  =>=>upcatsing (�ڵ�������)
 * 	byte < short(char) < int < long < float < double
 * 							downcasting <=<== (��������ȯ)
 *  double d; �Ǽ��� ����Ǳ� ����, eg) 65.0
 *  double d='a'; d=97.0
 *  int i='A' ; i=65
 *  
 *  ���� �ٲٸ� downcasting
 *  
 *  byte b1=10
 *  byte b2=20
 *  byte b3=b1+b2 (����, ����Ʈ+����Ʈ=������ ����, �׸��� int�� byte�� ����� ����)
 * 
 *  byte a=10;
 *  byte b=30;
 *  byte c=(byte)(a*b) 
 *  
 *  300�� 2�������� �ٲ� 100101100
 *  �ٵ� 1byte = 8���� ������ �ͼ�
 *  00101100
 *  32+8+4 = 44
 *  c=(byte)(a*b)=44
 *  
 *  (int)(10.5)+(int)(10.5) = 20
 *  (int)(10.5+10.5) = 21
 *  
 *  \t
 *  \n
 *  \"
 *  \\
 *  
 *  double d=1234567.78
 *  int a = int((d-123456)*100)
 *  
 *  
 */

public class �ڹٱ⺻�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1=false;
		System.out.println("b1="+b1);
		b1=true;
		System.out.println("b1="+b1);
		
		byte a=10;
		byte b=30;
		byte c=(byte)(a*b);
		System.out.println("c="+c);
		

		byte a2=10;
		byte b2=30;
		int c2=(a2*b2);
		System.out.println("c2="+c2);
		
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println('ȫ');
		System.out.println((int)'��');
		// 126191261912619 = ������
		System.out.println((char)12619);
		// �����ڴ� ���ڹ�ȣ�� ������ �ִ� (char�� ���������� �ν��Ѵ�)		
		
		System.out.println("C:\\javaDev\\javaStudy\\20200617-�ڹ���¸޼ҵ�\\src\\�ڹ���¸޼ҵ�2.java");
		System.out.println("\"ȫ�浿\"");
				//ȫ�浿
		System.out.print("Hello\t");
		System.out.print("Java!!");
		
		// https://www.google.com/search?q=java&oq=java&aqs=chrome..69i57j0l4j69i60j69i61j69i60.2326j0j7&sourceid=chrome&ie=UTF-8
			
		double d=1234567.78;
	    int k = (int)((d-123456)*100);
	    System.out.println(k);
		  
	}

}
