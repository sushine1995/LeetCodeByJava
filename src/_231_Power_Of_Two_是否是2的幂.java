/** 
* @author  suzw
* @version ����ʱ�䣺2018��9��20�� ����3:18:47 
* ��˵�� 
*/
public class _231_Power_Of_Two_�Ƿ���2���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo2(2));
		System.out.println(isPowerOfTwo2(3));
		System.out.println(isPowerOfTwo2(4));
		System.out.println(isPowerOfTwo2(5));
		System.out.println(isPowerOfTwo2(16));
		System.out.println(isPowerOfTwo2(17));
		
	}
//Power of 2 means only one bit of n is '1', so use the trick n&(n-1)==0 to judge whether that is the case
	
	  public static boolean isPowerOfTwo(int n) {
		    if (n < 1) return false;
		    return (n & (n - 1)) == 0;
		  }
	  
    public static boolean isPowerOfTwo2(int n) {
//        if(n==1) return true;
//        if(n==0) return false;
//    	int temp = n;
//        while (temp%2==0) {
//			temp = temp/2;
//			
//		}
//        if (temp ==1) return true;
//        else return false;
        if(n <= 0) return false;
        while( n != 1) { // û�еõ����ս��
           
            if(n % 2 != 0) return false; 
             n = n/2;
        }
        return true;
    }
    
}
