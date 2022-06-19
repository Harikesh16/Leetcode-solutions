// https://leetcode.com/problems/univalued-binary-tree

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
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.right != null && root.right.val != root.val){
            return false;
            
        }
        if(root.left != null && root.left.val != root.val){
            return false;
            
            
        }
//         boolean bool = false;
//         if(root.left!=null){
            
//         }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}