/** 
* @author  suzw
* @version 创建时间：2018年9月30日 下午7:16:04 
* 类说明 
*/
public class testByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dist = new int[3];
		dist[0] = 12;
		String districtCode = "433101";
		
	
		int dCode = Integer.parseInt(districtCode);
		int[] resArr = new int[3];
		resArr[0] = dCode / 10000;
		resArr[1] = dCode % 10000 / 100;
		resArr[2] = dCode % 100;
		for (int i : resArr) {
			System.out.println(i);
		}
		
		for (int i : resArr) {
			System.out.println((byte)43);
		}
		
	}

	//return resArr;
}
