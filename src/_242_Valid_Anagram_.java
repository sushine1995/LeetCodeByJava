
/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��19�� ����7:26:55 
* ��˵�� 
* ���ܼ򵥵�ʹ���������� "aa" "bb"
* 
*/
public class _242_Valid_Anagram_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("aabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbcc", "aabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccbbaaccaabbccaabbccaabbcc"));
	}
	
	//
	public static boolean isAnagram(String s, String t) {
		 if (s.length() != t.length()) {
				return false;
			}
		 char[] sc= s.toCharArray();
	     char[] tc= t.toCharArray();
	     int[] count = new int[26];
	     long start0 = System.currentTimeMillis();
	     for (int i = 0; i < tc.length; i++) {
			count[sc[i] - 'a']++;
			count[tc[i] - 'a']--;
		}
	     System.out.println(System.currentTimeMillis()-start0);
	     //ʹ�ü�ǿforѭ�����ٶȸ���2ms?? Ϊʲô���������û���ͨ����
	     //��ǿforѭ����ʹ��������������ݽṹ����List a = new LinkedList()
	     //��ͨѭ����������˳��洢����List a = ArrayList()
	     long start = System.currentTimeMillis();
	     for (int i : sc) {
			count[i - 'a']++;
		}
	     for (int i : tc) {
			count[i-'a']--;
		}
	     System.out.println(System.currentTimeMillis()-start);
	    for (int i : count) {
			if (i!=0) {
				return false;
			}
		}
	     return true;
		/*
        char[] sc= s.toCharArray();
        char[] tc= t.toCharArray();
        int ansS = 0;
        int ansT = 0;
        
        
        for (char c : sc) {
			ansS = ansS^c;
		}
        System.out.println(ansS);
        for (char c : tc) {
			ansT = ansT^c;
		}
        System.out.println(ansT);
		if (ansS == ansT) {
			return true;
		}
		return false;
		*/
		
    }
}
