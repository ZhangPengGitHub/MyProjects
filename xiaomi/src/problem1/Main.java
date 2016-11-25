package problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static int solution(int[][] num){
		int rtn = 1;
		int len = num.length;
		List<Integer> l = new ArrayList();
		l.add(0);
		List<Integer> temp = new ArrayList();
		boolean flag = false;
		for(int i=0;i<len;){
			for(int j=0;j<l.size();j++){
				if(num[i][0]==l.get(j)){
					System.out.println("num[i][0]"+num[i][0]);
					System.out.println("l.get(j)"+l.get(j));
					temp.add(num[i][1]);
					flag = true;
				}
			}
			if(flag){
				flag = false;
				i++;
			}else{
				rtn++;
				l = temp;
				temp = new ArrayList();
			}
		}
		return rtn+1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] num = new int[a-1][2];
		for(int i=0;i<a-1;i++){
			num[i][0] = sc.nextInt();
			num[i][1] = sc.nextInt();
		}
		System.out.println(solution(num));
	}
}
