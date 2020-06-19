/*
 * 부정연산자 (항상 boolean만 나오는 것은 아닌, 이후 제어문에서 이렇게 활용 if(!id))
 * 	=> true=>false , false=>true
 *  => 결과값 : boolean // 연산을 하게 되면 결과값이 데이터형 뭐로 나오는지 확인 해야 한다 eg) 6<5 이런건? true/false니 boolean으로
 *     
 *     단항 : 증감 => int
 *     		 부정 => boolean
 *     
 *     이항 : 산술 => ? (결과값을 알 수 없음)
 *     		int + int = int
 *     		double + int = double
 *     		이러다보니 계산을 해봐야 알 수 있다.
 *     		비교, 논리 => boolean (무조건~)
 *     
 *     삼항연산자 : ? (결과값이 하나로 통일되어 있지 않음)
 *     			 조건?값1:값2
 *     			sex==1?"남자":"여자" (주민번호 할 때, 만들기 나름)
 *     			sex==1?1:2
 */


public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=true;
		bCheck=!bCheck; // 원래 bCheck의 true의 반대값을 저장한다는 말
		for(int i=0;i<10;i++) 
		{bCheck=!bCheck;
		System.out.println("bCheck="+bCheck);
		}
		
		boolean Man=false;
		Man=!Man;
		System.out.println("Man="+Man);
		if(Man==true)
		{ 
			System.out.println("본인");
		} 
		else
		{ 
			System.out.println("컴퓨터");		
		} //턴제나 번갈아가면서 하는 것은 부정연산자로 만드는 경우가 많다.
	
	}

}
