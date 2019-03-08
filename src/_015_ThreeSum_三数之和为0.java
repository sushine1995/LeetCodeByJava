import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
* @author  suzw
* @version 创建时间：2019年3月1日 下午9:15:43 
* 类说明 
*/
public class _015_ThreeSum_三数之和为0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

		public static List<List<Integer>> threeSum(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> ls = new ArrayList<>();
	 
	        for (int i = 0; i < nums.length - 2; i++) {
	            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {  // 跳过可能重复的答案
	 
	                int l = i + 1, r = nums.length - 1, sum = 0 - nums[i];
	                while (l < r) {
	                    if (nums[l] + nums[r] == sum) {
	                        ls.add(Arrays.asList(nums[i], nums[l], nums[r]));
	                        while (l < r && nums[l] == nums[l + 1]) l++;
	                        while (l < r && nums[r] == nums[r - 1]) r--;
	                        l++;
	                        r--;
	                    } else if (nums[l] + nums[r] < sum) {
	                        while (l < r && nums[l] == nums[l + 1]) l++;   // 跳过重复值
	                        l++;
	                    } else {
	                        while (l < r && nums[r] == nums[r - 1]) r--;
	                        r--;
	                    }
	                }
	            }
	        }
	        return ls;
	    }
		
		


//返回ArrayList
		    public static ArrayList<ArrayList<Integer>> threeSum2(int[] num) {
		    
		        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
		        Arrays.sort(num);
		        for(int i =0;i + 2 < num.length;i++){
		            if(i>0 && num[i] == num[i - 1])
		                continue;
		            int j = i + 1;
		            int k = num.length -1;
		            int target = - num[i];
		            while(j<k){
		                if(num[j] + num[k]== target){
		                    //out.add(Arrays.asList(num[i],num[j],num[k]));
		                    ArrayList<Integer> temp = new ArrayList<Integer>();
		                     temp.add(num[i]);
		                     temp.add(num[j]);
		                     temp.add(num[k]);
		                    out.add(temp);
		                    j++;
		                    k--;
		                    //跳过重复的组合
		                    while(j<k && num[j]==num[j-1])
		                        j++;
		                    while(j<k && num[k]==num[k+1])
		                        k--;
		                }
		                else if(num[j] + num[k] > target)
		                        k--;
		                else j++;           
		            }
		        }
		        return out;
		    }
		
	
}
