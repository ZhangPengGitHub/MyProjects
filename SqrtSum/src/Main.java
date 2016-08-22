import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void solution(int n,int m){
		DecimalFormat df = new DecimalFormat("0.00");   
		double result = 0;
		double temp = n;
		for(int i=0;i<m;i++){
			result+=temp;
			temp=Math.sqrt(temp);
		}
		System.out.println(result);
		System.out.println(df.format(result));
	}
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
        int a, b;
        while(cin.hasNextInt())
        {
            a = cin.nextInt();
            b = cin.nextInt();
            solution(a,b);
        }
	}
}
