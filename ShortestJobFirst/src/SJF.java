public class SJF {
	public static int min(int[] toa,int[] duration,int time,boolean[] flag){
		int len = toa.length;
		int min = Integer.MAX_VALUE;
		int index = -1;
		for(int i=0;i<len;i++){
			if(!flag[i]&&toa[i]<=time&&duration[i]<min){
				min = duration[i];
				index = i;
			}
		}
		return index;
	}
	public static float solution(int[] toa,int[] duration){
		int len = toa.length;
		float sum = 0;
		float avg;
		int[] wait = new int[len];
		boolean[] flag = new boolean[len];
		for(int i=0;i<len;i++){
			flag[i] = false;
		}
		int time = 0;
		int i = 0;
		int min;
		while(i<len){
			min = min(toa,duration,time,flag);
			if(min==-1){
				time++;
			}else{
				wait[min] = time - toa[min];
				flag[min] = true;
				time += duration[min];
				i++;
			}
		}
		for(int j=0;j<len;j++){
			sum += wait[j];
		}
		avg = sum/len;
		return avg;
	}
	public static void main(String[] args){
		int[] toa = {0,1,3,9};
		int[] duration = {2,1,7,5};
		System.out.println(solution(toa, duration));
	}
}
