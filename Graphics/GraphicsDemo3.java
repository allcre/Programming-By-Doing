import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo3 extends Canvas
{
    public void paint( Graphics g )
    {
        // lines
        g.setColor(Color.green);
        g.drawLine(10,100,400,100);
        // 1st and 2nd: coordinates of the start of the line; 3rd and 4th: coordinates of the end of the line
        g.setColor(Color.red);
        g.drawLine(20, 110, 20, 90);
        g.drawLine(180, 270, 210, 310);
        g.setColor(Color.blue);
        g.drawLine(50,150,100,180);
        g.setColor(Color.magenta);
        g.drawLine(100,350,300,230);

        // shapes
        g.fillRect(0, 0, 100, 100);
        // starting point is top left corner

        g.setColor(Color.black);

        // fonts
        g.drawString("Graphics are pretty neat.", 500, 100);
        g.setFont(new Font("Consolas", Font.PLAIN, 36)); // 36-pt plain
        g.drawString("Yes, they are.", 400, 200);

        g.setColor(Color.white);
        g.setFont(new Font("Dialog", Font.ITALIC, 60)); // 60-pt italic bold
        g.drawString("Leander Lions", 300, 350);

        g.setColor(Color.blue);
        g.setFont(Font.decode("Dialog-ITALIC-60")); // a different way to specify the same font
        g.drawString("Leander Lions", 290, 360);

        g.setColor(Color.black);
        g.setFont(new Font(null)); // restore default font

        int x=400, y=490;
        g.drawRect(x,y,150,20);
        g.drawString("Where is the starting point?", x,y);
        g.setColor(Color.red);
        g.drawLine(x,y,x,y);	// drawing a line from a point to itself makes a 1px-by-1px dot

    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo3 canvas = new GraphicsDemo3();
        win.add( canvas );
        win.setVisible(true);
    }
}
