import java.util.Scanner;

/*
 * 두 개의 정수를 받아서
 * 최대값, 최소값
 * 
 * int a,b
 * int max,min
 * 
 * if~else
 * 
 */

public class 자바조건문문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		/*
		 * System.out.print("두 개의 정수 입력 (a b):"); int a=scan.nextInt(); int
		 * b=scan.nextInt(); // ("Max="+Math.max(a,b)); // ("Min="+Math.min(a,b));
		 * 
		 * int max,min;
		 * 
		 * if(a>b) { max=a; min=b; } else { max=b; min=a; }
		 * 
		 * System.out.println("max="+max); System.out.println("min="+min);
		 */
		
		// 정수를 입력 받아 절대값을 출력하는 프로그램
		// 1, -1 ==> 1
		// 0보다 작으면 - 곱하기 ==> 양수
		
		System.out.println("정수 입력:");
		int a=scan.nextInt();
		
	    // ("절대값:"+Math.abs(a)); abs = absolute value
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
