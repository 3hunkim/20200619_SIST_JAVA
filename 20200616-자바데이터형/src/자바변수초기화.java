
public class 자바변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=78;
		int eng=85;
		int math=96;

		
		/*
		 * 문자열 결합을 할 때 중요시 봐야할 것
		 * 7+7+"1"+7+7
		 * ===
		 * 14+"1"
		 * ===
		 * "141"+7
		 * "1417"+7
		 * "14177"
		 * 
		 * "총점:78"+85 ==> 총점:788596
		 */
		System.out.println("총점:"+(kor+eng+math)); // 괄호가 들어감, 그 범위를 먼저 계산하라는 뜻
		System.out.println("총점:"+kor+eng+math);
		System.out.println("평균:"+((kor+eng+math)/3));
		System.out.println("평점:"+'C'+'+');
		
		int a=65;
		char c=65; // char => 문자, 숫자 둘 다 넣을 수 있다. 다만 출력시 조금 틀림
		System.out.println("a="+a); // 숫자로 해서 숫자
		System.out.println("c="+c); // 문자로 해서 문자 
		
		int b=97;
		char d=97;
		System.out.println("b="+b);
		System.out.println("d="+d);
		
		int x=1;
		int y='1';
		System.out.println("x="+x);
		System.out.println("y="+y);
	
		// char는 문자, 정수 취급한다
		/*
		 *  long = int
		 *   8      4
		 *   
		 *   int = long
		 *    4     8   ====> ERROR
		 *    
		 *   double = int,long.float
		 *   int = double(x)
		 *   
		 *   예외 ==> char = int (나머지는 다 오류)
		 *   데이터 크기를 알아야 한다
		 *   
		 *   float f=10.6; 이건 안됨 왜냐하면 10.6d여서 d>f, 큰것은 작은것에 x
		 *   
		 *   
		 */
		
		double f=10.6;
		float g=10.6f;
		
		// byte < char < int < long < float < double
		
		System.out.println(100); // 100은 int
		System.out.println(10.8); // 실수이면 double로 10.8 double
		
		int i=21400000000L; // 오류1) 21억 이상 오류2) int<long 
		long k=21400000000; // 이건 안됨 뒤에 L을 써야함 (8비트, long으로 변경)
		long j=21400000000L;
		double l=21400000000L; // 다 가능
		 
		
		
	}

}
