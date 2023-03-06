class Solution {
    fun findKthPositive(arr: IntArray, k: Int): Int {
        var num = 0
        var count = 0
        var idx = 0
        while (count < k) {
            num++
            if (idx < arr.size) {
                if (arr[idx] != num) {
                    count++
                }
                else {
                    idx++
                }
            } else {
                count++
            }
        }
        return num
    }
}