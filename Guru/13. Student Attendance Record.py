students = int(input("Enter number of students: ")) 
attendance = [] 
 
for i in range(students): 
    name = input(f"Enter name of student {i+1}: ")   
    present = input(f"Is {name} present (Y/N)? ")   
    attendance.append((name, present == 'Y')) 
 
print("\nAttendance Summary:") 
for name, present in attendance:  
       status = "Present"if present else "Absent" 
       print(f"{name}: {status}") 
