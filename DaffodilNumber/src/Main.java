import java.util.Scanner;

public class Main {
	public static void solution(int m,int n){
		int a=0,b=0,c=0;
		int flag = 0;
		for(int i=m;i<=n;i++){
			a = i%10;
			b = (i/10)%10;
			c = i/100;
			if(i == (a*a*a+b*b*b+c*c*c)){
				System.out.println(i);
				flag = 1;
			}
		}
		if(flag==0){
			System.out.println("no");
		}
	}
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
        int m, n;
        while(cin.hasNextInt())
        {
            m = cin.nextInt();
            n = cin.nextInt();
            solution(m,n);
        }
	}
}
