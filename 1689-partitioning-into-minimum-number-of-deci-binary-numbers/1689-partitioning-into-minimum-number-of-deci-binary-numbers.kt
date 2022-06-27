class Solution {
    fun minPartitions(n: String): Int {
        var answer: Int = 0
        for (i in 1..n.length) {
            var num = Character.getNumericValue(n[i - 1])
            if (num > answer) {
                answer = num
            }
        }
        return answer
    }
}
