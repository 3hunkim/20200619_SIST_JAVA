/*
 *  if(조건문) : 조건문은 무조건 결과값 => true/false
 *    => 필요한 경우에만 문장을 수행 (조건:true일 때문)
 *       false일 경우에는 건너뛴다 (문장을 수행하지 못한다))))000000000000000000000000000
 */


public class 자바단일조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		System.out.println(1);
		System.out.println(2);
		
		if(a%2==0)
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		
		// 알파벳을 저장 => 대문자, 소문자
		char alpha='\t';
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"는 대문자입니다");
		if(alpha>='가' && alpha<='힣')
			System.out.println(alpha+"는 대문자입니다");
		 
		// 특수문자
		if(alpha=='\t' || alpha=='\n') // 특수문자는 부여된 숫자가 없다.
			System.out.println("특수문자 입니다.");
	}

}
