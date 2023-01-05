class Solution {
    fun findMinArrowShots(points: Array<IntArray>): Int {
        if (points.isEmpty()) return 0
        points.sortBy { it[1] }
        var end = points[0][1]
        var answer = 1
        points.forEach {
            if (it[0] > end) {
                answer++
                end = it[1]
            }
        }
        return answer
    }
}