
/** 
* @author  suzw
* @version 创建时间：2018年4月18日 上午10:55:55 
* 类说明 
*/
public class JudgeRouteCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static boolean judgeCircle(String moves) {
		boolean ans = false;
		int upOrDown = 0;
		int leftOrRight = 0;
		//char temp;
		
		for (char temp : moves.toCharArray()) {
			if (temp == 'U') upOrDown ++;
			else if (temp == 'D') upOrDown --;
			else if (temp == 'L') leftOrRight ++;
			else if (temp == 'R') leftOrRight --;
		}
		/*
		for (int i = 0; i < moves.length(); i++) {
			temp = moves.charAt(i);
			if (temp == 'U') upOrDown ++;
			else if (temp == 'D') upOrDown --;
			else if (temp == 'L') leftOrRight ++;
			else if (temp == 'R') leftOrRight --;
		}
		*/
		if(upOrDown == 0 && leftOrRight ==0)	ans = true;
		
		return ans;
		
	}
	
}
