//Program using Class and Object
class Person 
{    String name;    
    int age; 
 
    public Person(String name, int age)
     {        
         this.name = name;        
          this.age = age; 
    } 
 
    public void displayInfo() { 
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
    } 
} 
 
 
public class Main{
    public static void main(String[] args) { 
         
        Person person1 = new Person("Alice", 30); 
        Person person2 = new Person("Bob", 25); 
 
        System.out.println("Person 1:");         
        person1.displayInfo(); 
 
        System.out.println(); 
        System.out.println("Person 2:");        
         person2.displayInfo(); 
    } 
} 
/*Output: 
Person 1: 
Name: Alice 
Age: 30 
Person 2: 
Name: Bob 
Age: 25*/

