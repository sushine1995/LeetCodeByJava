
/** 
* @author  suzw
* @version 创建时间：2018年4月19日 上午9:38:16 
* 类说明 
* 
给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
示例 1:
输入: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
输出: 
合并后的树:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
注意: 合并必须从两个树的根节点开始。
*/
public class _617_MergeTwoBinaryTree_合并二叉树 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public TreeNode mergeTrees0(TreeNode t1, TreeNode t2) {
        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees0(t1.left , t2.left);
        t1.right = mergeTrees0(t1.right , t2.right);
        return t1;
    }
    
    
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		}
		int originVal = (t1 == null ? 0 :t1.val) + (t2 == null ? 0 : t2.val);
		
		TreeNode TreeNode = new TreeNode(originVal);
		
		TreeNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null :t2.left);
		TreeNode.right = mergeTrees(t1 == null ? null :t1.right, t2 == null ? null : t2.right);
		
		return TreeNode; 
		
	}
	public static TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		}
		else if( t1 == null)	return t2;
		else if( t2 == null) 	return t1;
		int originVal = (t1 == null ? 0 :t1.val) + (t2 == null ? 0 : t2.val);
		
		TreeNode TreeNode = new TreeNode(originVal);
		
		TreeNode.left = mergeTrees2(t1.left, t2.left);
		TreeNode.right = mergeTrees2(t1.right, t2.right);
		
		return TreeNode; 
		
	}

}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}
}
