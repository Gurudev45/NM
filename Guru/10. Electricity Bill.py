units = int(input("Enter units consumed: ")) 
 
if units <= 100:    
     bill = units * 1.5 
elif units <= 200: 
    bill = 100 * 1.5 + (units - 100) * 2
else: 
    bill = 100 * 1.5 + 100 * 2 + (units - 200) * 3 
print(f"Total bill: {bill}") 