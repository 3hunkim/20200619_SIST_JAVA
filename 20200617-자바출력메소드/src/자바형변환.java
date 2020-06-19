
/*
 * 형변환 => 자신의 데이터형을 다른 형식의 데이터형으로 변환
 * 
 * boolean : 제외 (형변환 안됨)
 * byte < char < int < long < float < double
 * 
 * 정수 => 실수, 문자, 정수 
 * 		예) int a = 10L (10L은 int보다 크다)
 * 		=> int a = (int)10L (long을 int로)
 * 		=> long a = (long)10
 * 		
 * 		예) double d = (double)10 
 * 
 * 		작은 것을 큰 것에 넣으면 자동으로 바뀌는데 (자동 형변형)
 * 		큰 것을 작은 것에 넣으면 자동으로 안 바뀌어서 강제 형변형 해야 한다
 * 
 *		(실수)double d = 10(정수)
 *			실수>정수 = 자동 형변형
 *		
 * 
 * 실수 => 정수, 문자
 * 문자 => 정수, 실수 
 *
 * (정수)int i='A'(문자)
 *     정수>문자 = 자동형변형
 * 	   'A'=65
 *		(char)65
 * 내가 원하는 것으로 바꿀 때, 형변환
 */

public class 자바형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 5/2;
		System.out.println("d="+d); // 이렇게 하면 정수/정수 여서 답이 2.0이 나와버림
		
		double e = 5/(double)2; // (.을 지우고 나서 실수가 되기 때문에 실수의 계산으로 만들어야 한다.)
		System.out.println("e="+e);
		
		double f = (double)5/2;
		System.out.println("f="+f);

	}

}
