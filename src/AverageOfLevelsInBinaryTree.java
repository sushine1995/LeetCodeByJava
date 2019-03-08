

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/** 
* @author  suzw
* @version 创建时间：2018年5月23日 上午10:13:40 
* 类说明 
*/
public class AverageOfLevelsInBinaryTree {
	 class TreeNode {
		    int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<Double> averageOfLevels(TreeNode root) {
    	List<Double> ans = new ArrayList<>();
    	Queue<TreeNode> queue  = new LinkedList<>();
    	TreeNode temp = new TreeNode(0);
    	if (root==null)		return null;
    	queue.add(root);
    	int size = queue.size();
    	double sum = 0;
    	while (!queue.isEmpty()) {
    		size = queue.size();
    		sum = 0;
    		for (int i = 0; i < size; i++) {
    			temp = queue.poll();
    			sum += temp.val;
				if (temp.left!=null) {
					queue.add(temp.left);
				}
				if (temp.right!=null) {
					queue.add(temp.right);
				}
			}
    		ans.add(sum/size);
		}
    	
		return ans;
        
    }

}
