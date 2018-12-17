/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��9�� ����10:16:15 
* ��˵��
* ���һ��
//˼·��
 *���������ͬʱ������p��q����ô�ýڵ����LCA�����
 	1. �ֱ�����������������p��q�����

����һ��������, �ҵ�����������ָ���ڵ������������ȡ�
�ٶȰٿ�������������ȵĶ���Ϊ���������и��� T ��������� p��q������������ȱ�ʾΪһ����� x������ x �� p��q �������� x ����Ⱦ����ܴ�һ���ڵ�Ҳ���������Լ������ȣ�����
���磬�������¶�����:  root = [3,5,1,6,2,0,8,null,null,7,4]
        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2       0       8
         /  \
         7   4
ʾ�� 1:
����: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
���: 3
����: �ڵ� 5 �ͽڵ� 1 ��������������ǽڵ� 3��
ʾ�� 2:
����: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
���: 5
����: �ڵ� 5 �ͽڵ� 4 ��������������ǽڵ� 5����Ϊ���ݶ�������������Ƚڵ����Ϊ�ڵ㱾��
˵��:
���нڵ��ֵ����Ψһ�ġ�
p��q Ϊ��ͬ�ڵ��Ҿ������ڸ����Ķ������С� 

*/
public class _236_Lowest_Common_Ancestor_Of_A_Binary_Tree_������������������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	     if (root == null || p == root || q == root) {
	    	 return root;
			
		}   
	     
	     TreeNode left = lowestCommonAncestor(root.left, p, q);
	     TreeNode right = lowestCommonAncestor(root.right, p, q);
	     
		 
		 return left!=null && right!= null ? root:(left!=null?left:right);
	    }
}
