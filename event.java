import java.awt.*;
import java.awt.event.*;

class a extends Frame implements ActionListerner 
{
Frame f= new Frame("NEw");
Button b= new Button("OK");

a()
{
setVisible(true);
setSize(400,400);
add(b);
b.addActionListerner(this);
}

public void actionPerformed(ActionEvent e)
{
System.out.print("Hello");

}
public static void main(String a[])
{
a();
}
}
