/*
 * 자바에서 사용하는 기본형 
 * => 자바에서 지원하는 데이터형을 '기본형'이라고 한다
 * 
 * 		1) 논리형 boolean (값: true/false)
 * 		= if(조건문)을 사용할 때 주로 쓰는 데이터형
 * 		= 턴(Turn)제, true/false로 번갈아가면서
 * 		
 *  =>=>upcatsing (자동형변형)
 * 	byte < short(char) < int < long < float < double
 * 							downcasting <=<== (강제형변환)
 *  double d; 실수만 저장되기 시작, eg) 65.0
 *  double d='a'; d=97.0
 *  int i='A' ; i=65
 *  
 *  직접 바꾸면 downcasting
 *  
 *  byte b1=10
 *  byte b2=20
 *  byte b3=b1+b2 (오류, 바이트+바이트=정수로 변경, 그리고 int는 byte에 담기지 못함)
 * 
 *  byte a=10;
 *  byte b=30;
 *  byte c=(byte)(a*b) 
 *  
 *  300을 2진법으로 바꿈 100101100
 *  근데 1byte = 8개만 가지고 와서
 *  00101100
 *  32+8+4 = 44
 *  c=(byte)(a*b)=44
 *  
 *  (int)(10.5)+(int)(10.5) = 20
 *  (int)(10.5+10.5) = 21
 *  
 *  \t
 *  \n
 *  \"
 *  \\
 *  
 *  double d=1234567.78
 *  int a = int((d-123456)*100)
 *  
 *  
 */

public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1=false;
		System.out.println("b1="+b1);
		b1=true;
		System.out.println("b1="+b1);
		
		byte a=10;
		byte b=30;
		byte c=(byte)(a*b);
		System.out.println("c="+c);
		

		byte a2=10;
		byte b2=30;
		int c2=(a2*b2);
		System.out.println("c2="+c2);
		
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println('홍');
		System.out.println((int)'뀧');
		// 126191261912619 = ㅋㅋㅋ
		System.out.println((char)12619);
		// 각문자는 숫자번호를 가지고 있다 (char는 정수형으로 인식한다)		
		
		System.out.println("C:\\javaDev\\javaStudy\\20200617-자바출력메소드\\src\\자바출력메소드2.java");
		System.out.println("\"홍길동\"");
				//홍길동
		System.out.print("Hello\t");
		System.out.print("Java!!");
		
		// https://www.google.com/search?q=java&oq=java&aqs=chrome..69i57j0l4j69i60j69i61j69i60.2326j0j7&sourceid=chrome&ie=UTF-8
			
		double d=1234567.78;
	    int k = (int)((d-123456)*100);
	    System.out.println(k);
		  
	}

}
