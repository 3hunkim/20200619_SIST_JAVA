import java.util.Scanner;

/*
 * �� ���� ������ �޾Ƽ�
 * �ִ밪, �ּҰ�
 * 
 * int a,b
 * int max,min
 * 
 * if~else
 * 
 */

public class �ڹ����ǹ�����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		/*
		 * System.out.print("�� ���� ���� �Է� (a b):"); int a=scan.nextInt(); int
		 * b=scan.nextInt(); // ("Max="+Math.max(a,b)); // ("Min="+Math.min(a,b));
		 * 
		 * int max,min;
		 * 
		 * if(a>b) { max=a; min=b; } else { max=b; min=a; }
		 * 
		 * System.out.println("max="+max); System.out.println("min="+min);
		 */
		
		// ������ �Է� �޾� ���밪�� ����ϴ� ���α׷�
		// 1, -1 ==> 1
		// 0���� ������ - ���ϱ� ==> ���
		
		System.out.println("���� �Է�:");
		int a=scan.nextInt();
		
	    // ("���밪:"+Math.abs(a)); abs = absolute value
		if(a<0)
		{
			System.out.println(-1*a);
		}
		else
		{
			System.out.println(a);
		}
			
	}

}
