class Solution:
    def minDeletions(self, s: str) -> int:
        s_set = set(list(s))
        s_count = [s.count(i) for i in s_set]
        s_count.sort()
        answer = 0
        start, end = 0, 1
        while end < len(s_count):
            if s_count[start] == s_count[end]:
                s_count[start] -= 1
                answer += 1
                for i in reversed(range(start)):
                    if s_count[i] <= 0:
                        break
                    if s_count[i] == s_count[i + 1]:
                        s_count[i] -= 1
                        answer += 1
                    else:
                        break
            start += 1
            end += 1
        return answer
