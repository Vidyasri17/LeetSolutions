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
    long total = 0;
    long max = 0;
    static final int MOD = 1000000007;
    public void computeTotal(TreeNode root){
        if(root == null) return ;
        total += root.val;
        computeTotal(root.left);
        computeTotal(root.right);
    }
    public long dfs(TreeNode root){
        if(root == null) return 0;
        long left = dfs(root.left);
        long right = dfs(root.right);
        long sub = left + right + root.val;
        long product = sub * (total - sub);
        max = Math.max(product, max);
        return sub;
    }
    public int maxProduct(TreeNode root) {
        computeTotal(root);
        dfs(root);
        return (int)(max % MOD);
    }
}