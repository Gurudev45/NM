name = input("Enter your name: ") 
password = name.replace('a', '@').replace('e', '3').replace('i', '1').replace('o', '0').replace('u', '7')
print("Generated password:", password) 
