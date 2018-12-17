/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��31�� ����8:47:13 
* ��˵�� 
* 
���ݰٶȰٿƣ�������Ϸ�����Ϊ��������Ӣ����ѧ��Լ�����ζ١�������1970�귢����ϸ���Զ�����

����һ������ m �� n �����ӵ���壬ÿһ�����Ӷ����Կ�����һ��ϸ����ÿ��ϸ������һ����ʼ״̬ live��1����Ϊ��ϸ���� �� dead��0����Ϊ��ϸ����ÿ��ϸ������˸�����λ�ã�ˮƽ����ֱ���Խ��ߣ���ϸ������ѭ�����������涨�ɣ�

�����ϸ����Χ�˸�λ�õĻ�ϸ�����������������λ�û�ϸ��������
�����ϸ����Χ�˸�λ����������������ϸ�������λ�û�ϸ����Ȼ��
�����ϸ����Χ�˸�λ���г���������ϸ�������λ�û�ϸ��������
�����ϸ����Χ������������ϸ�������λ����ϸ�����
���ݵ�ǰ״̬��дһ�����������������ϸ������һ����һ�θ��º�ģ�״̬����һ��״̬��ͨ������������ͬʱӦ���ڵ�ǰ״̬�µ�ÿ��ϸ�����γɵģ�����ϸ���ĳ�����������ͬʱ�����ġ�

ʾ��:

����: 
[
  [0,1,0],
  [0,0,1],
  [1,1,1],
  [0,0,0]
]
���: 
[
  [0,0,0],
  [1,0,1],
  [0,1,1],
  [0,1,0]
]
����:

�����ʹ��ԭ���㷨�����������ע�⣬��������и�����Ҫͬʱ�����£��㲻���ȸ���ĳЩ���ӣ�Ȼ��ʹ�����ǵĸ��º��ֵ�ٸ����������ӡ�
�����У�����ʹ�ö�ά��������ʾ��塣ԭ���ϣ���������޵ģ�������ϸ����ռ�����߽�ʱ��������⡣�㽫��ν����Щ���⣿
*/
public class _290_Game_of_Life_�Ź��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public void gameOfLifeFaster(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                checkSurroundings(board, i, j);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 1;
                } else if (board[i][j] == -1) {
                    board[i][j] = 0;
                }
            }
        }
    }
    
    /*ʹ���ĸ����ֱ�ʾ��ͬ��״̬
     * To solve it in place, we use 2 bits to store 2 states:

[2nd bit, 1st bit] = [next state, current state]

- 00  dead (next) <- dead (current)
- 01  dead (next) <- live (current)  
- 10  live (next) <- dead (current)  
- 11  live (next) <- live (current) 
In the beginning, every cell is either 00 or 01.
Notice that 1st state is independent of 2nd state.
Imagine all cells are instantly changing from the 1st to the 2nd state, at the same time.
Let's count # of neighbors from 1st state and set 2nd state bit.
Since every 2nd state is by default dead, no need to consider transition 01 -> 00.
In the end, delete every cell's 1st state by doing >> 1.
For each cell's 1st bit, check the 8 pixels around itself, and set the cell's 2nd bit.

Transition 01 -> 11: when board == 1 and lives >= 2 && lives <= 3.
Transition 00 -> 10: when board == 0 and lives == 3.
To get the current state, simply do

board[i][j] & 1
To get the next state, simply do

board[i][j] >> 1
     */
    public void checkSurroundings(int[][]board, int i, int j) {
        int numOnes = getOnes(board, i-1, j) +
            getOnes(board, i-1, j-1) +
            getOnes(board, i-1, j+1) + 
            getOnes(board, i, j-1) +
            getOnes(board, i, j+1) +
            getOnes(board, i+1, j-1) + 
            getOnes(board, i+1, j) + 
            getOnes(board, i+1, j+1);
        
        if(board[i][j] == 1){
            //cell with 0 1 4 5 6 7 8 dies
            if (numOnes < 2 || numOnes > 3) {
                board[i][j] = -1;    
            }
        } else if (board[i][j] == 0){
            //dead cell with 3 live again
            if (numOnes == 3){
                 board[i][j] = 2;    
            }
        }
    }
    
    public int getOnes(int[][]board, int i, int j) {
        if (i >= 0 && j >= 0 && 
            i < board.length && 
            j < board[0].length) {
            
            if (board[i][j] == 1 || board[i][j] == -1) { // The cells were/are previously alive
                return 1;
            }
            
            if (board[i][j] == 2) { // The cell was previously dead
                return 0;
            }
            return 0;
        } 
        return 0;
    }
	public void gameOfLife(int[][] board) {
		if (board == null || board.length == 0) return;
	    int m = board.length, n = board[0].length;
	
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            int lives = liveNeighbors(board, m, n, i, j);
	
	            // In the beginning, every 2nd bit is 0;
	            // So we only need to care about when will the 2nd bit become 1.
	            if (board[i][j] == 1 && lives >= 2 && lives <= 3) {  
	                board[i][j] = 3; // Make the 2nd bit 1: 01 ---> 11
	            }
	            if (board[i][j] == 0 && lives == 3) {
	                board[i][j] = 2; // Make the 2nd bit 1: 00 ---> 10
	            }
	        }
	    }
	
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            board[i][j] >>= 1;  // Get the 2nd state.
	        }
	    }
	}

	public int liveNeighbors(int[][] board, int m, int n, int i, int j) {
	    int lives = 0;
	    for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
	        for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
	            lives += board[x][y] & 1;
	        }
	    }
	    lives -= board[i][j] & 1;
	    return lives;
	}
	
}
