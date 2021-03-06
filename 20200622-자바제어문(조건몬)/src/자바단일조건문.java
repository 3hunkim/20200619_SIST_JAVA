/*
 * 제어문
 * => 종류
 *   1. 조건문
 *    1-1. 단일 조건문
 *    	if(조건문=>true/false) 
 *    {
 *      실행문장 ==> 조건이 true일 경우에 처리하는 문장
 *    	      ==> 조건이 false가 되면 실행문장을 수행하지 않는다	   
 *    }
 *    *** 모든 제어문은 {}을 사용하지 않으면 한 개의 문장만 수행한다 
 *    
 *    예) 
 *       =========
 *       if(조건문)
 *         실행문장1
 *       ========= if가 제어하는 문장  
 *         실행문장2 ==> 무조건 실행하는 문장
 *       
 *       =========
 *       if(조건문)
 *     	 {
 *         실행문장1
 *         실행문장2
 *       }
 *       ========= if가 제어하는 문장
 *       
 *     1-2. 선택 조건문 :
 *       true일 경우 => 처리문장
 *       false일 경우 => 처리문장   
 *       예) 로그인 처리가 될 경우
 *          로그인 처리가 안된 경우
 *     
 *       형식)
 *         if(조건문)
 *          조건이 true일 경우에 처리 문장
 *         else
 *         조건이 false일 경우에 처리 문장
 *     
 *     1-3. 다중 조건문 : 조건에 해당하는 문장만 수행 => 한번만 수행
 *         if(조건문) 
 *          실행문장1 => 조건문이 true일 때 수행하고 종료
 *         else if(조건문)
 *          실행문장2 => 조건문이 true일 때 수행하고 종료
 *        else if(조건문)
 *          실행문장3 => 조건문이 true일 때 수행하고 종료
 *        else if(조건문)
 *          실행문장4 => 조건문이 true일 때 수행하고 종료
 *        
 *        15
 *        정수 입력 => 3의 배수, 5의 배수, 7의 배수
 *        여러번 하고 빠져나가야 하는 문장인지 따로 하고 빠져나가야하는 문장인지
 *        if(조건문) *if 문장이 여러개 있다고 다항이 아니다, if 단일이 여러개 있는 것이다
 *         실행문장
 *        if(조건문)
 *         실행문장
 *        if(조건문)
 *         실행문장
 *         
 *      2. 선택문
 *         
 *      3. 반복문
 */

public class 자바단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=60;
		// score가 60 이상이면 성공
		// 60이하면 실패
		if (score>=60)
		{	
			System.out.println("첫번째 if문 수행");
			System.out.println("Success"); // if 조건문이 true일 때 수행하는 문장
		}
		if (score<60)
		{	
			System.out.println("두번쨰 if문 수행");
			System.out.println("Fail");
		}
		
	}

}
