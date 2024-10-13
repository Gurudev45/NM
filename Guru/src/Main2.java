//Program using Constructors.  
class Rectangle { 
    
    private double length;   
    private double width; 
    public Rectangle(double length, double width) { 
    this.length = length; 
    this.width = width; 
    } 
 public double calculateArea() {     
        return length * width; 
    } 
    public double calculatePerimeter() {         
        return 2 * (length + width); 
    } 
    public double getLength() {  
               return length; 
    } 
    public void setLength(double length) {   
              this.length = length; 
    } 
    public double getWidth() { 
        return width; 
    } 
 
    public void setWidth(double width) {         
        this.width = width; 
    } 
} 
public class Main2 { 
    public static void main(String[] args) { 
        Rectangle rectangle1 = new Rectangle(5.0,3.0); 
        System.out.println("Rectangle 1:"); 
        System.out.println("Length: " + rectangle1.getLength()); 
        System.out.println("Width: " + rectangle1.getWidth()); 
        System.out.println("Area: " + rectangle1.calculateArea()); 
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter()); 
 
        System.out.println(); 
 
         
    } 
} 
/*Output: 
Rectangle 1: 
Length: 5.0 
Width: 3.0 
Area: 15.0 
Perimeter: 16.0 */
