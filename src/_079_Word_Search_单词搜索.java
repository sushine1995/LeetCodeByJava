/** 
* @author  suzw
* @version 创建时间：2018年9月11日 下午7:55:37 
* 类说明 
* 单词搜索
* 参考212，可使用前缀树Trie求解
*/
public class _079_Word_Search_单词搜索 {

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
	*@date: 2018年9月11日下午7:57:11
	*@TODO
	*@param: [y,x]： char[][]矩阵的下标
	*@param: i,已经匹配的长度
	*/
	public static boolean exist(char[][] board, char[] word,int x,int y,int i) {
		if (i == word.length) 
			return true;
		if(y<0 || x<0 || y==board.length ||x == board[y].length)	return false;
		if(board[y][x]!=word[i])	return false;
		board[y][x] ^= '#';			//与自身异或，避免出现回朔循环
		boolean exist = exist(board, word, x+1, y, i+1) || exist(board, word, x-1, y, i+1) ||
		exist(board, word, x, y+1, i+1) || exist(board, word, x, y-1, i+1) ;
		board[y][x] ^= '#';
		return exist;
	}
}
