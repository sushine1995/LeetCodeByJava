
/**
 * 
 */
/** 
* @author  suzw
* @version 创建时间：2018年8月28日 下午4:14:23 
* 类说明 
*/
/**
 * @author su823
 *
 */
public class LargestTriangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = {{0,0},{0,1},{1,0},{2,0},{0,2}};
		System.out.println(largestTriangleArea(points));

	}
	public static double largestTriangleArea (int[][] points) {
		double ans = 0;
		double S = 0;
		for (int i = 0; i < points.length; i++) {
			int[] pointA = points[i];
			for (int j = 0; j < points.length; j++) {
				int[] pointB = points[j];
				for (int k = 0; k < points.length; k++) {
					int[] pointC = points[k];
					S = 0.5*(((pointA[1]-pointB[1])*(pointC[0]-pointB[0]))+
							((pointB[1]-pointC[1])*(pointA[0]-pointC[0]))+
							((pointB[1]-pointC[1])*(pointC[0]-pointB[0])));
					System.out.println(S);
					if (S>ans) {
						ans =S ;
						printPoint(pointA);
						printPoint(pointB);
						printPoint(pointC);
						System.out.println(S);
						//System.err.println(pointA[0] + pointA[1]+","+pointB);
					}
				}
			}
		}
		return ans;
		
	}
	
	public static void printPoint (int[] point) {
		System.out.print("("+point[0]+","+point[1]+")"+",");
		
	}

}
