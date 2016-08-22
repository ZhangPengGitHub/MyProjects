package Problem1357;

import java.util.Scanner;

/**
 * hiho5
 * problem1
 * Solution.java
 * @author Roc
 * @date 2016-8-14ÏÂÎç12:04:23
 * @Email zp0016@qq.com
 */
public class Main {
	public static int mysolution(int[] array1,int[] array2){
		
		int N = array1[0],M = array1[1],K = array1[2];
		int[] arrayM = new int[K];
		for(int i=0;i<K;i++){
			arrayM[i] = M;
		}
		
		int timestart = 1;
		int timeend = M;
		int time = (timeend+timestart)/2;
		
		for(int i=0;i<N && K>0;i++){
			if(array2[i]>=arrayM[K-1]){
				K--;
			}
		}
		if(K<=0){
			return -1;
		}
		
		while(timestart<time){
			K = array1[2];
			for(int i=0;i<K;i++){
				arrayM[i] = M;
			}
			
			for(int i=0;i<N && K>0;i++){
				if(array2[i]>=arrayM[K-1]){
					K--;
				}else{
					int recover = arrayM[K-1] - array2[i] + time;
					arrayM[K-1] = recover<M?recover:M;
				}
			}
			
			if(K>0){
				timeend = time;
			}else{
				timestart = time;
			}
			time = (timestart+timeend)/2;
		}
//		while(true){
//			K = array1[2];
//			for(int i=0;i<K;i++){
//				arrayM[i] = M;
//			}
//			
//			for(int i=0;i<N && K>0;i++){
//				if(array2[i]>=arrayM[K-1]){
//					K--;
//				}else{
//					int recover = arrayM[K-1] - array2[i] + time;
//					arrayM[K-1] = recover<M?recover:M;
//				}
//			}
//			
//			if(K>0){
//				break;
//			}else{
//				time++;
//			}
//		}
		return timeend;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[3];
		for(int i=0;i<3;i++){
			array1[i] = sc.nextInt();
		}
		int[] array2 = new int[array1[0]];
		for(int i=0;i<array1[0];i++){
			array2[i] = sc.nextInt();
		}
		System.out.println(mysolution(array1, array2));
	}
}
