class Solution {
    fun compress(chars: CharArray): Int {
        var char = chars[0]
        var idx = 0
        var count = 1

        for (i in 1 until chars.size) {
            if (chars[i] != char) {
                chars[idx++] = char
                if (count > 1) {
                    for (c in count.toString().toCharArray()) {
                        chars[idx++] = c
                    }
                }
                char = chars[i]
                count = 0
            }
            count++
        }

        chars[idx++] = char

        if (count > 1) {
            for (c in count.toString().toCharArray()) {
                chars[idx++] = c
            }
        }

        return idx
    }
}