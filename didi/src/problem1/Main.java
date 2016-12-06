package problem1;

import java.util.Scanner;

public class Main {
	public static int solution(int a[],int n){
		int max_sum = Integer.MIN_VALUE;  
        int sum = Integer.MIN_VALUE;  
        for (int i = 0; i < n; i++) {  
            if (sum < 0){
            	sum = 0;  
            }
            sum += a[i];  
            if (sum > max_sum){
            	max_sum = sum;  
            }
        }  
        return max_sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println(solution(a,n));
	}
}
