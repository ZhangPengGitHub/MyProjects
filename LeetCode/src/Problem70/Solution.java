package Problem70;
import java.math.BigInteger;

public class Solution {
    public BigInteger factorial(int n){
        if(n==0){
            return new BigInteger("1");
        }else{
            return new BigInteger(Integer.toString(n)).multiply(factorial(n-1));
        }
    }
    public int climbStairs(int n) {
        int c1 = 0;
        int c2 = 0;
        int temp = 0;
        int result = 0;
        
        c2 = 0;
        c1 = n-2*c2;
        while(2*c2<=n){
            temp = (factorial(c1+c2).divide((factorial(c1).multiply(factorial(c2))))).intValue();
            result = result+temp;
            c2++;
            c1 = n-2*c2;
        }
        return result;
    }
    public static void main(String[] args){
    	int parameter = 44;
    	Solution test = new Solution();
    	System.out.println(test.climbStairs(parameter));
    }
}