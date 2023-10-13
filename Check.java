import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

class Check extends Frame implements KeyListener
{
    TextField t1= new TextField(20);
    Label l1 =new Label();   
    
    public void keyTyped(KeyEvent e)
    {
        char c= e.getKeyChar();
        int ascii= c;
        if(!((ascii>=65 && ascii<=90)||(ascii>=97 && ascii<=122)))
        {
            // JOptionPane.showMessageDialog(t1,"Error"); ------> TO display the pop up message on the screen
                       System.out.println("Invalid Character!");
        }
    }
    public void keyPressed(KeyEvent e)
    {}
    public void keyReleased(KeyEvent e)
    {}

    Check()
    {
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        add(t1);
        t1.addKeyListener(this);
    }

    public static void main(String a[])
    {
        new Check();
    }
}