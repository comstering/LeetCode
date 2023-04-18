class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        lateinit var longWord: String
        var shortLength = 0
        if(word1.length < word2.length) {
            longWord = word2
            shortLength = word1.length
        }
        else {
            longWord = word1
            shortLength = word2.length
        }

        var answer = StringBuilder()

        for (i in 0 until shortLength) {
            answer.append(word1[i])
            answer.append(word2[i])
        }

        answer.append(longWord.substring(shortLength))

        return answer.toString()
    }
}