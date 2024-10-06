amount = int(input("Enter amount to withdraw: "))
notes_2000 = amount // 2000 
amount %= 2000 
notes_500 = amount // 500
amount %= 500
notes_100 = amount // 100 
 
print(f"2000s: {notes_2000}, 500s: {notes_500}, 100s: {notes_100}") 
