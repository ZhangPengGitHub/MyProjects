package problem2;

import java.util.Scanner;

public class Main {
	final int RED = 0, GREEN = 1, BLUE = 2, YELLOW = 3, PURPLE = 4;
	int[][] p = {
	        {RED,RED,BLUE,BLUE,GREEN,YELLOW,BLUE,YELLOW,RED,PURPLE},
	        {GREEN,GREEN,GREEN,BLUE,RED,PURPLE,RED,YELLOW,YELLOW,BLUE},
	        {BLUE,RED,RED,YELLOW,YELLOW,PURPLE,BLUE,GREEN,GREEN,BLUE},
	        {YELLOW,RED,BLUE,YELLOW,BLUE,RED,PURPLE,GREEN,GREEN,RED},
	        {YELLOW,RED,BLUE,BLUE,PURPLE,GREEN,PURPLE,RED,YELLOW,BLUE},
	        {PURPLE,YELLOW,RED,RED,YELLOW,RED,PURPLE,YELLOW,RED,RED},
	        {YELLOW,YELLOW,GREEN,PURPLE,GREEN,RED,BLUE,YELLOW,BLUE,GREEN},
	        {RED,YELLOW,BLUE,BLUE,YELLOW,GREEN,PURPLE,RED,BLUE,GREEN},
	        {GREEN,GREEN,YELLOW,YELLOW,RED,RED,PURPLE,BLUE,BLUE,GREEN},
	        {PURPLE,BLUE,RED,RED,PURPLE,YELLOW,BLUE,RED,RED,GREEN}};
	public static int getX(int dianji){
		int x = (dianji-1)/10;
		int y = (dianji-1)%10;
		return x;
	}
	public static int getY(int dianji){
		int x = (dianji-1)/10;
		int y = (dianji-1)%10;
		return y;
	}
	public static void xianglin(int x,int y,Main m){
		int temp = m.p[x][y];
		if(temp==-1){
			return;
		}
		m.p[x][y] = -1;
		if(x>0&&m.p[x-1][y]==temp){
			xianglin(x-1,y,m);
		}else if(x<9&&m.p[x+1][y]==temp){
			xianglin(x+1,y,m);
		}else if(y>0&&m.p[x][y-1]==temp){
			xianglin(x,y-1,m);
		}else if(y<9&&m.p[x][y+1]==temp){
			xianglin(x,y+1,m);
		}
	}
	public static void xiayi(Main m){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(m.p[i][j]==-1){
					int temp = i-1;
					while(temp>=0){
						m.p[temp+1][j]=m.p[temp--][j];
					}
					m.p[0][j]=-1;
				}
			}
		}
	}
	static boolean flag = true;
	public static void zuoyi(Main m){
		for(int i=0;i<10;i++){
			int j=0;
			int k=0;
			for(j=0;j<10;j++){
				if(m.p[j][i]!=-1){
					flag = false;
					break;
				}
			}
			if(flag){
				for(k=j+1;k<=9;k++){
					for(int l=0;l<10;l++){
						m.p[l][k-1] = m.p[l][k];
					}
				}
				for(int l=0;l<10;l++){
					m.p[l][9] = -1;
				}
			}else{
				flag = true;
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			String[] strArr = str.trim().split(" ");
			int[] num = new int[strArr.length];
			for(int i=0;i<num.length;i++){
				num[i] = Integer.valueOf(strArr[i]);
			}
			Main m = new Main();
			for(int i=0;i<num.length;i++){
				xianglin(getX(num[i]),getY(num[i]),m);
				xiayi(m);
				zuoyi(m);
			}
			int[] result = {0,0,0,0,0};
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					for(int k=0;k<5;k++){
						if(m.p[i][j]==k){
							result[k]++;
						}
					}
				}
			}
			for(int i=0;i<5;i++){
				System.out.print(result[i]+" ");
			}
			System.out.println();
		}
	}
}
