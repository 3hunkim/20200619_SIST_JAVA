import java.util.*;
public class 자바조건문문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); // 한번만 쓰면 여러번을 받을 수 있다
		System.out.println("국어점수 영어점수 수학점수 입력:"); // 공백을 주면서 3개의 값을 받을 수 있음
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int total=kor+eng+math;
		double avg=total/3.0;
		char score='A';
		
		if(avg>=90 && avg<=100)
		{
			score='A';
		}
		if(avg>=80 && avg<90)
		{
			score='B';
		}
		if(avg>=70 && avg<80)
		{
			score='C';
		}
		if(avg>=60 && avg<70)
		{
			score='D';
		}
		if(avg<60)
		{
			score='F';
		}

		System.out.println("총점:"+total);
		System.out.printf("평균:%.1f%n",avg); // println을 쓰면 소수점 6자리까지 써버림
		System.out.println("학점:"+score);

	}

}
