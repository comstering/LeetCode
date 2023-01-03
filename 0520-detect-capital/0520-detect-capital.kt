class Solution {
    fun detectCapitalUse(word: String): Boolean {
        return word.all { it.isUpperCase() } ||
                word.all { it.isLowerCase() } ||
                word.first().isUpperCase() && word.drop(1).all { it.isLowerCase() }
    }
}