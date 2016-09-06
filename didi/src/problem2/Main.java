package problem2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//	public static void swap(int[] bc, int i, int j){
//		int temp = bc[i];
//		bc[i] = bc[j];
//		bc[j] = temp;
//	}
//	public static int solution(int n,int m,int[] a,int[] b,int[] c){
//		int result = 0;
//		int num = 0;
//		int min = -1;
//		int min_index = -1;
//		boolean[] flag = new boolean[n];
//		for(int i=0;i<n;i++){
//			flag[i] = true;
//		}
//		for(int i=0;i<m;i++){
//			min = c[i];
//			min_index = i;
//			for(int j=i+1;j<m;j++){
//				if(min>c[j]||(min==c[j]&&b[min_index]<b[j])){
//					min = c[j];
//					min_index = j;
//				}
//			}
//			swap(c,i,min_index);
//			swap(b,i,min_index);
//		}
//		Arrays.sort(a);
//		for(int i=0;i<n;i++){
//			System.out.print(a[i]+"\t");
//		}
//		System.out.println();
//		for(int i=0;i<m;i++){
//			System.out.print(b[i]+"\t");
//		}
//		System.out.println();
//		for(int i=0;i<m;i++){
//			System.out.print(c[i]+"\t");
//		}
//		System.out.println();
//		for(int i=m-1;i>=0&&num<n;i--){
//			for(int j=0;j<n;j++){
//				if(a[j]>=b[i]&&flag[j]){
//					flag[j] = false;
//					result += c[i];
//					num++;
//					System.out.println(c[i]);
//					break;
//				}
//			}
//		}
//		return result;
//	}
	public static int newsolution(int n,int m,int[] a,int[] b,int[] c){
		int result = 0;
		Arrays.sort(a);
		boolean[] flag = new boolean[m];
		for(int i=0;i<m;i++){
			flag[i] = true;
		}
		boolean f = false;
		int max_index = 0;
		for(int i=0;i<n;i++){
			max_index = 0;
			for(int j=0;j<m;j++){
				if(a[i]>=b[j]&&flag[j]&&c[max_index]<=c[j]){
					max_index = j;
					f = true;
					
				}
			}
			if(f){
				flag[max_index] = false;
				result += c[max_index];
				f = false;
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[m];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<m;i++){
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		System.out.println(newsolution(n,m,a,b,c));
	}
}
