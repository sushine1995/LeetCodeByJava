

import java.util.Scanner;
/** 
* @author suzw
* @version 创建时间：${date} ${time} 
* 类说明 
* 输入参数：int数组的长度，int数组，int
* 
*/ 
public class IntsAndInt {

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
		_001_FindTwoNumForATarget test1 = new _001_FindTwoNumForATarget();
		answer = test1.twoSum(a, target);
		System.out.println("结果"+answer[0]+","+answer[1]);
	}
}
