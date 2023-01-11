/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null && list2 == null) return null
        val node: ListNode?
        
        if (list1 == null) {
            node = list2
        } else if (list2 == null) {
            node = list1
        } else {
            if (list1.`val` < list2.`val`) {
                node = list1
                node.next = mergeTwoLists(list1.next, list2)
            } else {
                node = list2
                node.next = mergeTwoLists(list1, list2.next)
            }
        }
        return node
    }
}
