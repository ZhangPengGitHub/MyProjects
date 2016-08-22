import java.math.BigInteger;

public class Factorial {
    
    /**
     * ����1��n�Ľ׳�,0! = 1
     * @param n
     * @return	1 * 2 * 3 * ... * (n - 1) * n
     */
    public static BigInteger factorial(int n){
        if(n == 0) return new BigInteger("1");
        return factorial(1,n);
    }
    
    /**
     * ����start��end�Ľ׳�,��֧��0����
     * @param start		��ʼ��(����)
     * @param end		��ֹ��(����)
     * @return	start * (start + 1) * ... * (end - 1) * end
     */
    public static BigInteger factorial(int start,int end){
        if(start <= 0 || end < start) throw new IllegalArgumentException("start : " + start + ",end : " + end);
        BigInteger result = new BigInteger("1");
        for(int i = start;i <= end; i++){
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}