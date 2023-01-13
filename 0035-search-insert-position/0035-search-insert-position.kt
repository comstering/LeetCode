class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val idx = nums.binarySearch(target)
        return if (idx >= 0) idx else -idx - 1
    }
}