
/**
 * @author suzw
 * @version ����ʱ�䣺2018��10��22�� ����1:17:15 ��˵��
 * 
 *          Given a list of words and two words word1 and word2, return the
 *          shortest distance between these two words in the list.
 * 
 *          For example, Assume that words = ["practice", "makes", "perfect",
 *          "coding", "makes"].
 * 
 *          Given word1 = ��coding��, word2 = ��practice��, return 3. Given word1 =
 *          "makes", word2 = "coding", return 1.
 * 
 *          Note: You may assume that word1 does not equal to word2, and word1
 *          and word2 are both in the list.
 */
public class _243_Shortest_Word_Distance_��̵��ʾ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "practice", "makes", "perfect", "coding", "makes" };
		System.out.println("(words, \"practice\", \"makes\"):"+shortestDistance(words, "practice", "makes"));
		System.out.println("(words, \"practice\", \"perfect\"):"+shortestDistance(words, "practice", "perfect"));
		System.out.println("(words, \"coding\", \"makes\"):"+shortestDistance(words, "coding", "makes"));

	}

	public static int shortestDistance(String[] words, String word1, String word2) {
		int ans = Integer.MAX_VALUE;
		int i = 0;
		int p1 = Integer.MIN_VALUE;
		int p2 = Integer.MIN_VALUE;
		for (String string : words) {
			/*
			if (string.equals(word1) || string.equals(word2)) {
				if (p1 == -1)
					p1 = Math.min(ans, ans)
				else {
					p2 = ans;
					break;
				}
			}
			ans++;
			*/
			
			if (string.equals(word1)) {
				p1= i;
				//���Ա���p2��p2û����ɳ�ʼֵʱ��math.absԽ�磬�������-2147483647�������Integer.MIN_VALUE
				if(p2 !=Integer.MIN_VALUE)
					ans = Math.min(ans, Math.abs((p2-p1)));
				System.out.println(word1 + ":"+p1+":"+ans);
			}
			else if(string.equals(word2)) {
				p2= i;
				if(p1 !=Integer.MIN_VALUE)
				ans = Math.min(ans, Math.abs(p2-p1));
				System.out.println(word2 + ":"+p2+":"+ans);
			}
			i++;
		}
		//ans = p2 - p1;
		return ans;
	}
}
