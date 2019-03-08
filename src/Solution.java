

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={2,7,11,15};;
		int []answer=new int[2];
		int target = 13;
		int isOk=0;
		int sum;
		//nums = new int[5]{2,7,11,15};
		for(int i=0;i<nums.length;i++) {
			//temp = nums[i];
			for(int j = i;j<nums.length ;j++) {
				sum = nums[i]+nums[j];
				if(sum==target)	{
					isOk=1;
					answer[0]=i;
					answer[1]=j;
					//System.out.println("output:"+ i +","+ j);
					//System.out.println(nums[i]+"+"+nums[j]+"=" +target);
					break;
				}
			}
			
		}
		//if(isOk==0) System.out.println("not find");	
		//return answer;
	}

}
