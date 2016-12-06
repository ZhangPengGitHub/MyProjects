package baidu;

//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//CLASS BEGINS, THIS CLASS IS REQUIRED
import java.util.*;

public class RoundRobin {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static float waitingTimeRobin(int[] arrival, int[] run, int q) {
		int len = arrival.length;
		int i = 0;
		int k = 0;
		int m = 0;
		int n = 0;
		int flag = 0;
		int t = 0;
		float sum = 0;

		int[] arr = new int[len * 10];
		int[] time = new int[len];
		int[] wait = new int[len];
		for (int j = 0; j < len; j++) {
			time[j] = run[j];
		}
		while (k < len) {
			if (arrival[k] <= t) {
				arr[m++] = k++;
			} else {
				break;
			}
		}
		// INSERT YOUR CODE HERE
		while (flag < len) {
			i = arr[n++];
			System.out.println(i);
			for(int j=0;j<n;j++){
				System.out.print(arr[j]+"\t");
			}
			System.out.println();
			for(int j=0;j<len;j++){
				System.out.print(time[j]+"\t");
			}
			System.out.println();
			if (time[i] > q) {
				t += q;
				time[i] -= q;
			} else {
				flag++;
				t += time[i];
				time[i] = 0;
				wait[i] = t - arrival[i] - run[i];
			}
			while (k<len) {
				if (arrival[k] <= t) {
					arr[m++] = k++;
				} else {
					break;
				}
			}
			if(time[i]!=0){
				arr[m++] = i;
			}
		}
		for (int j = 0; j < len; j++) {
			// System.out.println(wait[j]);
			sum += wait[j];
		}
		return sum / len;
	}
	// METHOD SIGNATURE ENDS
	public static void main(String[] args){
		int[] arrival = {0,1,4};
		int[] run = {5,2,3};
		int q = 3;
		System.out.println(waitingTimeRobin(arrival, run, q));
 	}
}