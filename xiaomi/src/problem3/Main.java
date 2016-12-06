package problem3;

import java.util.Scanner;

public class Main {
	final static int E =0;
	final static int F =1;
	final static int G =2;
	final static int H =3;
	final static int I =4;
	final static int N =5;
	final static int O =6;
	final static int R =7;
	final static int S =8;
	final static int T =9;
	final static int U =10;
	final static int V =11;
	final static int W =12;
	final static int X =13;
	final static int Z =14;
	public static String solution(String str){
		String rtn = "";
		int len = str.length();
		int[] num = new int[15];
		for(int i=0;i<15;i++){
			num[i] = 0;
		}
		int[] result = new int[10];
		for(int i=0;i<len;i++){
			switch(str.charAt(i)){
			case 'E':
				num[E]++;
				break;
			case 'F':
				num[F]++;
				break;
			case 'G':
				num[G]++;
				break;
			case 'H':
				num[H]++;
				break;
			case 'I':
				num[I]++;
				break;
			case 'N':
				num[N]++;
				break;
			case 'O':
				num[O]++;
				break;
			case 'R':
				num[R]++;
				break;
			case 'S':
				num[S]++;
				break;
			case 'T':
				num[T]++;
				break;
			case 'U':
				num[U]++;
				break;
			case 'V':
				num[V]++;
				break;
			case 'W':
				num[W]++;
				break;
			case 'X':
				num[X]++;
				break;
			case 'Z':
				num[Z]++;
				break;
			default:
				break;
			}
		}
		result[2] = num[Z];
		num[E] -= result[2];
		num[R] -= result[2];
		num[O] -= result[2];
		result[4] = num[W];
		num[T] -= result[4];
		num[O] -= result[4];
		result[6] = num[U];
		num[F] -= result[6];
		num[O] -= result[6];
		num[R] -= result[6];
		result[8] = num[X];
		num[S] -= result[8];
		num[I] -= result[8];
		result[7] = num[F];
		num[I] -= result[7];
		num[V] -= result[7];
		num[E] -= result[7];
		result[5] = num[R];
		num[T] -= result[5];
		num[H] -= result[5];
		num[E] = num[E] - 2*result[5];
		result[3] = num[N];
		num[O] -= result[3];
		num[E] -= result[3];
		result[9] = num[V];
		num[S] -= result[9];
		num[E] = num[E] - 2*result[9];
		num[N] -= result[9];
		result[0] = num[H];
		result[1] = num[N]/2;
		for(int i=0;i<10;i++){
			for(int j=0;j<result[i];j++){
				rtn += i;
			}
		}
		return rtn;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++){
			String str = sc.next();
			System.out.println(solution(str));
		}
	}
}
