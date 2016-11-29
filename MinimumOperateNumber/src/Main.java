import java.util.Scanner;

/**
 * MinimumOperateNumber
 * 
 * Main.java
 * @author Roc
 * @date 2016-9-7ÏÂÎç7:51:37
 * @Email zp0016@qq.com
 */
public class Main {
	public static int solution(int i){
		int result = 0;
		if(i<=1){
			return -1;
		}
		while(i>1){
			if(i%2==0){
				i /= 2;
				result++;
			}else{
				i -= 1;
				result++;
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println(solution(i));
	}
}
