//14.Drawing various shapes using Graphical statements. (Using Applets) 
import java.awt.*; 
import java.applet.*; 
/*<applet code="sampface"width=400 height=60> 
</applet> 
*/ 
public class sampface extends Applet 
{ 
public void paint(Graphics g) 
{ 
g.setColor(Color.green); 
g.drawRect(20,20,165,180); 
g.setColor(Color.red); 
g.drawOval(40,40,120,150); 
g.setColor(Color.yellow); 
g.drawOval(57,75,30,20); 
g.drawOval(110,75,30,20); 
g.setColor(Color.black); 
g.fillOval(68,81,10,10); 
g.fillOval(121,81,10,10); 
g.setColor(Color.orange); 
g.drawOval(85,100,30,30); 
g.setColor(Color.blue); 
g.fillArc(60,125,80,40,180,180); 
g.setColor(Color.green); 
g.drawOval(25,92,15,30); 
g.drawOval(160,92,15,30); 
} } 
