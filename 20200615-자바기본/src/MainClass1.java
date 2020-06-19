
public class MainClass1 {
	public static void main(String[] args) {
		// 표현 => 자바
		/*
		 * 정수
		 * 	= 10진법 10, 20... (거의)
		 * 	= 8진법 (01)
		 * 		011 => 9
		 * 		=
		 *  = 16진법 (0x)
		 *  	0x10
		 *  	==
		 *  = 2진법 (0b)
		 *  	0b1010
		 *  	==
		 * 실수
		 * 	= 저장 크기 4byte (소수점 이하 8자리)	10.5f (메모리 절약)
		 * 	= 저장 크기 8byte (소수점 이하 16자리)  10.5 
		 * 문자
		 * 	= '' (한글자만 저장)
		 * 문자열
		 *  = "" (여러글자 저장)
		 *  
		 * ASC (C언어쪽) ====> 1byte 
		 * Unicode (java) => 2byte (한글 가능, 한글은 자음+모음이어서 최소 2byte 요구, 다른 언어와 호환이 잘됨)
		 * 
		 * UTF-8 (브라우저는 C로 짠다, ASC로만 쓴다, 한글이 짤려서 나오는, ?로 찍혀 나옴, 그래서 UTF 쓰면 2byte로 변환해서 읽기 가능)
		 * 
		 *
		 */
		System.out.println('A');
		System.out.println('메');
		System.out.println("Hello");
		System.out.println(10.5d);
		System.out.println(10.5f);
		System.out.println(10.5F);
		
		System.out.println(10); // 누구나 보기 쉽게 쓰는 것이 코드를 잘 짜는 것, 고로 10으로 하는게 젤 낫겠지?
		System.out.println(0b01010);
		System.out.println(012);
		System.out.println(0xA);
		
		// 64비트 컴퓨터, 정수 하나를 저장하기 위해 8바이트 짜리가 필요, 
		// 127까지만 저장 가능
		// 	
		
		/* 
		 * 1. 기본 문법
		 * 		1) 대소문자 구문
		 * 		2) 라이브러리 클래스 : 대소문자, 메소드는 소문자, 상수는 모두 대문자)
		 * 		PI=3.14
		 * 
		 * 2. 변수/상수
		 * 
		 * 		int kor=100;
		 * 		final int KOR=200;
		 * 		=> 명령문이 종료가 되면 반드시 ; 
		 * 
		 * 3. 들여쓰기 
		 *
		 * 
		 */


	}
}
