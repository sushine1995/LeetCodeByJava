package day1;

import java.util.Scanner;

public class FindTwoNumForATarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入int数组的长度：");
		Scanner s = new Scanner(System.in);
		int lenOfInts = s.nextInt();
		int[] a = new int[lenOfInts];
		System.out.print("输入int数组：");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("输入第二个参数");
		int target = s.nextInt();
		int []answer = new int[2];
		FindTwoNumForATarget test1 = new FindTwoNumForATarget();
		answer = test1.twoSum(a, target);
		System.out.println("结果"+answer[0]+","+answer[1]);
	}
	
    public int[] twoSum(int[] nums, int target) {

        int []answer=new int[2];

		for(int i=0;i<nums.length-1;i++) {

			for(int j = i+1;j<nums.length ;j++) {
				if((nums[i]+nums[j])==target)	{
					answer[0]=i;
					answer[1]=j;
					break;
				}
			}
			
		}
		return answer;
    }
}
