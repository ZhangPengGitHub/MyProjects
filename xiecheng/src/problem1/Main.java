package problem1;

import java.util.Scanner;

public class Main {
	public static int solution(int[] num){
		int max = 0;
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				int sub = num[j] - num[i];
				if(sub>max){
					max = sub;
				}
			}
		}
		return max;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] temp = str.trim().split(",");
		int[] num = new int[temp.length];
		for(int i=0;i<temp.length;i++){
			num[i] = Integer.valueOf(temp[i]);
		}
		System.out.println(solution(num));
	}
}
