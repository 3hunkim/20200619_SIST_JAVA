/*
 * 변수 선언
 * 변수 초기화
 * 변수의 값 변경
 * 다른 변수에 값 이동
 * 
 */


public class 자바변수값변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i,j는 사용하지 않는다 (글꼴이 바뀔 때 못 알아보는 경우가 생긴다)
		int a=100;
		System.out.println("a="+a);
		a=200;
		System.out.println("a="+a);
		a=300;
		System.out.println("a="+a); // 한 개의 메모리에서 a 값을 계속 변경

		int b=200; // 뒤에 있는 모든 그냥 숫자는 int로 인식, 뒤에 있는 모든 실수는 다 double로 인식
		int c=300; // c라는 메모리에 b가 가지고 있는 값을 대입해라
		int d=b+c;
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		int x,y,z;
		x=y=z=100; // 대입은 항상 뒤에서부터 앞으로 일어난다
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
		
		
		
	}

}
