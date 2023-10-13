import java.awt.*;

public class awt2 {
    public static void main(String[] args) {
        TextField t1 = new TextField();
        Frame f1 = new Frame("Layout");
        Button b1 = new Button("Increment");
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setSize(500, 500);
        f1.add(t1);
        t1.setBounds(150, 50, 200, 30);
        f1.add(b1);
        b1.setBounds(220, 100, 70, 30);
    }
}
