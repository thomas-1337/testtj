import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Screen extends JFrame {

    private Image backbuffer;

    public Screen(int width, int height) {
        pack();
        setResizable(false);
        setSize(width, height);

        // close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        backbuffer = createImage(width, height);

        setVisible(true);
        repaint();
    }

    public void paint(Graphics g) {
        g.drawImage(backbuffer, 0, 0, this);
    }

    public void clear() {
        backbuffer = createImage(800,600);
        repaint();
    }

    public void circle(int x1, int y1, int radius) {
        Insets in = getInsets();
        backbuffer.getGraphics().setColor(Color.WHITE);
        backbuffer.getGraphics().drawOval(in.left+x1,in.top+y1,radius,radius);
        repaint();
    }

    public void line(int x1, int y1, int x2, int y2) {
        Insets in = getInsets();
        backbuffer.getGraphics().setColor(Color.WHITE);
        backbuffer.getGraphics().drawLine(in.left+x1,in.top+y1,in.left+x2,in.top+y2);
        repaint();
    }
}
