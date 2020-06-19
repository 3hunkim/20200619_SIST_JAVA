/*
 * 논리연산자
 * 형식) && (직렬), || (병렬)
 * 	   =========    ======
 * 		2개 true		1개 이상 true
 *     && => 범위나 기간을 포함
 *     || => 범위나 기간을 벗어나는 경우에 주로 사용
 *     
 *     90 100
 *     
 *     jumsu>=90 (&&) jumsu<=100
 *     jumsu<=0 || jumsu>100
 *     
 *     조건 (&&,||) 조건
 *     ===		  ===
 *     true/false true/false
 *     
 *          &&   || 
 *     ============
 *     T T  T	 T
 *     ============
 *     T F  F    T   
 *     ============
 *     F T  F    T
 *     ============
 *     F F  F    F
 *     ============
 *     
 *     6<5 && 10==10
 *     ===	  ======
 *      F   &&	 T ==> false
 *      
 *     영화 예매시 날짜 기간 (19일~21일 예매가능 기간)
 *     && 연산자로 이어버림
 *     
 *     효율적인 연산
 *     int a = 10;
 *     int b = 9;
 *     a<b && ++b=a
 *     ===	  =====
 *     		   연산수행여부
 *      F  
 *      앞이 F면 뒤는 하지 않기 때문에 b=9가 됨      
 *     && ==> 왼쪽에 있는 조건이 F면 수행을 하지 않음
 *     || ==> 왼쪽에 있는 조건이 T면 연산을 수행하지 않음
 *     '효율적으로 하기 위해'	
 *     
 *     &&는 F일 조건이 앞으로
 *     ||는 T일 조건이 앞으로 
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		int i = 65;
		char c2 = 'B';
		boolean bCheck=c1==i || ++c1==c2;
		/*
		 * System.out.println(c1==i || ++c1==c2); System.out.println(c1); // 증가 안함, 앞이
		 * 이미 T여서
		 */
		/*
		 * System.out.println(bCheck); System.out.println(c1);
		 */
		// 변수값을 받아놔야 하는 경우, 아이디가 있는지 없는지? 변수값을 받아봐야 알 수 있기 때문에		
		
		if(bCheck==false)
		{
			System.out.println("c1이 한개 증가");
		}
		else
		{
			System.out.println("c1이 한개 증가 안됨");
		}
		
		
		/*
		 *  로그인 => 결과값 출력
		 *  결과값 받고 상대방에게 보낼 것인지?
		 *  아이디 틀렸으면 틀렸다고 보내고
		 *  
		 */
		
				

	}

}
