/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        if (root == null) return result
        result.add(root.`val`)
        result.addAll(preorderTraversal(root.left))
        result.addAll(preorderTraversal(root.right))
        return result
    }
}