/*
 * 1. 정수를 입력 받아서
 * 	    짝수인지 홀수인지 확인 => 10은 짝수다, 11은 홀수다
 * 						 =========	========
 * 
 * 2. 정수 3개를 입력 받아서 
 * 	    총점, 평균
 *    학점 => 조건문
 *    60이상 => D
 *    70 => C
 *    80 => B
 *    90 => A
 *    나머지는 F
 *    
 *    국어: 80
 *    영어: 80
 *    수학: 80
 *    
 * 	    총점 : 240
 *    평균 : 80.0
 *    학점 : B
 *    
 */
import java.util.*;
public class 자바조건문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner scan=new Scanner(System.in);
		 * System.out.println("정수 입력:");
		 * int a=scan.nextInt();
		 * if((a%2==1))
		 * {
		 * System.out.println(a+"는(은) 홀수 입니다.");
		 * }
		 * else
		 * {
		 * System.out.println(a+"는(은) 짝수 입니다.");
		 * }
		 * }
	     */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수:");
		int a=scan.nextInt();
		
		if (a>=90)
		{
			System.out.println("학점:"+'A');
		}
		else if (a>=80 && a<90)
		{
			System.out.println("학점:"+'B');
		}
		else if ()
		
	}
}
