/*
 * ��Ʈ������ => ��Ʈ�� ��Ʈ�� �����ϴ� ��
 *    8 (int=32bit)
 *    =========
 *     1 0 0 0 (�� �ϳ��ϳ��� bit, 32bit, 0/1�� 32��)
 *    ========= 
 *    6 (int=32bit)
 *    =========
 *     0 1 1 0
 *    ========= ��Ʈ�� ���ƾ� ������ �ȴ�. 
 *     
 *       &   |   ^  ==> ȸ��, ��ȣȭ, ��ȣȭ
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
 *    & = �Ѵ� ���̾�� ��
 *    | = �ϳ��� ���̾ ��
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
 *    & => *�� �Ѵ�
 *    | => +�� �Ѵ�
 *    ^ => �ٸ� ��Ʈ�� ã�´�
 *    
 */


public class ���׿�����_��Ʈ������ {

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
