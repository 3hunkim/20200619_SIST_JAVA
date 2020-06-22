/*
 * char 변수 선언 ==> 값을 대입
 * => char alpha = 'A';
 * => alpha가 대문자면 ==> 소문자 출력
 * => alpha가 소문자면 ==> 대문자 출력
 * 
 * 1. 제어문
 * 	  연산자 (비교,논리,부정)
 *   	= 비교연산자
 *         같다 : ==
 *         같지 않다 : !=
 *         작다 : <
 *         크다 : >
 *         작거나 같다 : <=
 *         크거나 같다 : >= ===> 최종 결과값은 true/false이기 때문에 주로 조건문(if)에서 사용한다
 *      = 논리연산자
 *         조건 && 조건 ==> 조건이 둘다 true일 때 true
 *         && : 포함(기간,범위)
 *         조건 || 조건 ==> 조건 중에 한 개 이상이 true일 때 true
 *         || : 미포함
 *      = 부정연산자 : 반대 ==> 
 *   단독처리 => 산술, 증감, 대입
 *   	      ==============
 *   		       응용 => 제어문
 *   연산처리 => 형변환(강제 형변환)
 *   		   double => int ==> (int)double
 *             int    => char ==> (char)int
 *             
 *
 */


public class 자바조건문문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha='K';
		
		if(alpha>='A' && alpha<='Z')
		{
			System.out.println((char)(alpha+32));
		}
		else
		{
			System.out.println((char)(alpha-32));	
		}
		
	}

}
