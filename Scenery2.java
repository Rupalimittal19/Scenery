import java.awt.*;
import java.applet.*;

public class Scenery2 extends Applet implements Runnable {
   String str = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ";
   Thread t ;
    
   public void start() {
      t = new Thread(this);
     
      t.start();
   }
   public void run () {
      char ch;
      for( ; ; ) {
      try {
         repaint();
         Thread.sleep(250);
         ch = str.charAt(0);       
         str = str.substring(1, str.length()); 
         str = str + ch; 
      }
      catch(InterruptedException e) {}
      }
   }
    
	public void paint(Graphics g)
	{
//Sky blue color
	g.setColor(new Color(135,177,250));
	g.fillRect(40, 40, 400, 17);
	g.setColor(new Color(135,187,250));
	g.fillRect(40, 50, 400, 17);
	g.setColor(new Color(135,196,250));
	g.fillRect(40, 60, 400, 17);
	g.setColor(new Color(135,206,250));
	g.fillRect(40, 70, 400, 17);
	g.setColor(new Color(135,216,250));
	g.fillRect(40, 80, 400, 17);
	g.setColor(new Color(135,226,250));
	g.fillRect(40, 90, 400, 17);
	g.setColor(new Color(135,236,250));
	g.fillRect(40, 100, 400, 17);
	g.setColor(new Color(135,246,250));
	g.fillRect(40, 110, 400, 17);
	g.setColor(new Color(234,255,245));
	g.fillRect(40, 115, 400, 17);
	g.setColor(new Color(232,255,255));
	g.fillRect(40, 120, 400, 17);
//Sky yellow color
	g.setColor(new Color(255,254,240));
	g.fillRect(40, 125, 400, 17);
	g.setColor(new Color(255,250,233));
	g.fillRect(40, 130, 400, 17);
	g.setColor(new Color(255,244,208));
	g.fillRect(40, 140, 400,17);
	g.setColor(new Color(255,239,183));
	g.fillRect(40, 150, 400, 17);
	g.setColor(new Color(255,233,157));
	g.fillRect(40, 160, 400, 17);
	g.setColor(new Color(255,227,132));
	g.fillRect(40, 170, 400, 17);
	g.setColor(new Color(255,222,106));
	g.fillRect(40, 180, 400, 17);
	g.setColor(new Color(255,216,81));
	g.fillRect(40, 190, 400, 17);
	g.setColor(new Color(255,198,0));
	g.fillRect(40, 200, 400, 17);

//sun rays	
	g.setColor(new Color(255,255,255));
	g.drawLine(230,210, 3900,1);
	g.drawLine(230,210, 1400, 1);
	g.drawLine(230,210,880, 1);
	g.drawLine(230,210, 640, 1);
	g.drawLine(230,210,460, 1);
	g.drawLine(230,210, 400, 1);
	g.drawLine(230,210, 340, 1);
	g.drawLine(230,210,260,1);
	g.drawLine(230,210, 200, 1);
	g.drawLine(230,210, 140, 1);
	g.drawLine(230,210,80, 1);
	g.drawLine(230,210, 20, 1);
	g.drawLine(230,210, -80, 1);
	g.drawLine(230,210,-160, 1);
	g.drawLine(230,210, -260, 1);
	g.drawLine(230,210, -460, 1);
	g.drawLine(230,210,-760, 1);
	g.drawLine(230,210, -1460, 1);
//sun and white line
	g.setColor(new Color(255,254,240));
	g.fillOval(200, 165, 70, 70);
	g.fillRect(40, 210, 400,1);
	g.fillRect(180, 215, 185,1);
	g.fillRect(180, 213, 6,1);
	g.fillRect(203, 213, 4,1);
	g.fillRect(216, 213, 4,1);
//sea
	g.setColor(new Color(0,51,72));
	g.fillRect(40, 211, 400,40);
	g.setColor(new Color(0,69,97));
	g.fillRect(40, 251, 400,40);
	g.setColor(new Color(0,87,123));
	g.fillRect(40, 291, 400,30);
	g.setColor(new Color(0,105,123));
	g.fillRect(40, 321, 400,30);
	g.setColor(new Color(0,123,174));
	g.fillRect(40, 351, 400,30);
	g.setColor(new Color(0,141,199));
	g.fillRect(40, 381, 400,30);
	g.setColor(new Color(0,159,225));
	g.fillRect(40, 411, 400,30);
//Sea Animations lines
	g.setColor(new Color(255,254,240));
	 g.drawString(str, 216, 216);
	g.drawString(str, 35, 225);
	 g.drawString(str, 251, 251);
	g.drawString(str, 130, 240);
	 g.drawString(str, 171, 280);
	g.drawString(str, 101, 295);
	g.drawString(str, 30, 304);
	g.drawString(str, 190, 310);
	g.drawString(str, 50, 325);
	g.drawString(str, 250, 340);
	g.drawString(str, 70, 348);
	g.drawString(str, 150, 359);
	g.drawString(str, 250, 388);
	g.drawString(str, 40, 393);
	g.drawString(str, 120, 420);
//Sea lines 
	g.setColor(new Color(0,97,77));
	g.fillRect(180, 215, 40,1);
  	g.fillRect(225, 215, 30,1);
  	g.fillRect(258, 215, 25,1);
	g.fillRect(358, 218, 25,1);
	g.fillRect(200, 220, 40,1); 
	g.fillRect(180, 225, 50,1);
	g.fillRect(253, 225, 30,1);
	g.fillRect(100, 225, 25,1);
	g.fillRect(230, 230, 40,1);	
	g.fillRect(203, 235, 30,1);
	g.fillRect(230, 237, 30,1);
	g.fillRect(216, 240, 30,1);
	g.fillRect(210, 255, 30,1);
	g.fillRect(310, 256, 40,1);
	g.fillRect(290, 257, 35,1);
	g.fillRect(250, 265, 50,1);
	g.fillRect(180, 265, 40,1);
	g.fillRect(350, 265, 30,1);
	
	}
}