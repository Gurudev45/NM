//13.Parameter passing technique. (Using Applets) 
import java.awt.*; 
import java. applet.*; 
public class HelloJava extends Applet { 
String str; 
public void init( ) 
{ 
str = getParameter("string");  if (str == null)          str = "Java"; str ="Hello" + str;  
} 
public void paint (Graphics g) 
{ 
g.drawString(str, 10, 100);
} } 
/*<HTML> 
<! Parameterized HTML file> 
<HEAD> 
<TITLE> 
Welcome to Java Applets </TITLE> 
<HEAD> <BODY> 
<APPLET CODE = HelloJavaParam.class WIDTH = 
400 
 HEIGHT = 200> <PARAM NAME = "string" VALUE = 
"Applet!"> </APPLET> 
</BODY> 
</HTML> */