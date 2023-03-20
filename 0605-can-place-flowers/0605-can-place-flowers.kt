class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = n
        for (i in flowerbed.indices) {
            val left = if (i > 0) flowerbed[i - 1] else 0
            val right = if (i < flowerbed.size - 1) flowerbed[i + 1] else 0
            val now = flowerbed[i]
            if (left != 1 && right != 1 && now != 1) {
                flowerbed[i] = 1
                count--
            }
        }
        return count <= 0
    }
}