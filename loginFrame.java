import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class loginFrame extends Frame  {
    loginFrame()
    {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }});

       Label Lname,Lpassword;
       TextField TFname,TFpassword;
       Button submit;
       Lname = new Label("Username", (int) LEFT_ALIGNMENT);
       Lpassword = new Label("Password", (int) LEFT_ALIGNMENT);
       submit = new Button("Login");
       TFname = new TextField(15);
       TFpassword = new TextField(15);
       add(Lname);
       add(TFname);
       add(Lpassword);
       add(TFpassword);
       add(submit);
    }

    public static void main(String[] args) {
        loginFrame loginScreen = new loginFrame();
        loginScreen.setSize(400,400);
        loginScreen.setVisible(true);
        loginScreen.setLayout(new FlowLayout());
    }
}
