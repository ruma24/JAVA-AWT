import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;

    

    g2d.setColor(Color.red);
    g2d.fillRect(250, 195, 500, 60);
    g2d.setColor(Color.blue);
    g2d.fillRect(250, 255, 500, 60);
    g2d.setColor(Color.green);
    g2d.fillRect(250, 315, 500, 60);




  }

  public static void main(String[] args) {
    Test rects = new Test();
    JFrame frame = new JFrame("Rectangles");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(rects);
    frame.setSize(360, 300);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
