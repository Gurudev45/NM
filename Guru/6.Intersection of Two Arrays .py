arr1 = list(map(int, input("Enter first array: ").split())) 
arr2 = list(map(int, input("Enter second array: ").split())) 
 
intersection = set(arr1) & set(arr2) 
 
print("Intersection:", intersection) 
