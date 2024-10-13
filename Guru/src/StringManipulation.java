//string bufferclass
public class StringManipulation {     public static void main(String[] args) { 
    // Using String class 
    String str1 = "Hello"; 
    String str2 = "World"; 

    // Concatenation using String 
    String concatenatedString = str1 + " " + str2;         System.out.println("Concatenated String: " + concatenatedString); 

    // Convert to uppercase 
    String upperCaseString = concatenatedString.toUpperCase(); 
    System.out.println("Uppercase String: " + upperCaseString); 

    // Convert to lowercase 
    String lowerCaseString = concatenatedString.toLowerCase(); 
    System.out.println("Lowercase String: " + lowerCaseString); 

    // Using StringBuffer class 
    StringBuffer stringBuffer = new StringBuffer(concatenatedString); 

    // Reversing the string using StringBuffer         stringBuffer.reverse(); 
    System.out.println("Reversed String: " + stringBuffer.toString()); 

    // Replacing characters in the string using StringBuffer 
    stringBuffer.reverse(); // Reversing it back to the original 
    stringBuffer.replace(6, 11, "Java"); 
    System.out.println("Modified String: " + stringBuffer.toString()); 
} 
} 
/*Output: 
Concatenated String: Hello World 
Uppercase String: HELLO WORLD 
Lowercase String: hello world 
Reversed String: dlroW olleH 
Modified String: Hello Java */
