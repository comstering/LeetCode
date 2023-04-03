class Solution {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        var answer = 0
        people.sort()
        var left = 0
        var right = people.size - 1
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++
            }
            right--
            answer++
        }
        return answer
    }
}