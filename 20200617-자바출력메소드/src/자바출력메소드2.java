import java.util.Scanner;

import javax.swing.JOptionPane;

public class 자바출력메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \n newline => 새로운 줄 출력
		// \t tab => 일정 간격 띄기
		/*
		 * System.out.printf("%d*%d=%d\n",2,2,4); // \n(newline) 새로운 줄에 출력해라 안쓰면 //
		 * System.out.printf("%d*%d=%d",2,3,6); // 결과값이 옆으로 붙어버림 (2*2=42*3=6)
		 */
		
		Scanner scan=new Scanner(System.in);
		/*
		 * Scanner : 데이터 형
		 * scan : 변수
		 * new : 메모리에 저장
		 * Scanner(System.in) : 초기화
		 */
		
		/*
		 * System.out.print("1' 정수입력:"); int a=scan.nextInt(); // 입력된 정수를 읽어와서 a라는 메모리에
		 * 저장 // System.out.print("2' 정수입력:"); int b=scan.nextInt();
		 * 
		 * System.out.println("a="+a); System.out.println("b="+b);
		 * 
		 * JOptionPane.showInputDialog("정수");
		 */
		
		// Scanner => 도스에서만 사용
		
		/*
		 * System.out.println(~100); // 반전 연산자, -101
		 * 
		 * 
		 * 
		 */
		
         System.out.println(Integer.toBinaryString(240));
         System.out.println(Integer.toHexString(240));
         System.out.println(Integer.toOctalString(240));
         
         System.out.println(0xf0);
         System.out.println(0360);
         System.out.println(0b11110000);
         System.out.println(~100);
		
	}

}
