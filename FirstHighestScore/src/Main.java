import java.util.Scanner;

public class Main {
	public static String solution(String[] name,int[] score){
		String result = "";
		int max = Integer.MIN_VALUE;
		int time = Integer.MAX_VALUE;
		boolean flag = true;
		int len = 0;
		String[] resultname = new String[name.length];
		int[] resultscore = new int[score.length];
		int[] resulttime = new int[score.length];
		for(int i=0;i<name.length;i++){
			for(int j=0;j<len;j++){
				if(resultname[j].equals(name[i])){
					resultscore[j] += score[i];
					resulttime[j] = i;
					flag = false;
				}
			}
			if(flag){
				resultname[len] = name[i];
				resultscore[len] = score[i];
				resulttime[len] = i;
				len++;
			}else{
				flag = true;
			}
		}
		for(int i=0;i<len;i++){
			if(resultscore[i]>max || resultscore[i]==max && resulttime[i]<time){
				result = resultname[i];
				max = resultscore[i];
				time = resulttime[i];
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		for(int i=0;i<num;i++){
			int len = cin.nextInt();
			String[] name = new String[len];
			int[] score = new int[len];
			for(int j=0;j<len;j++){
				name[j] = cin.next();
				score[j] = cin.nextInt();
			}
			System.out.println(solution(name,score));
		}
	}
}
