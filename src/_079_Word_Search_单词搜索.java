/** 
* @author  suzw
* @version ����ʱ�䣺2018��9��11�� ����7:55:37 
* ��˵�� 
* ��������
* �ο�212����ʹ��ǰ׺��Trie���
*/
public class _079_Word_Search_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean exist(char[][] board, String word) {
		char[] chars = word.toCharArray();
		for (int y = 0; y < board.length; y++) {
			for (int x = 0; x < board[y].length; x++) {
				if (exist(board, chars, x, y, 0)) {
					return true;
				}
			}
		}
		return false;
		
	}
	/*
	
	*@author: suzw
	*@date: 2018��9��11������7:57:11
	*@TODO
	*@param: [y,x]�� char[][]������±�
	*@param: i,�Ѿ�ƥ��ĳ���
	*/
	public static boolean exist(char[][] board, char[] word,int x,int y,int i) {
		if (i == word.length) 
			return true;
		if(y<0 || x<0 || y==board.length ||x == board[y].length)	return false;
		if(board[y][x]!=word[i])	return false;
		board[y][x] ^= '#';			//��������򣬱�����ֻ�˷ѭ��
		boolean exist = exist(board, word, x+1, y, i+1) || exist(board, word, x-1, y, i+1) ||
		exist(board, word, x, y+1, i+1) || exist(board, word, x, y-1, i+1) ;
		board[y][x] ^= '#';
		return exist;
	}
}
