package Problem;

import java.util.Scanner;

/**
 * HuaWei
 * Problem2
 * Main.java
 * @author Roc
 * @date 2016-8-17ÉÏÎç10:16:11
 * @Email zp0016@qq.com
 */
public class Main {
	public static boolean isCan(char[][] c,int i,int j){
		boolean result = false;
		boolean temp1 = false;
		boolean temp2 = false;
		boolean temp3 = false;
		boolean temp4 = false;
		boolean temp5 = false;
		boolean temp6 = false;
		if(i>=2){
			temp1 = c[i][j]==c[i-1][j] && c[i][j]==c[i-2][j];
		}
		if(i<=2){
			temp2 = c[i][j]==c[i+1][j] && c[i][j]==c[i+2][j];
		}
		if(i>=1 && i<=3){
			temp3 = c[i][j]==c[i+1][j] && c[i][j]==c[i-1][j];
		}
		if(j>=2){
			temp4 = c[i][j]==c[i][j-1] && c[i][j]==c[i][j-2];
		}
		if(j<=2){
			temp5 = c[i][j]==c[i][j+1] && c[i][j]==c[i][j+2];
		}
		if(j>=1 && j<=3){
			temp6 = c[i][j]==c[i][j+1] && c[i][j]==c[i][j-1];
		}
		result = temp1 || temp2 || temp3 || temp4 || temp5 || temp6;
		return result;
	}
	public static void swap(char[][] c,int i,int j,boolean direction){
		if(direction){
			//Right
			char temp = c[i][j];
			c[i][j] = c[i][j+1];
			c[i][j+1] = temp;
		}else{
			//Down
			char temp = c[i][j];
			c[i][j] = c[i+1][j];
			c[i+1][j] = temp;
		}
	}
	public static int solution(String str){
		int num = 0;
		char[][] c = new char[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				c[i][j] = str.charAt(num++);
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(i<=3){
					swap(c, i, j, false);
					if(isCan(c, i, j) || isCan(c, i+1, j)){
						return i*5+j+1;
					}
					swap(c, i, j, false);
				}
				if(j<=3){
					swap(c, i, j, true);
					if(isCan(c, i, j) || isCan(c, i, j+1)){
						return i*5+j+1;
					}
					swap(c, i, j, true);
				}
			}
		}
		return -1;
	}
	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String str = "TMTMOXRUCqABCXRURMTOTQCRA";
		String str = "TMTMOXRMCqABCXRURMTOTQCRA";
		int ret = solution(str);
		if(ret!=-1){
			System.out.println("YES"+" "+ret);
		}else{
			System.out.println("NO");
		}
	}
}
