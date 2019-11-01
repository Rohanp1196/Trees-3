// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null) return true; //if tree empty
        
        return check(root.left, root.right); //Compare left and right
        
    }
    
        public boolean check(TreeNode left, TreeNode right){
            
            if(left==null && right==null) return true;
            
             //Value not equal or any one of left nad right is null
            
            if(left == null || right == null || left.val != right.val) return false; 
            
           
            
            return check(left.left,right.right) && check(left.right,right.left); //Reccursive checking
            
            
        }
        
    
}