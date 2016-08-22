package Problem1358;

import java.util.Scanner;

/**
 * hiho5
 * problem2
 * Main.java
 * @author Roc
 * @date 2016-8-14обнГ1:22:16
 * @Email zp0016@qq.com
 */
public class Main {
	public static double solution(int N,int K,double[] A,double[] B){
		double result = 1;
		double max = 1;
		int index = -1;
		int i=0,j=0;
		for(i=0;i<N;i++){
			max = 1;
			index = -1;
			for(j=0;j<K;j++){
				double temp = Math.pow(A[j]+1, 1/B[j])/Math.pow(A[j], 1/B[j]);
				if(temp>max){
					max = temp;
					index = j;
				}
			}
			A[index]++;
		}
		for(j=0;j<K;j++){
			double temp = Math.pow(A[j], 1/B[j]);
			result *= temp;
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N,K;
		N = sc.nextInt();
		K = sc.nextInt();
		double[] A = new double[K];
		double[] B = new double[K];
		for(int i=0;i<K;i++){
			A[i] = sc.nextInt();
		}
		for(int i=0;i<K;i++){
			B[i] = sc.nextInt();
		}
		System.out.println(solution(N, K, A, B));
	}
}
