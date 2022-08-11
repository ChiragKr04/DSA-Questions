class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        
        
        num1Last = m-1
        
        num2Last = n-1
        
        insertPosi = m+n-1
        
        while num2Last >= 0:
            
            if num1Last >= 0 and nums1[num1Last] > nums2[num2Last]:
                nums1[insertPosi] = nums1[num1Last]
                insertPosi -= 1
                num1Last -= 1
            else:
                nums1[insertPosi] = nums2[num2Last]
                num2Last -= 1
                insertPosi -= 1
        
        