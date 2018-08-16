import java.awt.Color;
	import java.applet.Applet;
	import java.awt.Graphics;
	
	//drawing a rectangle and filling it with purple color 
	public class line extends Applet{
	 
		public void paint(Graphics g){
			Color PURPLE = new Color(255,0,255);
			
			/*
			 * to draw line in an applet window use,
			 * void drawLine(int x1,int y1, int x2, int y2)
			 * method.
			 * 
			 * This method draws a line between (x1,y1) and (x2,y2)
			 * coordinates in a current color.
			 */
			
		
			g.setColor(PURPLE);
			g.fillRect( 100,100, 100, 100 );
		   
			
		}
