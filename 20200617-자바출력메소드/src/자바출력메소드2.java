import java.util.Scanner;

import javax.swing.JOptionPane;

public class �ڹ���¸޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \n newline => ���ο� �� ���
		// \t tab => ���� ���� ���
		/*
		 * System.out.printf("%d*%d=%d\n",2,2,4); // \n(newline) ���ο� �ٿ� ����ض� �Ⱦ��� //
		 * System.out.printf("%d*%d=%d",2,3,6); // ������� ������ �پ���� (2*2=42*3=6)
		 */
		
		Scanner scan=new Scanner(System.in);
		/*
		 * Scanner : ������ ��
		 * scan : ����
		 * new : �޸𸮿� ����
		 * Scanner(System.in) : �ʱ�ȭ
		 */
		
		/*
		 * System.out.print("1' �����Է�:"); int a=scan.nextInt(); // �Էµ� ������ �о�ͼ� a��� �޸𸮿�
		 * ���� // System.out.print("2' �����Է�:"); int b=scan.nextInt();
		 * 
		 * System.out.println("a="+a); System.out.println("b="+b);
		 * 
		 * JOptionPane.showInputDialog("����");
		 */
		
		// Scanner => ���������� ���
		
		/*
		 * System.out.println(~100); // ���� ������, -101
		 * 
		 * 
		 * 
		 */
		
         System.out.println(Integer.toBinaryString(240));
         System.out.println(Integer.toHexString(240));
         System.out.println(Integer.toOctalString(240));
         
         System.out.println(0xf0);
         System.out.println(0360);
         System.out.println(0b11110000);
         System.out.println(~100);
		
	}

}
