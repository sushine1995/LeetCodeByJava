

import java.util.Scanner;;
public class StandradIOput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		int target = s.nextInt();
		int []answer = new int[2];
		_001_FindTwoNumForATarget test1 = new _001_FindTwoNumForATarget();
		answer = test1.twoSum(a, target);
		System.out.println(answer[0]+","+answer[1]);
		//answer=day1.FindTwoNumForATarget.twoSum(a, target);
	}
	
	

}
