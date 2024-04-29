package Week1;
import javax.swing.*;

public class EntryBoxExample {
    public static void main(String[] args) {
    // Create a JFrame
    JFrame frame = new JFrame("project");

    // Create a JTextField
    JTextField textField = new JTextField();
    textField.setBounds(50, 50, 150, 30);

    // Add the text field to the frame
    frame.add(textField);

    //Set frame size and properties
    frame.setSize(300, 200);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
}
