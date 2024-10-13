//12.Working with Colors and Fonts. (Using Applets) 
import java.awt.*;
import java. applet.*;
 public class BarChart extends Applet {     
    private int numColumns = 0;
    private String[] labels;    
    private int[] values; 
    private Color[] colors = {Color.red, Color.blue, Color.green, Color.black}; 
 
    public void init() {    
             try { 
            numColumns = Integer.parseInt(getParameter("columns"));             
            labels = new String[numColumns];             
            values = new int[numColumns]; 
 
            for (int i = 0; i < numColumns; i++) {            
            labels[i] = getParameter("label" + (i + 1));                 
            values[i] = Integer.parseInt(getParameter("c" + (i + 1))); 
            } 
        } catch (NumberFormatException e) { 
            System.err.println("Error parsing parameters: " + e.getMessage()); 
        } 
    } 
 
    public void paint(Graphics g) {        
        final int xOffset = 20;        
        final int yOffset = 30;        
        final int barWidth = 40; 
 
        for (int i = 0; i < numColumns; i++) { 
            g.setColor(colors[i % colors.length]); // Cycle through colors 
            g.drawString(labels[i], xOffset, i * 50 + yOffset); 
            g.fillRect(50, i * 50 + 10, values[i], barWidth); 
        } 
    } 
} 
/*HTML PROGRAM: 
<HTML> 
<APPLET 
CODE = BarChart.class  
WIDTH = 300 
HEIGHT = 250> 
<PARAM NAME = "columns" VALUE = "4"> 
<PARAM NAME = "c1" VALUE="110"> 
<PARAM NAME = "c2" VALUE ="150"> 
<PARAM NAME = "c3" VALUE = "100"> 
<PARAM NAME = "c4" VALUE="170"> 
<PARAM NAME = "label 1" VALUE = "91"> 
<PARAM NAME = "label 2" VALUE = "92">
 <PARAM NAME = "label3" VALUE = "93"> 
 <PARAM NAME = "label4" VALUE = "94"> 
</APPLET> 
</HTML>*/