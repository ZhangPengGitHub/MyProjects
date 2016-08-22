package Problem1288;
import java.util.Scanner;

public class Main {
	public static int min(int a,int b){
		return a<b?a:b;
	}
	public static int chufa(int a,int b){
		if(a%b==0){
			return a/b;
		}
		else{
			return a/b+1;
		}
	}
	public static int font(int n,int p,int w,int h,int[] num){
		int minlen = min(w,h);
		int line_num = 0;
		int lines = 0;
		int temp = 0;
		int s = 0;
		for(s=1;s<=minlen;s++){
			temp = 0;
			line_num = w/s;
			lines = h/s;
			for(int j=0;j<n;j++){
				temp = temp + chufa(num[j],line_num);
			}
			if(temp>lines*p){
				break;
			}
		}
		return s-1;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcase = 0;
        int n = 0;
        int p = 0;
        int w = 0;
        int h = 0;
        int[] num;
        if(in.hasNext()) {
        	testcase = in.nextInt();
        }
        for(int x=0;x<testcase;x++){
        	n = in.nextInt();
        	p = in.nextInt();
        	w = in.nextInt();
        	h = in.nextInt();
        	num = new int[n];
        	for(int y=0;y<n;y++){
        		num[y] = in.nextInt();
        	}
        	System.out.println(font(n,p,w,h,num));
        }
    }
}
