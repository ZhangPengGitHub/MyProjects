package problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
	public int val = 0;
	public Node[] son;

	public Node(int n) {
		val = n;
		son = new Node[0];
	}
}

public class Tree {
	static Node root;

	public static List<Node> getSon(List<Node> l) {
		List<Node> result = new ArrayList();
		for (int i = 0; i < l.size(); i++) {
			for (int j = 0; j < l.get(i).son.length; j++) {
				result.add(l.get(i).son[j]);
			} 
		}
		return result;
	}

	public static void init(List<List<Integer>> num) {
		root = new Node(num.get(0).get(0));
		root.son = new Node[num.get(0).size() - 1];
		for (int i = 1; i < num.get(0).size(); i++) {
			root.son[i - 1] = new Node(num.get(0).get(i));
		}
		boolean flag = false;
		for (int i = 1; i < num.size(); i++) {
			List<Node> temp1 = new ArrayList();
			List<Node> temp2 = new ArrayList();
			temp1.add(root);
			temp2 = getSon(temp1);
			while (!temp2.isEmpty()) {
				for (Node n : temp2) {
					if (n.val == num.get(i).get(0)) {
						flag = true;
						n.son = new Node[num.get(i).size() - 1];
						for (int j = 1; j < num.get(i).size(); j++) {
							n.son[j - 1] = new Node(num.get(i).get(j));
						}
					}
				}
				if (!flag) {
					temp1 = temp2;
					temp2 = getSon(temp1);
				}else{
					flag = false;
					break;
				}
			}
		}
	}

	public static List<Integer> show(Node root) {
		List<Integer> result = new ArrayList();
		result.add(root.val);
		List<Node> temp1 = new ArrayList();
		List<Node> temp2 = new ArrayList();
		temp1.add(root);
		temp2 = getSon(temp1);
		while (!temp2.isEmpty()) {
			for (Node n : temp2) {
				result.add(n.val);
			}
			temp1 = temp2;
			temp2 = getSon(temp1);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List input = new ArrayList();
		int index = 0;
		while (sc.hasNext()) {
			String[] temp = sc.nextLine().trim().split(" ");
			List tempList = new ArrayList();
			for (int i = 0; i < temp.length; i++) {
				tempList.add(Integer.valueOf(temp[i]));
			}
			input.add(tempList);
		}
		
		init(input);
		List<Integer> result = show(root);
		for(Integer i:result){
			System.out.print(i+"\t");
		}
	}
}
