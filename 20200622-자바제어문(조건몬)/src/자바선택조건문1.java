/*
 * 선택 조건문 : if ~ else
 * 
 * 사용처)
 *		=> 로그인 처리
 *		=> ID 중복체크
 *		=> 글쓰기(전송/취소)
 *		=> 짝수 / 홀수
 *		=> 대문자 / 소문자
 *
 * 형식)		
 * 		if(조건문)
 * 		{
 * 			==> 조건이 true일 때 처리하는 문장
 * 		}
 *  	else
 *  	{
 *  		==> 조건이 false일 때 처리하는 문장
 *  	}
 * 
 */

import java.util.*;

public class 자바선택조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner를 저장 => 키보드의 입력값이 있는 경우에 처리
		Scanner scan=new Scanner(System.in);
		// 자바의 모든 클래스, 사용자 정의 클래스 ==> 저장을 할 때 반드시 new 이용해 저장
		int a=scan.nextInt(); // 입력된 값을 받아서 a라는 메모리 공간에 저장
		if(a<1 || a>100)
		{
			System.out.println("잘못된 입력입니다\n프로그램을 종료합니다"); //
		}
		else
		{
			System.out.println(a+"가 입력 되었습니다~");
		}
	}
}

