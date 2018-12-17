import java.util.ArrayList;
import java.util.List;

/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��9�� ����7:55:27 
* ��˵�� 
* ����һ�����ظ�Ԫ�ص������������飬�����������䷶Χ�Ļ��ܡ�
ʾ�� 1:
����: [0,1,2,4,5,7]
���: ["0->2","4->5","7"]
����: 0,1,2 �����һ������������; 4,5 �����һ�����������䡣
ʾ�� 2:
����: [0,2,3,4,6,8,9]
���: ["0","2->4","6","8->9"]
����: 2,3,4 �����һ������������; 8,9 �����һ�����������䡣
*/
public class _228_Summary_Ranges_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,4,5,7};
		System.out.println(summaryRanges(nums));
	}
    public static List<String> summaryRanges(int[] nums) {
    		
            List<String> ans = new ArrayList<>();
            if (nums.length == 0) {
    			return ans;
    		}
            if (nums.length == 1) {
    			ans.add(nums[0]+"");
    			return ans;
    		}
            for (int i = 0; i < nums.length; i++) {
            	int a = nums[i];
            	//ע��������ǰ��˳�����жϳ���
            	while(i<nums.length-1 &&(nums[i+1]-nums[i]==1) ) {
            		i++;
            	}
            	if (a != nums[i]) {
            		ans.add(a + "->" + nums[i]);
    			}
            	else ans.add(a+"");
            }
            return ans;
            
            
        }

}
