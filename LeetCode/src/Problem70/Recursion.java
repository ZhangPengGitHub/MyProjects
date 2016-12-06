package Problem70;
/**
 * LeetCode
 * Problem70
 * DynamicProgramming.java
 * @author Roc
 * @date 2016-8-1обнГ2:56:47
 * @Email zp0016@qq.com
 */
public class Recursion {
	int result = 0;
	public void solution(int n){
		if(n-1==0){
			result++;
			return;
		}else if(n-2==0){
			result += 2;
			return;
		}else{
			solution(n-1);
			solution(n-2);
		}
	}
	public static void main(String[] args){
		Recursion r1 = new Recursion();
		r1.solution(3);
		Recursion r2 = new Recursion();
		r2.solution(44);
		System.out.println(r1.result);
		System.out.println(r2.result);
	}
}
