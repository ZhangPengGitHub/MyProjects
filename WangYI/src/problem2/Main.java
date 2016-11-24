package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static long solution(int n){
		long temp2 = 0;
		long temp3 = 3;
		long result = 0;
		for(int i=1;i<n;i++){
			temp3 = temp3+temp2;
			temp2 = temp3*2-temp2;
		}
		result = temp3+temp2;
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}
}
