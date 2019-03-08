


import java.util.ArrayList;
import java.util.List;

/** 
* @author  suzw
* @version 创建时间：2018年5月10日 上午10:45:28 
* 类说明 
* 写一个程序，输出从 1 到 n 数字的字符串表示。
1. 如果 n 是3的倍数，输出“Fizz”；
2. 如果 n 是5的倍数，输出“Buzz”；
3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
示例：
n = 15,

返回:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
*/
public class _412_FizzBuzz_按规定输出字符串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzBuzz(15).toArray());
	}
	public static List<String> fizzBuzz(int n) {
		List<String> ans = new ArrayList<String>();
		for(int i = 1;i<= n;i++) {
			if(i%3 == 0 && i%5==0) {
				//ans.remove(i-1);
				ans.add(i-1, "FizzBuzz");
			}	
			else if(i%3 == 0)	ans.add("Fizz");
			else if (i%5==0) 	ans.add("Buzz");
			else ans.add(String.valueOf(i));
			
			//System.out.println(ans.get(i-1));	
		}
		return ans;
	}
	/*
	 * public  List<String> fizzBuzz(int n) {
        final int size = n;
        return new java.util.AbstractList<String>() {
            public static final String FIZZ_BUZZ = "FizzBuzz";
            public static final String FIZZ = "Fizz";
            public static final String BUZZ = "Buzz";

            @Override
            public String get(int index) {
                index ++;
                if (index % 3 == 0) {
                    if (index % 5 == 0) {
                        return FIZZ_BUZZ;
                    }
                    return FIZZ;
                } else if (index % 5 == 0) {
                    return BUZZ;
                }
                return index + "";
            }
            @Override
            public int size() {
                return size;
            }
        };
    }

	 */

}
