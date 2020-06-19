/*
 * 변수 초기화
 * 1) 직접 처리
 *    int a=100;
 * 2) 선언 => 키보드에서 받아서 저장
 * 3) 임의의 수를 저장 (랜덤) => 게임, 로또
 * 4) 입력창을 만들어서 값을 받는 방식
 * 
 * 
 * ==> 선언 동시에 초기값 부여 (관리자용)
 *     int a=100;
 * ==> 선언하고 나중에 초기값 부여 (사용자용) (사용자가 입력한 값 받아야 하니 이게 좀 더 많다, 회원가입폼)
 * 	   int a;
 *     a=200;
 *     
 */
import java.util.*;
// string, system, math => java.lang => 생략 가능, 원래 저 클래스 안에 들어 있다.
public class 초기값변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100; // 선언과 동시에 값 제시
		System.out.println("a="+a);
		
		int b; // 선언
		b=200; // 값 제시
		System.out.println("b="+b);
		
		int c; // 98.5 => 98
		c=(int)(Math.random()*100)+1; // int가 되서 소수점이 다 지워짐
		// 0.0~0.99 => *100 => 0.0~99.0 => int 0~99
		// 1~100
		System.out.println("c="+c);
	
		int d;
		Scanner scan=new Scanner(System.in);
		//system.in => 키보드 입력값을 읽어온다.
		System.out.println("정수입력:");
		d=scan.nextInt();
		
		System.out.println("d="+d);
	}

}
