import java.util.Scanner;

/**
 * knapsackProblem
 * 
 * Recursion.java
 * @author Roc
 * @date 2016-8-22ÏÂÎç2:10:13
 * @Email zp0016@qq.com
 */
public class Recursion {
	public static int solution(int N,int M,int[][] arr){
		int res = 0;
		int maxi = 0;
		int maxj = 0;
		if(N>0){
			maxi = solution(N-1,M,arr);
		}else{
			maxi = 0;
		}
		if(N>0 && M-arr[N][0]>=0){
			maxj = solution(N-1,M-arr[N][0],arr) + arr[N][1];
		}else{
			maxj = 0;
		}
		res = Math.max(maxi, maxj);
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N+1][2];
		for(int i=1;i<=N;i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		System.out.println(solution(N, M, arr));
	}
}

