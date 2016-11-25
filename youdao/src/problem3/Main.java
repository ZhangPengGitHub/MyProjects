package problem3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int[] pre(int n){
		
		int[] result = new int[n];
		
		int num = 0;
		int index = 1;

		ArrayList<Integer> temp = new ArrayList<>();
		for(int i=0;i<n;i++){
			temp.add(i+1);
		}
		int s = 0;
		while(!temp.isEmpty()){
			if(temp.size()==1){
				result[num++] = temp.get(0);
				break;
			}
			
			if(s%2!=0){
				index = index==0?1:0;
			}
			s = temp.size();
			for(int i=0;i<s/2;i++){
				result[num++] = temp.get(index);
				index += 2;
			}
			index -= 2;
			while(index>=0){
				temp.remove(index);
				index -= 2;
			}
			index += 2;
		}
		
		return result;
	}
	public static int[] solution(int n){
		int[] temp = pre(n);
		int[] result = new int[n];
		for(int i=0;i<n;i++){
			result[temp[i]-1] = i+1;
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			int[] q = solution(n);
			for(int j=0;j<n-1;j++){
				System.out.print(q[j]+" ");
			}
			System.out.println(q[n-1]);
		}
	}
}
