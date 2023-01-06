class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        if (costs[0] > coins) return 0
        val longCosts = costs.sorted().map { it.toLong() }
        val longCoins = coins.toLong()
        var result = costs.lastIndex
        var smallIdx = 0
        var bigIdx = result
        do {
            val costsSum: Long = longCosts.slice(0..result).sum()
            if (costsSum == longCoins) {
                break
            }
            else if (costsSum > longCoins) {
                bigIdx = result
                result = (smallIdx + result) / 2
            }
            else {
                smallIdx = result
                result = (result + bigIdx) / 2
            }
        } while (result in (smallIdx + 1) until bigIdx)
        return result + 1
    }
}