#the problem that we have are given the array and we will check if the target bninary ahas in array

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        # Implement binary search algorithm
        left, right = 0, len(nums) - 1
        
        while left <= right:
            mid = (left + right) // 2
            # Check if the mid element is the target
            if nums[mid] == target:
                return mid
            # If target is greater, ignore the left half
            elif nums[mid] < target:
                left = mid + 1
            # If target is smaller, ignore the right half
            else:
                right = mid - 1
        
        # Target is not present in the array
        return -1
        
        