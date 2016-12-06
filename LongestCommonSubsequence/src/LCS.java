public class LCS {
	public static int[][] pre(String str1,String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		int[][] res = new int[len1+1][len2+1];
		int[][] flag = new int[len1+1][len2+1];
		for(int m=0;m<=len1;m++){
			res[m][0] = 0;
			flag[m][0] = 0;
		}
		for(int n=1;n<=len2;n++){
			res[0][n] = 0;
			flag[0][n] = 0;
		}
		int i=0,j=0;
		for(i=1;i<=len1;i++){
			for(j=1;j<=len2;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					flag[i][j] = flag[i-1][j-1] + 1;
					res[i][j] = 0;
				}
				else if(flag[i-1][j]>flag[i][j-1]){
					flag[i][j] = flag[i-1][j];
					res[i][j] = 1;
				}
				else{
					flag[i][j] = flag[i][j-1];
					res[i][j] = -1;
				}
			}
			
		}
		return res;
	}
	public static void printLCS(String str1,String str2,int row,int col,int[][] res){
		int i = row-1;
		int j = col-1;
		if(i>=1 && j>=1){
			if(res[i][j]==0){
				printLCS(str1,str2,row-1,col-1,res);
				System.out.print(str1.charAt(i-1));
			}
			else if(res[i][j]==1){
				printLCS(str1,str2,row-1,col,res);
			}
			else{
				printLCS(str1,str2,row,col-1,res);
			}
		}
	}
	public static void main(String[] args){
		String str1 = "BBABCBCAB";
		String str2 = "BACBCBABB";
		int[][] temp = pre(str1,str2);
		int row = temp.length;
		int col = temp[0].length;
		printLCS(str1,str2,row,col,temp);
	}
}
