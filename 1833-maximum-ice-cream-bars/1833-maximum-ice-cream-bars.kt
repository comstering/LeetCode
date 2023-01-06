class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        costs.sort()
        var leftCoins = coins
        var result = 0
        for (cost in costs) {
            if (leftCoins >= cost) {
                result += 1
                leftCoins -= cost
            }
            else {
                break
            }
        }
        return result
        
    }
}