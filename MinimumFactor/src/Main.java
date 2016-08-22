import java.util.Scanner;

public class Main {
	public static boolean pre(int j,int k){
		boolean result = true;
		if(j%k==0 && k!=2){
			for(int i=2;i<k;i++){
				if(j%i==0){
					result = false;
				}
			}
		}else if(j%k!=0){
			result = false;
		}
		return result;
	}
	public static int solution(int a,int b,int k){
		int result = 0;
		for(int i=a;i<=b;i++){
			if(pre(i,k)){
				result++;
			}
		}
		return result;
	}
	public static void main(String[] args){
		int a,b,k;
		Scanner cin = new Scanner(System.in);
		while(cin.hasNextInt())
	    {
	        a = cin.nextInt();
	        b = cin.nextInt();
	        k = cin.nextInt();
	        System.out.println(solution(a,b,k));
	    }
	}
	
}
