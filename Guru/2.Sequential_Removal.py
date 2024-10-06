sequence = input("Enter a sequence: ") 
remove = input("Enter characters to remove: ") 
 
for char in remove: 
    sequence = sequence.replace(char, "") 
 
print("Modified sequence:", sequence) 
