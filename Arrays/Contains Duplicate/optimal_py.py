def containsDuplicate(nums):
    hs = set()

    for x in nums:
        if x in hs:
            return True
        hs.add(x)

    return False

print(containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2]))
