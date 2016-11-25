package problem3;

import java.util.Scanner;

public class Main {
	public static int[][] sub(int[][] path,int index){
		int len = path.length;
		int[][] result = new int[len-1][len-1];
		int ii=0;
		int jj=0;
		for(int i=0;i<len;i++){
			if(i!=index){
				jj = 0;
				for(int j=0;j<len;j++){
					if(j!=index){
						result[ii][jj++] = path[i][j];
					}
				}
				ii++;
			}
		}
		return result;
	}
	public static int pre(int[][] path,int index){
		int len = path.length;
		if(len == 1){
			return 0;
		}
		int[] sum = new int[len];
		//
		for(int i=0;i<len;i++){
			if(index!=i){
				int j = i;
				if(i>index){
					j--;
				}
				sum[i] = path[index][i]+pre(sub(path,index),j);
			}else{
				sum[i] = Integer.MAX_VALUE;
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<len;i++){
			if(min>sum[i]){
				min = sum[i];
			}
		}
		return min;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] path = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				path[i][j] = sc.nextInt();
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			int p = pre(path,i);
			if(min>p){
				min = p;
			}
		}
		System.out.println(min);
	}
}
