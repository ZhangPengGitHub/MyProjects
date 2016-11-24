package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static int solution(int n,int[] a){
		int result = 0;
		Arrays.sort(a);
		List<Integer> al = new ArrayList();
		for(int i=0;i<n;i++){
			al.add(a[i]);
		}
		for(int i=0;i<al.size()-1;i++){
			int x = al.get(i);
			int y = al.get(i+1);
			if(y-x>10){
				if((i+1)%3==0){
					continue;
				}else if((i+1)%3==1){
					al.add(i+1,x+10);
					result++;
				}else{
					if(y-x<=20){
						al.add(i+1,x+10);
						result++;
					}else{
						al.add(i+1, x+10);
						al.add(i+2, x+10);
						result += 2;
					}
				}
			}
		}
		int len = al.size();
		if(len%3!=0){
			result = result + 3 - len%3;
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println(solution(n,a));
	}
}
