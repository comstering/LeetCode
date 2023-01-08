class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x.toString() == x.toString().reversed()) {
            return true
        }
        else return false
    }
}