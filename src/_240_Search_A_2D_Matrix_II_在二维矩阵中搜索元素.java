/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��15�� ����11:09:40 
* ��˵�� 
* ˼·1��
* 	����ȡ���Խ���Ԫ�أ�ȷ��Ŀ��Ԫ�ؿ��ܳ��ֵķ�Χ��
* ����14���ڶԽ���Ԫ���У�9<14<17.��ôĿ����ܳ����ڵ�����9֮�󣬵�����17֮ǰ

* Pick One

Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
Example:
Consider the following matrix:
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.
Given target = 20, return false.
*/
public class _240_Search_A_2D_Matrix_II_�ڶ�ά����������Ԫ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean searchMatrix(int[][] matrix, int target) {
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    		return false;
		}
    	//��matrix�����Ͻǿ�ʼ�Ƚ�
    	int col = matrix[0].length-1;	//��
    	int row = 0;					//��
    	while(col>=0 && row<matrix.length) {
    		if(target == matrix[row][col])
    			return true;
    		//�������ֵ��ʱ���л�����һ��
    		else if(target > matrix[row][col])
    			row++;
    		//�������ֵСʱ�������ƶ�
    		else //if(target < matrix[row][col])
    			col--;
    	}
    		
    	
    	return false;
    	
    }
    /*
     * �ݹ�д����
     public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        
        return helper(matrix, matrix.length - 1, 0, target);
    }
    
    private boolean helper(int[][] matrix, int x, int y, int target) {
        if (x < 0 || y > matrix[0].length - 1) {
            return false;
        }
        if (matrix[x][y] == target) {
            return true;
        } else if (matrix[x][y] > target) {
            return helper(matrix, x - 1, y, target);
        } else {
            return helper(matrix, x, y + 1, target);
        }
    }
     */
    
}
