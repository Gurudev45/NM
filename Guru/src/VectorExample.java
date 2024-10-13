// Program using *Vectors*.
import java.util.Collections; 
import java.util.Scanner; 
import java.util.Vector;
 public class VectorExample 
 {     public static void main(String[] args) {  
    Vector<Integer> numbers = new Vector<>(); 
    Scanner scanner = new Scanner(System.in);  
    System.out.println("Enter numbers (type)'done' to finish):");
             while (true) { 
        String input = scanner.nextLine();    
                if (input.equalsIgnoreCase("done")) {                 
                    break; 
                }
                    try { 
            int number = Integer.parseInt(input);         
                    numbers.add(number); 
        } catch (NumberFormatException e) { 
            System.out.println("Invalid input. Please enter a valid integer or 'done' to finish."); 
        } 
    }  
    if (numbers.isEmpty()) { 
        System.out.println("The Vector is empty."); 
    } else { 
 
        System.out.println("Numbers in the Vector: " + numbers); 
        int max = Collections.max(numbers); 
        System.out.println("Maximum value: " + max); 
        Collections.sort(numbers); 
        System.out.println("Sorted Vector: " + numbers); 
    } 
         scanner.close(); 
} 
} 
/*Output: 
Enter numbers (type 'done' to finish): 
5 
12 
3 
8 
done 
Numbers in the Vector: [5, 12, 3, 8] 
Maximum value: 12 
Sorted Vector: [3, 5, 8, 12] */
