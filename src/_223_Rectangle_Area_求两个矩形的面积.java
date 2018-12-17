
/** 
* @author  suzw
* @version ����ʱ�䣺2018��9��19�� ����9:29:46 
* ��˵�� 
* Find the total area covered by two rectilinear rectangles in a 2D plane.
Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
[(A,B),(C,D)],[(E,F),(G,H)]
Example:
Input: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2
Output: 45
*/
public class _223_Rectangle_Area_���������ε���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
	}
	
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        int area1=(C-A)*(D-B);
        int area2=(G-E)*(H-F);
        int area =area1+area2;
        //�����ص����ֵ����
        int right = Math.min(C, G);
    	int top = Math.min(D, H);
    	int left = Math.max(A, E);
    	int bottom = Math.max(B, F);
        if ((right>left)&& (top>bottom)) {
        	
			int area3 = (right-left)*(top-bottom);
			area-=area3;
		}
        
        return area;
    	
    }

}
