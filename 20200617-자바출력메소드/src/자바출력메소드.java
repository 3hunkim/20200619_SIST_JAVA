/* 
 * ȭ�� ���
 *   1) System.out.println() - ���� ���� ����
 *   = ���� �ٿ������� ��� ��ų ��
 *   
 *   ����
 *   System.out.println("Hello");
 *   System.out.println("Java");
 *   Hello
 *   Java
 *   
 *   2) System.out.print()
 *   = �ٷ� ���� ���
 *   
 *   ����
 *   System.out.println("Hello");
 *   System.out.println("Java");
 *   HelloJava
 *   
 *   3) System.out.printf()
 *   = ������ �ִ� ���, ���� ��� ����, �Ҽ��� ���� ����
 *   
 *   ����
 *   89 80 90 240  80.0  B
 *   System.out.println("80 80 80 240  80.0  B")
 *   
 *   System.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,'B') // 5 ���� ��� ���, C���� ���� ���, �츮�� ������ �ϱ� ������
 *   
 *   %5d 80
 *   00080 (�տ� 3ĭ�� ��� 80�� ���, 000�� ���� 5ĭ ��)
 *   
 *   %-5d 80
 *   80000 (�ڿ� 3ĭ�� ��� 80�� ����, 000�� ����)
 *  
 *   ���� %d
 *   �Ǽ� %f 
 *   ���� %c
 *   
 *   %5.2f 80.0
 *   080.00 (5ĭ Ȯ��, �Ҽ����� 2�ڸ��� ���ڴ�.)
 *   
 */

public class �ڹ���¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.2f",80.0); // %f�� ������ 6�ڸ��� ���ͼ� �Ҽ��� ���� 2�ڸ��� ¥������ .2
		System.out.printf("%.1f",80.55); // �ݿø� �ȴ�, println�� �Ҽ��� �ڸ� ���ϸ� �ڸ� �� ����.
		
		System.out.println("2*2=4");
		
		int a=2;
		int b=2;
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d",a,b,a*b); // jdk 1.5 ���� ����
		
		/* 
		 * %d => ���� decimal
		 * %f => �Ǽ� floating-poit
		 * %c => ���� character
		 * %s => ���ڿ� string
		 * ��״� �� ������ �ٷ� ���� ����
		 */
		
		
	}

}
