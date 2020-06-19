/*
 * 대입 ==> 결과값을 받는다
 * 종류)
 * 	   = ==> int a=10 => 10을 a라는 메모리에 대입
 *     복합대입연산자
 *     op= ==> op(연산자)
 *     +=
 *       ====> 예)
 *       	   int a=10;
 *       	   a+=2; =====> a=a+2
 *       	   a=12	
 *     -=
 *     	 ====> 예)
 *     		   int a=10;
 *     		   a-=5; =====> a=a-5
 *             a=5
 *     *=
 *       ====> 예)
 *             int a=10;
 *             a*=5; =====> a=a*5 
 *             a=50
 *     /=
 *       ====> 예)
 *             int a=10;
 *             a/=3; =====> a=a(10)/3
 *             a=3
 *     %=
 *     	 ====> 예)
 *             int a=10;
 *             a%=3; =====> a=a%3
 *             a=1
 *     &=
 *       ====> 예)
 *             int a=10;
 *             a&=3  =====> a=a&3
 *             1010
 *             0011
 *             ====
 *             0010  =====> 2
 *     |=
 *       ====> 예)      
 *             int a=10;
 *             a|=3  =====> a=a|3
 *             1010
 *             0011
 *             ====
 *             1011  =====> 11
 *     <<=
 *       ====> 예)
 *       	   int a=10;
 *             a<<=3; ===> a=a<<3 ==> a=10<<3
 *             10*2^3
 *             a=80
 *     >>=
 *       ====> 예
 *       	   int a=10;
 *             a>>=3; ===> a=a>>3 ==> a=10>>3                    
 *             10/2^3 ===> 10/8 ===> 1
 *             a=1
 *             
 *     한 개 증가 : 증가연산자 (++)
 *     원하는 갯수만큼 증가 : 복합대입연산자 (+=)       
 *     한개 증가
 *     a++
 *     ++a
 *     a+=1
 *     a=a+1 
 *      
 */


public class 이항연산자_대입연산자 {
	// 증가 ==> 1씩 증가 (++)
	// 3번 증가 ==> a++;a++;a++ ==> a+=3 복합대입연산자를 쓰는게 편하다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a+=5; // a=a+5 ==> 15
		System.out.println("a="+a);
		
		int b=10;
		b-=5; // b=b-5 ==> 5 ==> b값에 5를 빼라
		System.out.println("b="+b);
		
		int c=10;
		c=c*5; // c*=5
		// c = c*5 
		//   = 10
		System.out.println("c="+c);
		
		int d=10;
		d/=3; // d=d/3
		System.out.println("d="+d);
	
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0) // i를 2로 나눈게 0이 아닌거 or 위에 i+=2
			System.out.println("i="+i);
		}
	}

}
