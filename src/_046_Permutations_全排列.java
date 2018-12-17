import java.util.ArrayList;
import java.util.List;

/** 
* @author  suzw
* @version ����ʱ�䣺2018��9��12�� ����6:52:17 
* ��˵�� 
* Given a collection of distinct integers, return all possible permutations.
Example:
Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
*/
public class _046_Permutations_ȫ���� {
	public static void main(String[] args) {
		int[] nums = {1,3,2};
		System.out.println(permute(nums));
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		backtracking(list, new ArrayList<>(), nums);
		return list;
		
	}
	public static void backtracking(List<List<Integer>> list,List<Integer> tempList,int[] nums) {
		if (tempList.size() == nums.length) {//�ѽ�ȫ����ѡ���������������������������ݹ�
			list.add(new ArrayList<>(tempList));
		}else {
			for (int i = 0; i < nums.length; i++) {
				if (!tempList.contains(nums[i])) {// �Ѿ�ѡ����������ѡ
					tempList.add(nums[i]); //ѡ��ǰ�ڵ�
					backtracking(list, tempList, nums);
					tempList.remove(tempList.size()-1);//���ݵ���һ����ȥ����ǰ�ڵ�
				}
			}
		}
		
	}
}
