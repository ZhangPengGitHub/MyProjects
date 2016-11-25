package problem2;

import java.util.Scanner;

public class Main {
	public static int solution(int n,int len,int[] num){
		int head = 0;
		int tail = len-1;
		int middle = (tail+head)/2;
		while(head<middle&&middle<tail){
			if(num[middle]==n){
				break;
			}else if(num[middle]>n){
				tail = middle-1;
				middle = (tail+head)/2;
			}else{
				head = middle+1;
				middle = (tail+head)/2;
			}
		}
		if(num[middle]==n){
			return middle;
		}else if(num[middle]>n){
			for(int i=middle-1;i>=0;i--){
				if(num[i]==n){
					return i;
				}else if(num[i]<n){
					return -2-i;
				}
			}
		}else if(num[middle]<n){
			for(int i=middle+1;i<len;i++){
				if(num[i]==n){
					return i;
				}else if(num[i]>n){
					return -1-i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = sc.nextInt();
		int[] num = new int[len];
		for(int i=0;i<len;i++){
			num[i] = sc.nextInt();
		}
		System.out.println(solution(n,len,num));
	}
}
