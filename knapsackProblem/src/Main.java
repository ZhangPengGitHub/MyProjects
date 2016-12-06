import java.util.Scanner;

/**
 * hiho6
 * problem2
 * Main.java
 * @author Roc
 * @date 2016-8-21ÏÂÎç12:20:20
 * @Email zp0016@qq.com
 */
public class Main {
	public static int solution(int N,int M,int[][] arr){
		int[][] res = new int[N+1][M+1];
		for(int i=0;i<=N;i++){
			res[i][0] = 0;
		}
		for(int i=0;i<=M;i++){
			res[0][i] = 0;
		}
		for(int i=1;i<=N;i++){
			for(int j=1;j<=M;j++){
				if(j-arr[i][0]>=0){
					res[i][j] = Math.max(res[i-1][j-arr[i][0]] + arr[i][1], res[i-1][j]);
				}else{
					res[i][j] = res[i-1][j];
				}
			}
		}
		for(int i=1;i<=N;i++){
			for(int j=1;j<=M;j++){
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		return res[N][M];
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
