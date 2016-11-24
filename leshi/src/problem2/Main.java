package problem2;

import java.util.Scanner;

public class Main {
	public static int solution(int p){
		int n = (int)Math.sqrt(2.0*p);
		int sum = n*(n+1)/2;
		while(sum<p){
			n++;
			sum = n*(n+1)/2;
		}
		if((sum-p)%2==0){
			return n;
		}else if(n%2==0){
			return n+1;
		}else{
			return n+2;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(solution(n));
		}
	}
}
