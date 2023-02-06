class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val part1 = nums.slice(0 until n)
        val part2 = nums.slice(n until nums.size)
        val result = mutableListOf<Int>()
        for (i in 0 until n) {
            result.add(part1[i])
            result.add(part2[i])
        }
        return result.toIntArray()
    }
}