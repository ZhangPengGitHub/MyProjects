package Problem1361;

import java.util.Scanner;

/**
 * hiho6
 * problem1
 * Main.java
 * @author Roc
 * @date 2016-8-21обнГ12:03:29
 * @Email zp0016@qq.com
 */
public class Main {
	public static final String TABLE_STRING = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
	public static String solution(String str){
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)=='J'){
				sb.setCharAt(i, 'I');
			}
		}
		StringBuffer res = new StringBuffer();
		boolean flag = true;
		for(int i=0;i<sb.length();i++){
			for(int j=0;j<res.length();j++){
				if(sb.charAt(i)==res.charAt(j)){
					flag = false;
					break;
				}
			}
			if(flag){
				res.append(sb.charAt(i));
			}else{
				flag = true;
			}
		}
		flag = true;
		for(int i=0;i<TABLE_STRING.length();i++){
			for(int j=0;j<res.length();j++){
				if(TABLE_STRING.charAt(i)==res.charAt(j)){
					flag = false;
					break;
				}
			}
			if(flag){
				res.append(TABLE_STRING.charAt(i));
			}else{
				flag = true;
			}
		}
		return res.toString();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res = solution(str);
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				System.out.print(res.charAt(i*5+j));
			}
			System.out.println(res.charAt(i*5+4));
		}
	}
}
