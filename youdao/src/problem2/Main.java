package problem2;

import java.util.Scanner;

public class Main {
	public static void xipai(int[] pai){
		int len = pai.length;
		int[] temp = new int[len];
		int index = 0;
		for(int i=0;i<len/2;i++){
			temp[index++] = pai[i];
			temp[index++] = pai[len/2+i];
		}
		for(int i=0;i<len;i++){
			pai[i] = temp[i];
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] pai = new int[2*n];
			for(int j=0;j<2*n;j++){
				pai[j] = sc.nextInt();
			}
			for(int j=0;j<k;j++){
				xipai(pai);
			}
			for(int j=0;j<2*n-1;j++){
				System.out.print(pai[j] + " ");
			}
			System.out.println(pai[2*n-1]);
		}
	}
}
