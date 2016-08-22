import java.util.Scanner;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int v){
		val = v;
		left = null;
		right = null;
	}
}

class Tree {
	TreeNode root;
	Tree(){
		root = new TreeNode(-1);
	}
	public void insert(TreeNode node,String str){
		int len = str.length();
		if(len<=0){
			return;
		}
		char c = str.charAt(0);
		if(c=='0'){
			if(node.left==null){
				node.left = new TreeNode(0);
			}
			insert(node.left,str.substring(1));
		}else if(c=='1'){
			if(node.right==null){
				node.right = new TreeNode(1);
			}
			insert(node.right,str.substring(1));
		}
	}
	public void query(TreeNode node,String str,StringBuffer res){
		int len = str.length();
		if(len<=0){
			return;
		}
		char c = str.charAt(0);
		if(c=='0'){
			if(node.left==null){
				res.append('1');
				query(node.right,str.substring(1),res);
			}else{
				res.append('0');
				query(node.left,str.substring(1),res);
			}
			
		}else if(c=='1'){
			if(node.right==null){
				res.append('0');
				query(node.left,str.substring(1),res);
			}else{
				res.append('1');
				query(node.right,str.substring(1),res);
			}
		}
	}
}

class Exam2 {
	public static long solution(long[] arr){
		int len = arr.length;
		long max = 0;
		for(int i=0;i<len;i++){
			max = max>arr[i]?max:arr[i];
		}
		int maxlen = 0;
		for(int i=1;i<=40;i++){
			if(max<=(long)Math.pow(2,i)-1){
				maxlen = i;
			}else{
				break;
			}
		}
		final long maxval = (long) Math.pow(2,maxlen)-1;
		long[] res1 = new long[len];
		long[] res2 = new long[len];
		res1[0] = arr[0];
		res2[0] = arr[len-1];
		for(int i=1;i<len;i++){
			res1[i] = res1[i-1]^arr[i];
			res2[i] = res2[i-1]^arr[len-1-i];
		}
		Tree tree = new Tree();
		String str1;
		int len1;
		for(int i=0;i<len;i++){
			str1 = Long.toBinaryString(res1[i]);
			len1 = str1.length();
			for(int j=0;j<maxlen-len1;j++){
				str1 = "0" + str1;
			}
			tree.insert(tree.root, str1);
		}
		long result = 0;
		for(int i=0;i<len;i++){
			result = result>res1[i]?result:res1[i];
			result = result>res2[i]?result:res2[i];
		}
		long longRes;
		StringBuffer res;
		String str2;
		int len2;
		for(int i=0;i<len;i++){
			str2 = Long.toBinaryString(maxval^res2[i]);
			len2 = str2.length();
			for(int j=0;j<maxlen-len2;j++){
				str2 = "0" + str2;
			}
			res = new StringBuffer();
			tree.query(tree.root, str2, res);
			longRes = Long.parseLong(res.toString(),2)^res2[i];
			result = result>longRes?result:longRes;
		}
		return result;
	}
}

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		long[] array = new long[len];
		for(int i=0;i<len;i++){
			array[i] = sc.nextLong();
		}
		System.out.println(Exam2.solution(array));
	}
}
