public class Sqrt {
	public static int mySqrt(int x) {
        if(x<0){
            return 0;
        }
        else if(x<=1){
            return x;
        }
        else{
            int low = 1;
            int high = x;
            int mid = (high+low)/2;
            while(low<=high){
                if((mid==x/mid)||(mid<x/mid && (mid+1)>x/(mid+1))){
                    break;
                }
                else if(mid<x/mid){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
                mid = (high+low)/2;
            }
            return mid;
        }
    }
	public static void main(String[] args){
		System.out.println(mySqrt(101));
	}
}
