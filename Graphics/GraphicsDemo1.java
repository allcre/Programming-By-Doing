import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.green);
        g.drawRect(50,20,100,200);  // draw a rectangle
        // 1st: x-position; 2nd: y-position; 3rd: width; 4th: height
        g.fillOval(25,20,100,200); // draw a filled-in oval
        // same as rectangle
        // the shapes are drawn over each other in the order of the code
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);

        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        // 1st: x-position; 2nd: y-position
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);

        g.setColor(Color.red);
        g.fillRect(700, 500, 50, 50);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        // 800 x 600 pixels window size
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
}
