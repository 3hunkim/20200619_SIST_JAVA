/*
 * 필요시에 다르다
 * 
 *  double
 * 
 *  char + int = int
 *  ===
 *  int
 *  
 *  int + long = long // 가장 큰 값을 따라 간다. (자동형변환)
 *  ===
 *  long
 *  
 *  char + int + long + double = double (자동형변환 과정)
 *  ===
 *  int
 *  ==========
 *  int
 *  =================
 *  long
 *  ==========================
 *  double
 *  
 *  (int)double => int // int가 된다 강제형변환 큰데이터=>작은데이터로 변경하기 위해
 *  (char)int => char // 
 *  
 *  형변환 예외상황
 *  1) boolean은 제외
 *  2) int이하는 연산을 하면 결과값이 int다
 *     char+char => int
 *     short+byte => int
 *     char+byte+short==> int
 * 
 *  
 */

public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		byte c=20;
		byte d=(byte)(b+c); // byte d=b+c는 오류가 납니다. int로 바뀌기 때문에
	    System.out.println("d="+d);
	    
	    int g='A'; // g=65
	    double h=10; // h=10.0
	    // int
	    char j=65; // j='A'
	    System.out.println("g="+g);
	    System.out.println("h="+h);
	    System.out.println("j="+j);
	    
	    // 강제형변환
	    int i=(int)10.5348; //반올림 안하고 다 버림함
	    int ii='A';
	    int jj=(int)'A';
	    System.out.println("i="+i);
	    System.out.println("ii="+ii);
	    System.out.println("jj="+jj);
	}

}
