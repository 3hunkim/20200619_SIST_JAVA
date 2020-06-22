
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		// char ccc=65;
		char cc=(char)(c+32); //대문자랑 소문자의 차이는 32	        		
		//             ====
		//              A+32 => int+int=int가 되서 형변환 해야함
		System.out.println(cc); // 소문자 변환 => 형변환
		
		System.out.println(c>='A' && c<='Z' ? "대문자":"소문자");
	    /*                 =====     =====
	     * 				     T         T
	     * cc>='A' && cc<='Z' ==> 대문자, cc가 A에서 Z사이
	     * cc>='a' && cc<='z' ==> 소문자, cc가 a에서 z사이
	     */
	}

}
