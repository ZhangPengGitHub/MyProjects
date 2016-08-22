package Problem43;
public class Solution {
    public String multiply(String num1, String num2) {
    	if(num1.equals("0")||num2.equals("0")){
    		return "0";
    	}
        StringBuffer temp1 = new StringBuffer(num1).reverse();
        StringBuffer temp2 = new StringBuffer(num2).reverse();
        StringBuffer result = new StringBuffer();
        int len1 = temp1.length();
        int len2 = temp2.length();
        int len = len1+len2-1;
        int temp_1 = 0;
        int temp_2 = 0;
        int temp_sum = 0;
        int min = 0;
        int max = 0;
        int flag = 0;
        for(int i=1;i<=len;i++){
        	//len2-1>=i-1-j>=0 && len1-1>=j>=0
            min = 0 > i-len2 ? 0 : i-len2;
            max = len1 < i ? len1-1 : i-1;
            temp_sum = 0;
            for(int j=min;j<=max;j++){
                temp_1 = temp1.charAt(j)-'0';
                temp_2 = temp2.charAt(i-1-j)-'0';
                temp_sum += temp_1*temp_2;
            }
            temp_sum = temp_sum + flag;
            flag = temp_sum/10;
            temp_sum = temp_sum%10;
            result.append(temp_sum);
        }
        if(flag>0){
            result.append(flag);
        }
        result.reverse();
        return result.toString();
    }
    public static void main(String[] args){
    	String str1 = "888";
    	String str2 = "88";
    	Solution test = new Solution();
    	System.out.println(test.multiply(str1, str2));
    }
}