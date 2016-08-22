import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        List<TreeNode> tempNode = new ArrayList<TreeNode>();
        List<TreeNode> tempElement = new ArrayList<TreeNode>();
        if(root==null || root.val=='#'){
            return result;
        }else{
            tempNode.add(root);
            temp.add(root.val);
            result.add(temp);
        }
        while(!tempNode.isEmpty()){
            tempElement.clear();
            temp = new ArrayList<Integer>();
            for(TreeNode tn : tempNode){
                if(tn.left!=null&&tn.left.val!='#'){
                    tempElement.add(tn.left);
                    temp.add(tn.left.val);
                }
                if(tn.right!=null&&tn.right.val!='#'){
                    tempElement.add(tn.right);
                    temp.add(tn.right.val);
                }
            }
            if(!temp.isEmpty()){
                result.add(temp);
                tempNode=tempElement;
            }else{
                break;
            }
        }
        return result;
    }
    public static void main(String[] args){
    	TreeNode root = new TreeNode(1);
    	Solution test = new Solution();
    	List result = test.levelOrder(root);
    }
}