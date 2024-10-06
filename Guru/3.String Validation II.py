import re 
 
def validate_string(s): 
    if re.search("[A-Z]", s) and re.search("[0-9]", s) and re.search("[!@#$%&*]", s): 
        print("String is valid") 
    else: 
        print("String is invalid") 
 
validate_string(input("Enter a string: ")) 
