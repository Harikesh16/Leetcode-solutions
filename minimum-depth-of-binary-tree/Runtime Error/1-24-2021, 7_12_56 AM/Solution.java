// https://leetcode.com/problems/minimum-depth-of-binary-tree

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
    public int minDepth(TreeNode root) {
        return height(root);
        
        
    }
    public int height(TreeNode node){
        if (node.left== null && node.right ==null){
            return 1;
        }
        else if (node.left== null && node.right !=null){
            return height(node.left);
        }
        if (node.left!= null && node.right ==null){
            return height(node.right);
        }
        else{
            return 1+Math.min(height(node.left),height(node.right));
        }
    }
}