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
    public boolean hasPathSum(TreeNode root, int targetSum) {

        // agar tree hi empty hai to koi path exist nahi karega
        if(root == null) return false;

        // agar current node leaf node hai (left aur right dono null)
        if(root.left == null && root.right == null) {

            // check kar rahe hain ki jo remaining targetSum hai
            // kya wo current node ke value ke equal hai
            // agar haan → valid path mil gaya
            if(targetSum == root.val) return true;
            
            // warna ye path valid nahi hai
            else return false;
        }

        // recursive call:
        // current node ki value ko targetSum se minus kar diya
        // ab left aur right subtree me check karenge
        // agar kisi bhi side se true mil gaya → final answer true
        return hasPathSum(root.left, targetSum - root.val) 
            || hasPathSum(root.right, targetSum - root.val);
    }
}

/*
DRY RUN:

Tree:
        5
       / \
      4   8
     /   / \
    11  13  4
   /  \
  7    2

targetSum = 22

Start:
root = 5
targetSum = 22

→ call left: targetSum = 22 - 5 = 17

root = 4
targetSum = 17

→ call left: targetSum = 17 - 4 = 13

root = 11
targetSum = 13

→ call left: targetSum = 13 - 11 = 2

root = 7 (leaf)
targetSum = 2
→ 7 != 2 ❌ return false

→ call right of 11:
targetSum = 13 - 11 = 2

root = 2 (leaf)
targetSum = 2
→ 2 == 2 ✅ return true

since ek side se true mil gaya → pura recursion true return karega

FINAL OUTPUT: true
*/