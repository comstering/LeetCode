class Solution {
    fun minimumRounds(tasks: IntArray): Int {
        val taskCount = tasks.toTypedArray().groupingBy { it }.eachCount()

        var answer = 0

        for (value in taskCount.values) {
            if (value == 1) {
                answer = -1
                break
            }
            answer += value / 3
            if (value % 3 != 0) {
                answer++
            }
        }

        return answer
    }
}
