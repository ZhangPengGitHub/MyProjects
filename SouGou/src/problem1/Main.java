package problem1;

import java.util.Scanner;

public class Main {
	public static boolean is(String str){
		String temp = new StringBuffer(str).reverse().toString();
		if(str.equals(temp)){
			return true;
		}else{
			return false;
		}
//		int len = str.length();
//		for(int i=0;i<len/2;i++){
//			if(str.charAt(i)==str.charAt(len-1-i)){
//				continue;
//			}else{
//				return false;
//			}
//		}
//		return true;
	}
	public static int solution(String str){
		int len = str.length();
		for(int i=len;i>0;i--){
			if(is(str.substring(0, i))){
				return i;
			}
		}
		return 1;
	}
	public static void main(String[] args){
		String str = new String();
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		System.out.println(solution(str));
	}
}
