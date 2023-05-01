class Solution {
    fun average(salary: IntArray): Double {
        val max = salary.max() ?: 0
        val min = salary.min() ?: 0

        var sum = salary.sum()
        sum -= (max + min)
        return sum.toDouble() / (salary.size - 2)
    }
}
