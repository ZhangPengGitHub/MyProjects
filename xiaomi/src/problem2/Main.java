package problem2;

import java.util.Scanner;

public class Main {
	public static String solution(String str){
		String result = "";
		String[] arr = str.trim().split(" ");
		int len = arr.length;
		for(int i=0;i<len/2;i++){
			String temp = arr[i];
			arr[i] = arr[len-1-i];
			arr[len-1-i] = temp;
		}
		for(int i=0;i<len-1;i++){
			result += arr[i] + " ";
		}
		result += arr[len-1];
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			System.out.println(solution(str));
		}
	}
}
