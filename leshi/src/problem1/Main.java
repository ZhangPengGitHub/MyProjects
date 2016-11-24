package problem1;

import java.util.Scanner;

public class Main {
	public static int solution(int a){
		String str = String.valueOf(a);
		StringBuffer result = new StringBuffer();
		int[] num = new int[10];
		for(int i=0;i<10;i++){
			num[i] = 0;
		}
		for(int i=0;i<str.length();i++){
			for(int j=0;j<10;j++){
				if(str.charAt(i)==j+'0'){
					num[j]++;
				}
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<num[i];j++){
				result.append(i);
			}
		}
		for(int i=0;i<result.length();i++){
			if(result.charAt(i)!='0'){
				if(i!=0){
					char temp = result.charAt(i);
					result.setCharAt(i, result.charAt(0));
					result.setCharAt(0, temp);
				}
				break;
			}
		}
		return Integer.valueOf(result.toString()).intValue();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int s = solution(a);
			System.out.println(s);
			if(b==s){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
