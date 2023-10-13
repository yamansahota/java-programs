import java.awt.*;
import java.awt.event.*;

public class EventHand extends Frame implements ActionListener{

    Button b1=new Button("Click Me");

    EventHand()
    {
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(200, 200);
        add(b1);
        b1.addActionListener(this);
    }
    @Override public void actionPerformed (ActionEvent e) 
    {
        System.out.println("Hello Friends ");
        // setBackground(Color .red);

    }

    public static void main(String[] args) {
        new EventHand();
    }
}