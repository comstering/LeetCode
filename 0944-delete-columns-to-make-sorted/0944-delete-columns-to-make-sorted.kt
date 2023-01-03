class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        var count = 0
        for (i in strs[0].indices) {
            var now = 'a'
            var goNext = true
            for (j in strs.indices) {
                goNext = now <= strs[j][i]
                if (!goNext) {
                    count += 1
                    break
                }
                now = strs[j][i]
            }
        }
        return count
    }
}