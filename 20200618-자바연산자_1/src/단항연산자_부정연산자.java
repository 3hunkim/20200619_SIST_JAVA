/*
 * ���������� (�׻� boolean�� ������ ���� �ƴ�, ���� ������� �̷��� Ȱ�� if(!id))
 * 	=> true=>false , false=>true
 *  => ����� : boolean // ������ �ϰ� �Ǹ� ������� �������� ���� �������� Ȯ�� �ؾ� �Ѵ� eg) 6<5 �̷���? true/false�� boolean����
 *     
 *     ���� : ���� => int
 *     		 ���� => boolean
 *     
 *     ���� : ��� => ? (������� �� �� ����)
 *     		int + int = int
 *     		double + int = double
 *     		�̷��ٺ��� ����� �غ��� �� �� �ִ�.
 *     		��, �� => boolean (������~)
 *     
 *     ���׿����� : ? (������� �ϳ��� ���ϵǾ� ���� ����)
 *     			 ����?��1:��2
 *     			sex==1?"����":"����" (�ֹι�ȣ �� ��, ����� ����)
 *     			sex==1?1:2
 */


public class ���׿�����_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=true;
		bCheck=!bCheck; // ���� bCheck�� true�� �ݴ밪�� �����Ѵٴ� ��
		for(int i=0;i<10;i++) 
		{bCheck=!bCheck;
		System.out.println("bCheck="+bCheck);
		}
		
		boolean Man=false;
		Man=!Man;
		System.out.println("Man="+Man);
		if(Man==true)
		{ 
			System.out.println("����");
		} 
		else
		{ 
			System.out.println("��ǻ��");		
		} //������ �����ư��鼭 �ϴ� ���� ���������ڷ� ����� ��찡 ����.
	
	}

}
