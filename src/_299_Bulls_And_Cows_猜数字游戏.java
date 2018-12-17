/** 
* @author  suzw
* @version ����ʱ�䣺2018��11��7�� ����3:38:39 
* ��˵�� 
* �����ں���������� �����֣�Bulls and Cows����Ϸ����д��һ��������������Ѳ¡�ÿ�����²��
* �����һ����ʾ���������ж���λ���ֺ�ȷ��λ�ö��¶��ˣ���Ϊ��Bulls��, ��ţ�����ж���λ���ֲ¶���
* ����λ�ò��ԣ���Ϊ��Cows��, ��ţ����������ѽ��������ʾ�����£�ֱ���³��������֡�

��д��һ�������������ֺ����ѵĲ²���������ʾ�ĺ������� A ��ʾ��ţ���� B ��ʾ��ţ��

��ע���������ֺ����ѵĲ²��������ܺ����ظ����֡�

ʾ�� 1:

����: secret = "1807", guess = "7810"

���: "1A3B"

����: 1 ��ţ�� 3 ��ţ����ţ�� 8����ţ�� 0, 1 �� 7��
ʾ�� 2:

����: secret = "1123", guess = "0111"

���: "1A1B"

����: ���Ѳ²����еĵ�һ�� 1 �ǹ�ţ���ڶ���������� 1 �ɱ���Ϊ��ţ��
˵��: ����Լ����������ֺ����ѵĲ²�����ֻ�������֣��������ǵĳ�����Զ��ȡ�
*/
public class _299_Bulls_And_Cows_��������Ϸ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//�÷���1ms,��һ��2ms
    public String getHintFaster(String secret, String guess) {
        int bull = 0, cow = 0;
        char[] ss = secret.toCharArray();
        char[] gg = guess.toCharArray();
        int n = ss.length;
        int[] count = new int[10];
        for (int i = 0; i < n; i++) {
            int s = ss[i] - '0', g = gg[i] - '0';
            if (s == g) {
                bull++;
            } else {
                if (count[s] < 0) {
                    cow++;
                }
                if (count[g] > 0) {
                    cow++;
                }
                count[s]++;
                count[g]--;
            }
        }
        return bull + "A" + cow + "B";
    }
	
	  public String getHint(String secret, String guess) {
	        char[] cSecret = secret.toCharArray();
	        char[] cGuess = guess.toCharArray();
	        int bulls = getBulls(cSecret, cGuess);
	        int cows = getCows(cSecret, cGuess)-bulls;
	        
	        
	        return bulls+"A"+cows+'B';
		  
	  }
	  
	  //ƥ��λ�ú����ֶ���ȷ�ĸ����� Bulls
	  public static int  getBulls(char[] cSecret, char[] cGuess) {
		  int ans = 0;
		  for(int i = 0; i<cSecret.length; i++)
			  if(cSecret[i] == cGuess[i])
				  ans++;
		  return ans;
	  }
	  //��ȡ�ж���λ���ֲ¶��˵���λ�ò��ԣ�  = �¶����ֵĸ���- bulls
	  public static int  getCows(char[] cSecret, char[] cGuess) {
		  int ans = 0;
		  int[] s=new int[10];
		  int[] g = new int[10];
		  
		  for (char i : cSecret ) 
			s[i - '0']++;
		
		  for (char i : cGuess ) 
			g[i - '0']++;
			
			  
		  for(int i = 0; i<s.length; i++)
			 ans+=s[i]>g[i]?g[i]:s[i];
		  return ans;
	  }

}
