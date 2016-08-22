package Problem70;
/**
 * LeetCode
 * Problem70
 * DynamicProgramming.java
 * @author Roc
 * @date 2016-8-1обнГ9:06:13
 * @Email zp0016@qq.com
 */
public class DynamicProgramming {
	public static int solution(int n){
		int a = 0;
		int b = 1;
		for(int i=1;i<=n;i++){
			b = a + b;
			a = b - a;
		}
		return b;
	}
	public static void main(String[] args){
		System.out.println(solution(3));
		System.out.println(solution(44));
	}
}
