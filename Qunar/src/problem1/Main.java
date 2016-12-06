package problem1;

import java.util.Scanner;

public class Main {
	public static boolean solution(String str1,String str2){
		boolean result;
		int len1 = str1.length();
		int len2 = str2.length();
		boolean[] b1 = new boolean[26];
		boolean[] b2 = new boolean[26];
		for(int i=0;i<26;i++){
			b1[i] = false;
			b2[i] = false;
		}
		for(int i=0;i<len1;i++){
			char c = str1.charAt(i);
			b1[c-'A'] = true;
		}
		for(int i=0;i<len2;i++){
			char c = str2.charAt(i);
			b2[c-'A'] = true;
		}
		for(int i=0;i<26;i++){
			if((b1[i]&&b2[i])||(!b1[i]&&!b2[i])){
				continue;
			}else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1;
		String str2;
		while(sc.hasNext()){
			str1 = sc.next();
			str2 = sc.next();
			System.out.println(solution(str1,str2));
		}
	}
}
