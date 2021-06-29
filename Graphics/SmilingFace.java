import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas
{
  public void paint (Graphics g)
  {
    g.setColor(Color.yellow);
    g.fillOval(300, 200, 200, 200);

    g.setColor(Color.blue);
    g.fillOval(340, 250, 50, 50);
    g.fillOval(410, 250, 50, 50);

    g.setColor(Color.red);
    g.drawArc(325, 225, 150, 150, 225, 90);

    // labels
    g.setColor(Color.black);
    g.setFont(new Font(null));
    for ( int X=0; X<800; X += 50 )
        g.drawString( String.valueOf(X), X, 50 );
    for ( int Y=100; Y<600; Y += 50 )
        g.drawString( String.valueOf(Y), 28, Y );
    // lines
    g.setColor(Color.lightGray);
    for ( int X=0; X<800; X += 50 )
        g.drawLine(X,0,X,599);    // horizontal
    for ( int Y=0; Y<600; Y += 50 )
        g.drawLine(0,Y,799,Y);    // vertical
  }

  public static void main (String args[])
  {
    JFrame win = new JFrame("Smiling Face");
    win.setSize(800,600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    SmilingFace canvas = new SmilingFace();
    win.add(canvas);
    win.setVisible(true);
  }
}
