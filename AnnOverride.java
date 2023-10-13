import java.awt.*;
import java.awt.event.*;

class AnnOverride extends Frame {
    Button b1 = new Button("Ok");
    Button b2 = new Button("Cancel");

    AnnOverride() {
        setVisible(true);
        add(b1);
        add(b2);
        setLayout(new FlowLayout());
        b1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getClickCount());
            }
        });
    }

    public static void main(String[] args) {
        new AnnOverride();
    }

}