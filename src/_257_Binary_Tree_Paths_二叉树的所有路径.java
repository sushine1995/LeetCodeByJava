import java.util.ArrayList;
import java.util.List;

/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��22�� ����3:52:46 
* ��˵�� 
* ����һ�����������������дӸ��ڵ㵽Ҷ�ӽڵ��·����

˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣

ʾ��:

����:

   1
 /   \
2     3
 \
  5

���: ["1->2->5", "1->3"]
����: ���и��ڵ㵽Ҷ�ӽڵ��·��Ϊ: 1->2->5, 1->3
*/
public class _257_Binary_Tree_Paths_������������·�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<String> binaryTreePaths(TreeNode root){
		List<String> ans = new ArrayList<>();
		if (root!=null) searchPath(root, "", ans);
		return ans;
	}
	public static void searchPath(TreeNode root, String currentPath, List<String> ans ) {
		
		if (root.left==null && root.right ==null) 	ans.add(currentPath+root.val);
		if(root.left!=null) searchPath(root.left, currentPath+root.val+"->", ans);
		if(root.right!=null) searchPath(root.right, currentPath+root.val+"->", ans);
	}

}
