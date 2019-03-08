import java.util.ArrayList;
import java.util.List;

/** 
* @author  suzw
* @version 创建时间：2018年9月12日 下午6:52:17 
* 类说明 
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
public class _046_Permutations_全排列 {
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
		if (tempList.size() == nums.length) {//已将全部数选出，满足条件加入结果集，结束递归
			list.add(new ArrayList<>(tempList));
		}else {
			for (int i = 0; i < nums.length; i++) {
				if (!tempList.contains(nums[i])) {// 已经选过的数不再选
					tempList.add(nums[i]); //选择当前节点
					backtracking(list, tempList, nums);
					tempList.remove(tempList.size()-1);//回溯到上一步，去掉当前节点
				}
			}
		}
		
	}
}
