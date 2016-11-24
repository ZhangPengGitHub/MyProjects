package problem2;

import java.util.Scanner;

public class Main {
	public static int solution(int n){
		String str = String.valueOf(n);
		int len = str.length();
		String result = "";
		for(int i=0;i<len/2;i++){
			result += str.charAt(i);
		}
		if(len%2==0){
			for(int i=len/2-1;i>=0;i--){
				result += str.charAt(i);
			}
		}else{
			for(int i=len/2;i>=0;i--){
				result += str.charAt(i);
			}
		}
		int rtn = Integer.valueOf(result);
		if(rtn>n){
			return rtn;
		}
		char c = result.charAt(len/2);
		if(c!='9'){
			StringBuffer sb = new StringBuffer(result);
			if(len%2==0){
				sb.setCharAt(len/2-1,(char) (c+1));
				sb.setCharAt(len/2,(char) (c+1));
				result = sb.toString();
			}else{
				sb.setCharAt(len/2,(char) (c+1));
				result = sb.toString();
			}
			rtn = Integer.valueOf(result);
		}
		if(c=='9'){
			StringBuffer sb = new StringBuffer(result);
			if(len%2==0){
				int i = len/2;
				while(i<len && sb.charAt(i)=='9'){
					sb.setCharAt(i,'0');
					sb.setCharAt(len-1-i,'0');
					i++;
				}
				if(i==len){
					rtn += 2;
					return rtn;
				}else{
					char temp = sb.charAt(i);
					sb.setCharAt(i,(char) (temp+1));
					sb.setCharAt(len-1-i,(char) (temp+1));
				}
				result = sb.toString();
			}else{
				sb.setCharAt(len/2,'0');
				int i = len/2+1;
				while(i<len && sb.charAt(i)=='9'){
					sb.setCharAt(i,'0');
					sb.setCharAt(len-1-i,'0');
					i++;
				}
				if(i==len){
					rtn += 2;
					return rtn;
				}else{
					char temp = sb.charAt(i);
					sb.setCharAt(i,(char) (temp+1));
					sb.setCharAt(len-1-i,(char) (temp+1));
				}
				result = sb.toString();
			}
			rtn = Integer.valueOf(result);
		}
		return rtn;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(solution(n));
		}
	}
}
