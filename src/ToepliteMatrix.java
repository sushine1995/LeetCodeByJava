
/** 
* @author  suzw
* @version 创建时间：2018年5月11日 上午10:07:25 
* 类说明 
*/
public class ToepliteMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a= new int
		
	}

	 public static boolean isToeplitzMatrix(int[][] matrix) {
		 //int length = matrix.length;
		 //int width = matrix[0].length;
		 for (int i = 0; i < matrix.length-1; i++) {
			for (int j = 0; j < matrix[i].length-1; j++) {
				if(matrix[i][j] != matrix[i+1][j+1]) return false;				
			}
		}
		 
		 return false;
		 
	 }
	 
	        
		    
}
