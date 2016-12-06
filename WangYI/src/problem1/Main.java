package problem1;

import java.util.Scanner;

public class Main {
	public static int rev(int n){
		String str = String.valueOf(n);
		StringBuffer sb = new StringBuffer(str);
		String result = sb.reverse().toString();
		while(true){
			if(result.charAt(0)=='0'){
				result = result.substring(1,result.length());
			}else{
				break;
			}
		}
		return Integer.valueOf(result);
	}
	public static int sum(int a,int b){
		int aa = rev(a);
		int bb = rev(b);
		return rev(aa+bb);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(sum(a,b));
	}
}
