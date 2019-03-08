
/** 
* @author  suzw
* @version 创建时间：2018年4月18日 上午10:34:02 
* 类说明 
*/
public class HammingDistanceNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int hammingDistance(int x ,int y) {
		int ans=0;
		int xor = x ^y;
		for(int i = 0;i < 32; i++) 
			ans += (xor >> i) &1;		
		return ans;
	}
}
