import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class windowListener extends Frame {
    public static void main(String[] args) {
        windowListener listener = new windowListener();
        listener.setTitle("Click to Close");
        listener.setSize(400,500);
        listener.setVisible(true);
        listener.addWindowListener(new newClass());
    }
}
class newClass implements WindowListener
{
    @Override
    public void windowActivated(WindowEvent e) {   }

    @Override
    public void windowClosed(WindowEvent e) {   }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {    }

    @Override
    public void windowDeiconified(WindowEvent e) {    }

    @Override
    public void windowIconified(WindowEvent e) {    }

    @Override
    public void windowOpened(WindowEvent e) {    }
}
