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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int s = q.size();
            for(int i = 0; i < s; i++){
                TreeNode c =  q.remove();
                level.add(c.val);
                if(c.left != null) q.add(c.left);
                if(c.right != null) q.add(c.right);
            }
            result.add(level);
        }
        return result;
    }
}