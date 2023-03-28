class Solution {
        fun isValid(s: String): Boolean {
            val stack = Stack<Char>()
            for (c in s) {
                if (stack.size > 0) {
                    if (matching(stack.last(), c)) {
                        stack.pop()
                    }
                    else {
                        stack.push(c)
                    }
                }
                else {
                    stack.push(c)
                }
            }
            return stack.size == 0
        }

        fun matching(pre: Char, pro: Char): Boolean =
            when(pre) {
                '(' -> pro == ')'
                '{' -> pro == '}'
                '[' -> pro == ']'
                else -> false
            }
    }