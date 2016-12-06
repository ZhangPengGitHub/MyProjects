package problem2;

import java.util.Scanner;

public class Main {
	public static boolean is(int num){
		for(int i=2;i<=(int)Math.sqrt(num);i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	public static int counter(int a,int b){
		int result = 0;
		for(int i=a+1;i<b;i++){
			if(is(i)){
				result++;
			}
		}
		return result;
	}
	public static int[] three(int n){
		int flag = n;
		int[] result = new int[n];
		result[0] = n;
		result[n-1] = n;
		for(int i=1;i<(n+1)/2;i++){
			flag -= 2;
			result[i] = result[i-1]+flag;
			result[n-1-i] = result[i];
		}
		for(int i=0;i<n;i++){
			System.out.print(result[i]+"\t");
		}
		System.out.println();
		return result;
	}
	public static int solution(int n,int[] num){
		int result = 0;
		int[] temp = three(n-1);
		for(int i=0;i<n-1;i++){
			result = result + temp[i]*counter(num[i],num[i+1]);
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++){
			num[i] = sc.nextInt();
		}
		System.out.println(solution(n,num));
	}
}
