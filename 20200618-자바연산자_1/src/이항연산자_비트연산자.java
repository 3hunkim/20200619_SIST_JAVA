/*
 * 비트연산자 => 비트와 비트를 연산하는 것
 *    8 (int=32bit)
 *    =========
 *     1 0 0 0 (요 하나하나가 bit, 32bit, 0/1이 32개)
 *    ========= 
 *    6 (int=32bit)
 *    =========
 *     0 1 1 0
 *    ========= 비트가 같아야 연산이 된다. 
 *     
 *       &   |   ^  ==> 회로, 암호화, 복호화
 *      (*) (+) 
 *    ==============
 *    00 0   0   0
 *    01 0   1   1
 *    10 0   1   1
 *    11 1   1   0
 *    ==============
 *    10 & 5 
 *    
 *    1010 
 *    0101
 *    ==== & 
 *    0000 ==> 0
 *    
 *    & = 둘다 참이어야 참
 *    | = 하나만 참이어도 참
 *
 *    
 *    1010 
 *    0101
 *    ==== & 
 *    0000 ==> 0
 *    ====
 *    
 *    1010
 *    0101
 *    ==== |
 *    1111 ==> 15
 *    
 *    1010
 *    0101
 *    ==== ^
 *    1111 ==> 15
 *    
 *    & => *를 한다
 *    | => +를 한다
 *    ^ => 다른 비트를 찾는다
 *    
 */


public class 이항연산자_비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10&5);
		System.out.println(10|5);
		System.out.println(10^5);

		System.out.println(27&13);
		System.out.println(27|13);
		System.out.println(27^13);
		System.out.println(0b10110);
        System.out.println(0b01001);
        System.out.println(0b11111);
	}

}
