import java.util.HashSet;
import java.util.Set;

/** 
* @author  suzw
* @version 创建时间：2018年11月5日 下午4:58:30 
* 类说明 
* Alice和Bob在玩这样一个游戏：给定k个数字a1，a2…ak。一开始，有n堆石子，每堆各有xi个石子。
* Alice和Bob轮流从其中某一堆取一些石子。每次所取石子的个数一定要在a1~ak中。Alice先取。
* 取光石子的一方获胜。当双方都采取最优策略时，谁会获胜？题目假定a1~ak中一定有1.

可以看成N堆的Nim游戏。
https://blog.csdn.net/MIKASA3/article/details/51377434?utm_source=blogxgwz0

*/
public class _2922_Nim_Game_Basic_n堆石子的NimGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * a：可取的情况：a1a2~al
	 * x: n堆石子，每堆的石子数
	 * n: n堆石子
	 */
	
	public static boolean nimgame2(int[] a,int[] x,int n) {
	//设sumN为n堆石子的总数	
		int sumN  = 1010;
		
		int[] sg=new int[sumN];
		
		sg[0] = 0;	
		for(int i = 1;i<= n;i++) {
			Set<Integer> set= new HashSet<>(); //存储当前所能到达状态的sg值
			for(int j = 0;j<a.length ; j++) {
				if(a[j]<=i)
					set.add(sg[i - a[j]]);
			}
			
		}
	return false;
	}
}
