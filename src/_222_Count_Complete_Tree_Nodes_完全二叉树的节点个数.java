import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

/** 
* @author  suzw
* @version ����ʱ�䣺2018��9��18�� ����5:05:29 
* ��˵�� 
*/
public class _222_Count_Complete_Tree_Nodes_��ȫ�������Ľڵ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;      
        ArrayList<TreeNode> result = new ArrayList<TreeNode>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            result.add(temp);
            
            if(temp.left!=null)
                q.add(temp.left);
            
            if(temp.right!=null)
                q.add(temp.right);
        }
        return result.size();
    }
	/*
	 * 
	 * ���ݹ�ת��Ϊѭ���Ҹ�ѭ��������Ҫʹ��ջ�������ݽṹʱ��
	 * ����������õ��ʵķ�Ծ���������˼·���в��õݹ飬���������ǽ��ݹ�ת��Ϊѭ����
	 * ͬʱ����ֻ��Ҫ����һ�����ĸ߶ȣ���Ϊÿһ��ѡ��������ĸ߶ȶ�����һ���߶�-1��
	 */
	int height2(TreeNode root){
        if(root==null) return -1;
        int height = 0;
        while(root.left!=null) {height++; root=root.left;}
        return height;
    }
    
    public int countNodes2(TreeNode root) {
        int count = 0;
        int height = height2(root);
        while(root!=null){
            if(height2(root.right)==height-1){
                count += 1<<height;
                root = root.right;
            }else{
                count += 1<<height-1;
                root = root.left;
            }
            height--;
        }
        return count;
    }
    
    
	/*
	 * �÷�����ʱ
	 */
	public static int countNodes_bak(TreeNode root) {
		
		if (root == null)  return 0;
		int num = 1;
		//ֱ��return���������һЩ
		//return 1+countNodes(root.left)+countNodes(root.right);
		
		if (root.left!= null) {
			num +=countNodes_bak(root.left);
		}
		else return num;
		if (root.right!= null) {
			num +=countNodes_bak(root.right);
		}
		return num;
		
		
	}
	
}
