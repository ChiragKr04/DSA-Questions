class Solution:
	def subarraySum(self, nums: List[int], k: int) -> int:


		res = 0
		currSum = 0
		preSums = { 0 : 1 }

		for x in nums:

			currSum += x

			diff = currSum - k

			res += preSums.get(diff, 0)

			preSums[currSum] = 1 + preSums.get(currSum, 0)

		return res




