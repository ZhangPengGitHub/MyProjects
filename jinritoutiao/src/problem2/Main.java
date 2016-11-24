package problem2;

import java.util.Scanner;

public class Main {
	public static int solution(int m,int n,int[] a){
		int result = 0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if((a[i]^a[j])>m){
					result++;
				}
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println(solution(m,n,a));
	}
}
