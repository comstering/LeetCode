class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val result = IntArray(nums.size)
        var index = 0
        for (i in 0 until n) {
            result[index++] = nums[i]
            result[index++] = nums[i + n]
        }
        return result
    }
}