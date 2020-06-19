/*
 *  이항 =>
 *  	산술 : 결과값을 알 수 없다. 고정값이 아니기 때문
 *  		 int + int = int
 *  		 double + int = double
 *  		 float + long = float
 *  		 어떤게 대입될 지 알 수 없다
 *  	===========================
 *      비교 : true/false
 *  	논리 : true/false	
 *  	=========================== 조건문(if)
 *      대입 (결과값을 집어 넣어주는 상태)
 *  
 *  비교연산자 : 수와 수를 비교 => 정수,실수,문자,논리
 *           문자열은 비교할 수 없다.
 *           "Hello"=="Hello" ===> equals()
 *           ==> 문자열을 저장하는 데이터형 string
 *   1) 종류 
 *   	== : 같다		  ==> 10==20 (false)
 *   	!= : 같지 않다      ==> 10!=20 (true)
 *   	<  : 작다            ==> 10<10 (false)
 *   	>  : 크다            ==> 10>10 (false)
 *   	<= : 작거나 같다   ==> 10<=10 (true)
 *   				     10<10(F) || 10==10(T)
 *   	>= : 크거나 같다   ==> 10>=10 (true)
 *   					 10>10(F) || 10==10(T)	
 *   2) 결과값 : boolean 
 */
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		char c='A';
		System.out.println(c++);
		System.out.println(c);
		System.out.println(b++==a);
		System.out.println(++b==a);
		System.out.println(10==20);
		System.out.println(10!=20);
		System.out.println(10<10);
		System.out.println(10>10);
		System.out.println(10<=10);
		System.out.println(10>=10);
	
		System.out.println('A'==65);
		// char는 연산수행 하면 정수로 변환된다 

	}

}
