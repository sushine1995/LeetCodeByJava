import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��18�� ����4:51:26 
* ��˵�� 
*/
public class _241_Different_Ways_To_Add_Parentheses_������ʽ�Ĳ�ͬ��Ͻ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(diffWaysToCompute("2+2*2"));
	}
	
	  public static List<Integer> diffWaysToCompute(String input) {
	        return helper(input, new HashMap<>());
	    }
	  
	  public static List<Integer> helper(String input, Map<String, List<Integer>> map) {
		  List<Integer> res = new ArrayList<>();
		  for (int i = 0; i < input.length(); i++) {
			  char c = input.charAt(i);
			  if (c == '+' || c == '-' || c=='*') {
				  String leftString = input.substring(0, i);
				  List<Integer> left;
				  if (map.containsKey(leftString)) {
					  left = map.get(leftString);
				}
				  else {
					  left = helper(leftString,map);
					  //Memorization,ÿ�μ������ӵ�map�У������ظ�����
					  map.put(leftString, left);
				  }
				  
				  String rightString = input.substring(i+1);
				  List<Integer> right;
				  if (map.containsKey(rightString)) {
					  right = map.get(rightString);
				  }
				  else {
					  right = helper(rightString,map);
					  map.put(rightString, right);
				  }
				  for (int l : left) 
					  for (int r : right) 
						  switch(c) {
						  case '+':
							  res.add(l+r);
							  break;
						  case '-':
							  res.add(l-r);
							  break;
						  case '*':
							  res.add(l*r);
							  break;
						  }
				
			  }
			  
		}
		  //���ָ���һ������ʱ��
		  if(res.size() == 0) {
			  res.add(Integer.valueOf(input));
		  }
		 //���Բ�Ҫ
		  map.put(input, res);
		  return res;
		
		  
	}
}
