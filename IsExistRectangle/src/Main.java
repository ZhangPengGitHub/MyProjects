import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static boolean isIn(int[][] team,int[] xianduan){
		for(int i=0;i<team.length;i++){
			if(team[i][0]==xianduan[0] && team[i][1]==xianduan[1] && team[i][2]==xianduan[2] && team[i][3]==xianduan[3]){
				return true;
			}
		}
		return false;
	}
	public static int[] solution(int[][] team){
		ArrayList<int[]> shuiping = new ArrayList<>();
		ArrayList<int[]> chuizhi = new ArrayList<>();
		for(int i=0;i<team.length;i++){
			if(team[i][0]==team[i][2]){
				chuizhi.add(team[i]);
			}else{
				shuiping.add(team[i]);
			}
		}
		for(int i=0;i<shuiping.size();i++){
			int[] shuipingI = shuiping.get(i);
			for(int j=i;j<shuiping.size();j++){
				int[] shuipingJ = shuiping.get(j);
				if(shuipingI[0]==shuipingJ[0] && shuipingI[2]==shuipingJ[2]){
					int min = shuipingI[1]<shuipingJ[1]?shuipingI[1]:shuipingJ[1];
					int max = shuipingI[1]>shuipingJ[1]?shuipingI[1]:shuipingJ[1];
					int[] chuizhiI = {shuipingI[0],min,shuipingI[0],max};
					int[] chuizhiJ = {shuipingI[2],min,shuipingI[2],max};
					if(isIn(team,chuizhiI) && isIn(team,chuizhiJ)){
						int[] result = {shuipingI[0],min,shuipingI[2],max};
						return result;
					}
				}
			}
		}
		return new int[0];
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] team = new int[n][4];
		for(int i=0;i<n;i++){
			for(int j=0;j<4;j++){
				team[i][j] = sc.nextInt();
			}
		}
		int[] result = solution(team);
		System.out.print(result[0]+" ");
		System.out.print(result[1]+" ");
		System.out.print(result[2]+" ");
		System.out.println(result[3]);
	}
}
