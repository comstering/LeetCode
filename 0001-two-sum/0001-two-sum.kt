class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var idx1 = 0
        var idx2 = 1
        var lastIdx = nums.lastIndex
        while ((nums[idx1] + nums[idx2]) != target) {
            if (idx2 >= lastIdx) {
                idx1++
                idx2 = idx1 + 1
            } else {
                idx2++
            }
        }
        return intArrayOf(idx1, idx2)
    }
}