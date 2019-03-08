

//import day15.TreeNode;

/** 
* @author  suzw
* @version 创建时间：2018年5月30日 上午11:03:24 
* 类说明 
* 104. Maximum Depth of Binary Tree
* Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
Note: A leaf is a node with no children.
Example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
*/
public class _102_MaxinumDepthOfBinaryTree_二叉树的最大深度 {
	class TreeNode {
	    int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//使用递归
    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
	//方法1：和day15-求二叉树每层的平均数相似
    /*
    public int maxDepth(TreeNode root) {
    	
    	Queue<TreeNode> queue  = new LinkedList<>();
    	TreeNode temp = new TreeNode(0);
    	if (root==null)		return 0;
    	queue.add(root);
    	int size = queue.size();
    	int depth = 0;
    	while (!queue.isEmpty()) {
    		size = queue.size();
    		depth++;
    		for (int i = 0; i < size; i++) {
    			temp = queue.poll();
    			if (temp.left!=null) {
    				queue.add(temp.left);
    			}
    			if (temp.right!=null) {
    				queue.add(temp.right);
    			}
    		}
    	}
    	return depth;
    }
	*/
}

