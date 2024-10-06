def reverse_vowels(s): 
    vowels = [c for c in s if c in "aeiouAEIOU"] 
    result = []     
    for c in s:        
         if c in "aeiouAEIOU": 
            result.append(vowels.pop()) 
         else: 
            result.append(c)     
            return ''.join(result) 
 
string = input("Enter a string: ") 
print("Modified string:", reverse_vowels(string)) 
