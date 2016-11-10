package problem1;

import java.util.Scanner;

public class Main {
	public static boolean solution(String str1,String str2,String str){
		boolean flag = false;
		int len = str.length();
		int len1 = str1.length();
		int len2 = str2.length();
		int i = 0;
		for(;i<=len-len1;i++){
			String temp = str.substring(i, len1+i);
			if(temp.equals(str1)){
				break;
			};
		}
		i += len1;
		for(;i<=len-len2;i++){
			String temp = str.substring(i, len2+i);
			if(temp.equals(str2)){
				flag = true;
				break;
			};
		}
		return flag;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			boolean flag1 = solution(str1,str2,str);
			boolean flag2 = solution(str1,str2,new StringBuilder(str).reverse().toString());
			if(flag1&&flag2){
				System.out.println("both");
			}else if(flag1){
				System.out.println("forward");
			}else if(flag2){
				System.out.println("backward");
			}else{
				System.out.println("invalid");
			}
		}
	}
}
