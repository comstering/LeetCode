class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        setNums = set(nums)
        answer = [0, 0]
        resultNums = set(range(1, len(nums) + 1))
        
        answer[1] = (resultNums - setNums).pop()
        for i in sorted(nums):
            if answer[0] == i:
                break
            answer[0] = i
        return answer
