class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        pattern.length != s.split(" ").size && return false
        val patternMap = mutableMapOf<Char, String>()
        val sMap = mutableMapOf<String, Char>()
        for((p, s) in pattern.toList().zip(s.split(" "))) {
            if(patternMap[p] == null) {
                patternMap[p] = s
            } else {
                if(patternMap[p] != s) {
                    return false
                }
            }
            if(sMap[s] == null) {
                sMap[s] = p
            } else {
                if(sMap[s] != p) {
                    return false
                }
            }
        }
        return true
    }
}