class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var count = 0
        for (i in nums.indices) {
            if (nums[i] == `val`) {
                nums[i] = Int.MAX_VALUE
            } else {
                count++
            }
        }
        nums.sort()
        return count
    }
}