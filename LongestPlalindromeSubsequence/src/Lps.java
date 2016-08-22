public class Lps {
	public static String Lps(String str,int start,int end){
		String temp = "";
		if(start>end){
			return "";
		}
		else if(start==end){
			return ""+str.charAt(start);
		}
		else{
			temp = str.substring(start,end+1);
		}
		int len = temp.length();
		if(temp.charAt(0)==temp.charAt(len-1)){
			return temp.charAt(0) + Lps(temp,1,len-2) + temp.charAt(0);
		}
		else{
			String str1 = Lps(temp,0,len-2);
			String str2 = Lps(temp,1,len-1);
			return str1.length()>str2.length()?str1:str2;
		}
	}
	public static void main(String[] args){
		String s = "BBABCBCAB";
		System.out.println(Lps(s,0,s.length()-1));
	}
}
