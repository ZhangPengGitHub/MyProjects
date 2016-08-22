import java.util.Arrays;


public class Lgp {
	public boolean pre(int[] arr,int val){
		for(int i=0;i<arr.length;i++){
			if(val==arr[i]){
				return true;
			}
		}
		return false;
	}
	public int solution(int[] arr){
		Arrays.sort(arr);
		int len = arr.length;
		int sub;
		int tempint;
		int templen = 0;
		int maxlen = 0;
		int i=0,j=0;
		for(i=0;i<len;i++){
			for(j=i+1;j<len;j++){
				templen = 2;
				sub = arr[j]-arr[i];
				tempint = arr[j]+sub;
				while(pre(arr,tempint)){
					templen++;
					tempint = tempint+sub;
				}
				maxlen = maxlen>templen?maxlen:templen; 
			}
		}
		return maxlen;
	}
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,7,9,11,13,15,17,19,21};
		System.out.println(new Lgp().solution(arr));
	}
}
