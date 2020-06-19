import java.util.*; // Scanner => 이전에 만들어진 자바파일을 읽어 온다
/*
 * class Scanner {
 * } 스캐너를 전체에 깔고 가는 느낌
 * 
 * 정수 입력:
 * 100 
 * 
 * 
 */
public class 자바입출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력값 받기
		/*
		 *  System.out.println("정수 입력:"); ln = line
		 *  System.out.printf("정수 입력:\n"); \n을 한 번 더 써주나 안 써주나 차이
		 */
		Scanner scan = new Scanner(System.in);
		System.out.printf("실수 입력:"); // \n , \t 줄 넘김하려나 간격 띄려나
		double a = scan.nextDouble(); 
		// double이 되면 a=100이 아니라 a=100.0이 됨 (실수)
		// char a=97 => a='a'
		System.out.println("a="+a);

	}

}
