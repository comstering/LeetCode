class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n:Int):Int {
        return Integer.toBinaryString(n).padStart(32, '0').reversed().toLong(2).toInt()
    }
}