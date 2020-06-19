/* 
 * 화면 출력
 *   1) System.out.println() - 제일 많이 쓰임
 *   = 다음 줄에서부터 출력 시킬 때
 *   
 *   예시
 *   System.out.println("Hello");
 *   System.out.println("Java");
 *   Hello
 *   Java
 *   
 *   2) System.out.print()
 *   = 바로 옆에 출력
 *   
 *   예시
 *   System.out.println("Hello");
 *   System.out.println("Java");
 *   HelloJava
 *   
 *   3) System.out.printf()
 *   = 서식이 있는 출력, 간격 띄기 가능, 소수점 제거 가능
 *   
 *   예시
 *   89 80 90 240  80.0  B
 *   System.out.println("80 80 80 240  80.0  B")
 *   
 *   System.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,'B') // 5 정도 띄어 써라, C언어에서 나온 언어, 우리는 웹에다 하기 때문에
 *   
 *   %5d 80
 *   00080 (앞에 3칸을 띄고 80을 써라, 000은 공백 5칸 중)
 *   
 *   %-5d 80
 *   80000 (뒤에 3칸을 띄고 80을 쓰기, 000은 공백)
 *  
 *   정수 %d
 *   실수 %f 
 *   문자 %c
 *   
 *   %5.2f 80.0
 *   080.00 (5칸 확보, 소숫점을 2자리를 쓰겠다.)
 *   
 */

public class 자바출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.2f",80.0); // %f는 무조건 6자리가 나와서 소수점 이하 2자리로 짜르려면 .2
		System.out.printf("%.1f",80.55); // 반올림 된다, println은 소수점 자리 이하를 자를 수 없다.
		
		System.out.println("2*2=4");
		
		int a=2;
		int b=2;
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d",a,b,a*b); // jdk 1.5 부터 가능
		
		/* 
		 * %d => 정수 decimal
		 * %f => 실수 floating-poit
		 * %c => 문자 character
		 * %s => 문자열 string
		 * 얘네는 안 맞으면 바로 에러 난다
		 */
		
		
	}

}
