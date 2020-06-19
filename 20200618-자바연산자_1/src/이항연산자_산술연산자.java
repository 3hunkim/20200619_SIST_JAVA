/*
 * 이항연산자
 *   산술연산자 (+,-,*,/,%)
 *   => 자바에서 제공하는 모든 연산자는 산술로 변환할 수 있다.
 *   => 자바 프로그램에서 가장 많이 사용되는 연산자
 *   => 시그마 for(k=1:k5)
 *   => 공식을 보는 순간 자바로 어떻게 만들지 생각해낼 수 있어야 한다
 *   => 주의점
 *      1) 형변환 => 가장 큰 데이터형으로 변경
 *      2) /
 *         = 0으로 나누면 오류
 *         = 정수/정수=정수
 *      3) %
 *         = 나누고 나머지 => 부호는 왼쪽편을 따라간다
 *         = -%- 여도 +가 아님, 그건 *,/에서만
 *         = -5%-2 => -1 (-5의 부호 따라감
 *         = 5%(-2) => 1 
 *      4) 산술연산자의 우선순위는 
 *         *,/,%가 +,-보다 우선순위가 높다
 *         => 우선순위를 잘 모르면 => ()를 이용해서 우선순위 결정
 *         => 3+(4*7)
 *               ===
 *            =
 *         => 프로그램을 보면서 어떤 것을 우선순위 줄지 고민해야 한다.
 *         => and or 중 and가 우선
 *               
 *         
 *   5<<2 (2칸 이동해라)
 *   	101
 *    10100 (뒤에다 0 채워라)
 *    16+4 => 20
 *    9<<3 => 72
 *       1001
 *    1001000
 *    == = 
 *    64 8 => 72
 *   >>
 */

public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=3;
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int m=a/b;
		int n=a%b;
		
		System.out.printf("%d+%d=%d%n",a,b,c); // \n = %n newline
		System.out.printf("%d-%d=%d%n",a,b,d);
		System.out.printf("%d*%d=%d%n",a,b,e);
		System.out.printf("%d/%d=%d%n",a,b,m);
		System.out.printf("%d%%d=%d%n",a,b,n);
		System.out.printf("%d%%%d=%d%n",a,b,n); // %를 쓰고 있는 것은 2개 줘야 한다.
		
		// 서식이 있는 것은 printf가 조금 더 편할 것
		
		
		
	}

}
