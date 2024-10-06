nums = list(map(int, input("Enter numbers: ").split()))
duplicates = set([x for x in nums if nums.count(x) > 1]) 
 
print("Duplicates:", duplicates) 