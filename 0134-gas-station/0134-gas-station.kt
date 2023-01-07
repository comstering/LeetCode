import kotlin.Int.Companion.MAX_VALUE

class Solution {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        if (gas.sum() < cost.sum()) return -1
        val leftGas = gas.zip(cost).map { it.first - it.second }
        var nextLeft = 0
        var resultPair = Pair(MAX_VALUE, 0)
        for (index in leftGas.indices) {
            nextLeft += leftGas[index]
            if (resultPair.first > nextLeft) {
                resultPair = Pair(nextLeft, (index + 1) % leftGas.size)
            }
        }
        return resultPair.second
    }
}