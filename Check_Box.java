import java.awt.*;

public class Check_Box {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Checkbox checkBox = new Checkbox("Java Checkbox");
        Choice choice = new Choice();
        choice.setBounds(100,100,75,75);
        choice.add("Apple");
        choice.add("Banana");
        choice.add("Grape");
        choice.add("Mango");
        frame.add(choice);
        frame.add(choice);
        frame.setLayout(new FlowLayout());
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
