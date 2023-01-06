class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        costs.sort()
        val newCost = costs.sorted().map { it.toLong() }
        if (costs[0] > coins) return 0
        var result = costs.lastIndex
        var smallIdx = 0
        var bigIdx = result
        while (true) {
            val costsSum: Long = newCost.slice(0..result).sum()
            if (costsSum == coins.toLong()) {
                break
            }
            else if (costsSum > coins.toLong()) {
                bigIdx = result
                result = (smallIdx + result) / 2
            }
            else {
                smallIdx = result
                result = (result + bigIdx) / 2
            }
            if(smallIdx >= bigIdx || result == smallIdx || result == bigIdx) {
                break
            }
        }
        return result + 1
    }
}