// Interface  
interface AcademicEntity {     void displayInfo(); 
}  
class Student implements AcademicEntity {     private String name;     private int id;     private String major; 
 
    public Student(String name, int id, String major) 
{ 
        this.name = name;         this.id = id;         this.major = major; 
    } 
 
    @Override 
    public void displayInfo() { 
        System.out.println("Student Name: " + name); 
        System.out.println("Student ID: " + id); 
        System.out.println("Major: " + major); 
    } 
} 
 
// Class representing a Professor, implementing AcademicEntity 
class Professor implements AcademicEntity {     private String name;     private int id; 
    private String department; 
 
    public Professor(String name, int id, String department) { 
        this.name = name;         this.id = id; 
        this.department = department; 
    } 
 
 
    public void displayInfo() { 
        System.out.println("Professor Name: " + name); 
        System.out.println("Professor ID: " + id); 
        System.out.println("Department: " + department); 
    } 
}  
public class Main5{ 
    public static void main(String[] args) { 
        AcademicEntity student = new 
Student("Alice", 1001, "Computer Science"); 
        student.displayInfo();         System.out.println();

    } 
} 
/*Output: 
Student Name: Alice 
Student ID: 1001 
Major: Computer Science */
