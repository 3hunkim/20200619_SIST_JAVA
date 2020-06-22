/*
 *  if(Á¶°Ç¹®) : Á¶°Ç¹®Àº ¹«Á¶°Ç °á°ú°ª => true/false
 *    => ÇÊ¿äÇÑ °æ¿ì¿¡¸¸ ¹®ÀåÀ» ¼öÇà (Á¶°Ç:trueÀÏ ¶§¹®)
 *       falseÀÏ °æ¿ì¿¡´Â °Ç³Ê¶Ú´Ù (¹®ÀåÀ» ¼öÇàÇÏÁö ¸øÇÑ´Ù))))000000000000000000000000000
 */


public class ÀÚ¹Ù´ÜÀÏÁ¶°Ç¹®3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		System.out.println(1);
		System.out.println(2);
		
		if(a%2==0)
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		
		// ¾ËÆÄºªÀ» ÀúÀå => ´ë¹®ÀÚ, ¼Ò¹®ÀÚ
		char alpha='\t';
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"´Â ´ë¹®ÀÚÀÔ´Ï´Ù");
		if(alpha>='°¡' && alpha<='ÆR')
			System.out.println(alpha+"´Â ´ë¹®ÀÚÀÔ´Ï´Ù");
		 
		// Æ¯¼ö¹®ÀÚ
		if(alpha=='\t' || alpha=='\n') // Æ¯¼ö¹®ÀÚ´Â ºÎ¿©µÈ ¼ýÀÚ°¡ ¾ø´Ù.
			System.out.println("Æ¯¼ö¹®ÀÚ ÀÔ´Ï´Ù.");
	}

}
