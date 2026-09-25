/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        paths(root,"",list);
        return list;
    }

    private void paths(TreeNode node,String path,List<String> list) {
        if(node == null) return;
        
        if (path.isEmpty()) {
            path = String.valueOf(node.val);
        } else {
            path = path + "->" + node.val;
        }

        // Leaf node
        if (node.left == null && node.right == null) {
            list.add(path);
            return;
        }
        paths(node.left,path,list);
        paths(node.right,path,list);

    }
}