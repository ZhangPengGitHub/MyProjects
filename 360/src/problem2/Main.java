package problem2;

import java.util.Scanner;

public class Main {
	static int handle = 0;
	static int[] flag = null;
	public static void init(int n){
		flag = new int[n];
		for(int i=0;i<n;i++){
			flag[i] = 0;
		}
	}
	public static Integer newOperation(int size){
		int min = -1;
		int temp = 0;
		int index = 0;
		for(int i=0;i<flag.length;i++){
			while(i<flag.length && flag[i]==0){
				temp++;
				i++;
			}
			if(temp>size){
				if(min==-1){
					min = temp;
					index = i - temp;
				}else if(min>temp){
					min = temp;
					index = i - temp;
				}
			}else{
				temp = 0;
			}
		}
		if(min != -1){
			handle++;
			for(int i=0;i<size;i++){
				flag[index+i] = handle;
			}
			return handle;
		}
		return null;
	}
	public static void delOperation(int handle){
		boolean result = false;
		for(int i=0;i<flag.length;i++){
			if(flag[i]==handle){
				flag[i] = 0;
				result = true;
			}
		}
		if(!result){
			System.out.println("ILLEGAL_OPERATION");
		}
	}
	public static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static int find(int[] arr){
		int i = 0;
		while(i<arr.length){
			if(arr[i]==0){
				return i;
			}
		}
		return -1;
	}
	public static void defOperation(){
		boolean flagWhile = false;
		int index = find(flag);
		if(index == -1){
			return;
		}
		for(int i=index+1;i<flag.length;i++){
			while(i<flag.length&&flag[i]!=0){
				flagWhile = true;
				swap(flag,index++,i++);
			}
			if(flagWhile){
				index = i;
				flagWhile = false;
			}
			
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			
			int num = sc.nextInt();
			int max = sc.nextInt();
			
			handle = 0;
			init(max);

			for(int i=0;i<num;i++){
				String str = sc.next();
				int size = 0;
				if(!str.equals("def")){
					size = sc.nextInt();
				}
				
				if(str.equals("new")){
					System.out.println(newOperation(size));
				}else if(str.equals("del")){
					delOperation(size);
				}else{
					defOperation();
				}
			}
		}
	}
}
