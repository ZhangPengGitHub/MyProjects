import java.util.Scanner;
import java.util.Stack;
public class Main{
    public static boolean isPrime(long num){
        for(long i=2;i<=new Double(Math.sqrt(num)).longValue();i++){
        	if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static String getResult(long num){
        StringBuffer result = new StringBuffer();
        boolean flag = true;
        Stack<Long> stack = new Stack();
        long last;
        for(long i=2;i<=new Double(Math.sqrt(num)).longValue();i++){
            if(num%i==0&&isPrime(i)){
            	last = num/i;
            	if(isPrime(last)&&last!=i){
            		stack.push(last);
            	}
                if(flag){
                    result.append(i);
                    flag = false;
                }else{
                    result.append(" "+i);
                }
            }
        }
        while(!stack.isEmpty()){
        	result.append(" "+stack.pop());
        }
        if(isPrime(num)){
        	if(flag){
                result.append(num);
                flag = false;
            }else{
                result.append(" "+num);
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = Long.MAX_VALUE;
        System.out.println(getResult(num));
    }
}