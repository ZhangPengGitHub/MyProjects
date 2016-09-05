package problem1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int[] solution(int[] n,String[] s){
		int max = 0;
		int min = 0;
		Arrays.sort(n);
		int len = s.length;
		String[] result = new String[len];
		int[] num = new int[len];
		for(int i=0;i<len;i++){
			num[i] = Integer.MAX_VALUE;
		}
		int point = 0;
		boolean flag = true;
		for(int i=0;i<len;i++){
			for(int j=0;j<point;j++){
				if(s[i].equals(result[j])){
					num[j]++;
					flag = false;
				}
			}
			if(flag){
				result[point]=s[i];
				num[point]=1;
				point++;
			}else{
				flag = true;
			}
		}
		Arrays.sort(num);
		int x = n.length;
		for(int i=point-1;i>=0;i--){
			max += n[--x]*num[i];
		}
		int y = 0;
		for(int i=point-1;i>=0;i--){
			min += n[y++]*num[i];
		}
		int[] ret = new int[2];
		ret[0] = max;
		ret[1] = min;
		return ret;
	}
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] n = new int[a];
		String[] s = new String[b];
		for(int i=0;i<a;i++){
			n[i] = sc.nextInt();
		}
		for(int i=0;i<b;i++){
			s[i] = sc.next();
		}
		int[] res = solution(n,s);
		System.out.println(res[1]+" "+res[0]);
	}
}
