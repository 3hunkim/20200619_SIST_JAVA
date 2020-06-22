/*
 * 사용자 입력 ==> 0, 1, 2
 * 
 * => 0이면 => 가위
 * => 1이면 => 바위
 * => 2이면 => 보
 * 
 */
import java.util.*;
public class 자바조건문문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan=new Scanner(System.in); S
		 * System.out.println("가위바위보:");
		 * int a=scan.nextInt();
		 * 
		 * if(a==0) { System.out.println("가위"); } else if(a==1) {
		 * System.out.println("바위"); } else if(a==2) { System.out.println("보"); } else {
		 * System.out.println("가위바위보 모름?"); }
		 */
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0) 바위(1) 보(2) 게임");
		
		int user=scan.nextInt();
				
		if(user==0) // 같다(==)
		{
			System.out.println("Player:가위");
		}
		if(user==1)
		{
			System.out.println("Player:바위");
		}
		if(user==2)	
		{
			System.out.println("Player:보");
		}
		
		// 컴퓨터
		
		int com=(int)(Math.random()*3); // math.random()은 0.0~0.99를 줌, 거기에 * 3하면 0.0~2.9(더블형)
		
		if(com==0)
		{
			System.out.println("Computer:가위");
		}
		if(com==1)
		{
			System.out.println("Computer:바위");
		}
		if(com==2)
		{
			System.out.println("Computer:보");
		}
		
		/* 배열을 활용하면 3줄 컷 가능
		 * String[] value= {"가위","바위","보"} 
		 * System.out.println("컴퓨터:"+value[com]);
		 * System.out.println("유저:"+value[user]);
		 */
		
		/*
		 *  컴퓨터 : 
		 *    가위 => 0
		 *    	 사용자 : user
		 *       가위 => 0 => 0
		 *       바위 => 1 => (-1)
		 *       보 => 2 => (-2)
		 *    바위 => 1
		 *       사용자 : user 1,1
		 *       가위 => 0 => 1
		 *       바위 => 1 => 0
		 *       보 => 2 => (-1)
		 *    보 => 2
		 *       사용자 : user 2,-1
		 *       가위 => 0 => (2)
		 *       바위 => 1 => 1
		 *       보 => 2 => 0
		 *             
		 *  if(com-user==-2 || com-user==1)
		 *  {
		 *  	System.out.println("Computer Win!!");
		 *  }
		 *  if(com-user==-1 || com-user==2)
		 *  {
		 *  	System.out.println("Player Win!!");
		 *  }
		 *  if(com-user==0)
		 *  {
		 *  	System.out.println("비겼다!!");
		 *  }
		 *  
		 *  == 정수,실수,문자일 경우에는 사용이 가능
		 *  "" 문자열은 ==으로 비교가 불가능 => equals()
		 */
		
		//컴퓨터가 가위일 때
		if(com==0)
		{
			if(user==0) //중첩 if문, if(com==0 && user==0)
			{
				System.out.println("비겼다!!");
			}
			if(user==1)
			{
				System.out.println("Player Win!!");
			}
			if(user==2)
			{
				System.out.println("Computer Win!!");
			}
		}
		if(com==1)
		{
			if(user==0)
			{
				System.out.println("Computer Win!!");
			}
			if(user==1)
			{
				System.out.println("비겼다!!");
			}
			if(user==2)
			{
				System.out.println("Player Win!!");
			}
		}
		if(com==2)
		{
			if(user==0)
			{
				System.out.println("Player Win!!");
			}
			if(user==1)
			{
				System.out.println("비겼다!!");
			}
			if(user==2)
			{
				System.out.println("Computer Win!!");
			}
		}
	}

}
