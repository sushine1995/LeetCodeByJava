import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

/** 
* @author  suzw
* @version ����ʱ�䣺2018��9��12�� ����6:52:17 
* ��˵�� 
* Given a collection of numbers that might contain duplicates, return all possible unique permutations.
Example:
Input: [1,1,2]
Output:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
*/
public class _047_Permutations_ȫ����2 {
	public static void main(String[] args) {
		int[] nums = {1,1,3};
		System.out.println(permuteUnique(nums));
	}
	public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        helper(nums, res, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }
    
	//ʹ��BackTracking
    public static void helper(int[] nums, List<List<Integer>> res, List<Integer> list, boolean[] used) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<Integer>(list));
        }
        
        for (int i = 0; i < nums.length; i++) {
        	//��used[i-1]=0����nums[i]=nums[i-1]��i>0ʱ
        	//��used[i] = 1�ѷ���
            if (used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
            list.add(nums[i]);
            used[i] = true;
            helper(nums, res, list, used);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }

	/*
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		int[] newNums = toNoDuplicates(nums);
		backtracking(list, new ArrayList<>(), newNums);
		
		return reBackNums(list, nums);
	}
	public static void backtracking(List<List<Integer>> list,List<Integer> tempList,int[] newNums) {
		if (tempList.size() == newNums.length) {//�ѽ�ȫ����ѡ���������������������������ݹ�
			list.add(new ArrayList<>(tempList));
		}else {
			for (int i = 0; i < newNums.length; i++) {
				if (!tempList.contains(newNums[i])) {// �Ѿ�ѡ����������ѡ
					tempList.add(newNums[i]); //ѡ��ǰ�ڵ�
					backtracking(list, tempList, newNums);
					tempList.remove(tempList.size()-1);//���ݵ���һ����ȥ����ǰ�ڵ�
				}
			}
		}
	}
	
	public static int[] toNoDuplicates(int[] nums) {
		int[] newNums = nums.clone();
		for (int i = 0; i < newNums.length; i++) 
			newNums[i] = i;
		return newNums;		
	}
	
	public static List<List<Integer>> reBackNums(List<List<Integer>> list,int[] nums) {	
		Map<List<Integer>, Integer> map = new HashMap<>();
		for (List<Integer> i : list) {
			for (int j =0;j<i.size();j++) 
				i.set(j, nums[i.get(j)]);
			if (!map.containsKey(i)) {
				map.put(i, map.size());
			}
			
		}
		List<List<Integer>> nList = new ArrayList<>();
		for (List<Integer> i : map.keySet()) {
			nList.add(i);
		}
		return nList;
	}
	*/
}
