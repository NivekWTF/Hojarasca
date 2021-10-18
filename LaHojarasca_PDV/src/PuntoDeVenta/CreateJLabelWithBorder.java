package PuntoDeVenta;
 
import java.awt.Color;
import java.awt.FlowLayout;
 
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
 
public class CreateJLabelWithBorder extends JFrame {
 
    private static final long serialVersionUID = 1L;
 
    public CreateJLabelWithBorder() {
 
        // set flow layout for the frame
        this.getContentPane().setLayout(new FlowLayout());
 
        JLabel label = new JLabel("Java Code Geeks - Java Examples");
 
        // create a line border with the specified color and width
        Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
 
        // set the border of this component
        label.setBorder(border);
 
        // add textfield to frame
        add(label);
 
    }
 
    private static void createAndShowGUI() {
 
  //Create and set up the window.
 
  JFrame frame = new CreateJLabelWithBorder();
 
  //Display the window.
 
  frame.pack();
 
  frame.setVisible(true);
 
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
 
    public static void main(String[] args) {
 
  //Schedule a job for the event-dispatching thread:
 
  //creating and showing this application's GUI.
 
  javax.swing.SwingUtilities.invokeLater(new Runnable() {
 
public void run() {
 
    createAndShowGUI(); 
 
}
 
  });
    }
 
}