/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��9�� ����10:00:18 
* 
* ˼·��
	���������������ʣ� ��ڵ�/������С�� �м�/���ڵ㣬 �ҽڵ�/���������� �м�/���ڵ㡣
		��p��q��ͬһ�࣬�綼��������ʱ��p.val-root.val ��q.val - root.valͬ�ţ���ʱ����p.val-root.val�ķ��ţ���rootת��Ϊ����ڵ���ҽڵ�
		��������ͬ��ʱ��˵���ҵ��˶��ߵĹ������ȣ�
		
* ��˵�� 
* ����һ������������, �ҵ�����������ָ���ڵ������������ȡ�
�ٶȰٿ�������������ȵĶ���Ϊ���������и��� T ��������� p��q������������ȱ�ʾΪһ����� x������ x �� p��q �������� x ����Ⱦ����ܴ�һ���ڵ�Ҳ���������Լ������ȣ�����
���磬�������¶���������:  root = [6,2,8,0,4,7,9,null,null,3,5]
        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
ʾ�� 1:
����: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
���: 6 
����: �ڵ� 2 �ͽڵ� 8 ��������������� 6��
ʾ�� 2:
����: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
���: 2
����: �ڵ� 2 �ͽڵ� 4 ��������������� 2, ��Ϊ���ݶ�������������Ƚڵ����Ϊ�ڵ㱾��
˵��:
���нڵ��ֵ����Ψһ�ġ�
p��q Ϊ��ͬ�ڵ��Ҿ������ڸ����Ķ����������С�
*/
public class _235_Lowest_Commom_Ancestor_Of_A_Binary_Search_Tree_����������������������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public  static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(Math.signum(p.val - root.val)*Math.signum(q.val - root.val)>0) {
        	root = p.val>root.val?root.right:root.left;
            	
        }
		
		return root;
    }
}
