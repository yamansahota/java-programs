import java.awt.*;

public class awtcal3 {
    public static void main(String[] args) {
        Frame f1 = new Frame("Calculator");
        TextField t1 = new TextField(null, 0);
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");
        Button ba = new Button("+");
        Button bb = new Button("-");
        Button bc = new Button("*");
        Button bd = new Button("/");
        Button be = new Button("=");
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setSize(320, 230);
        f1.setBackground(Color.CYAN);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(b9);
        f1.add(b0);
        f1.add(ba);
        f1.add(bb);
        f1.add(bc);
        f1.add(bd);
        f1.add(be);
        b1.setBounds(10, 80, 50, 30);
        b2.setBounds(10, 120, 50, 30);
        b3.setBounds(10, 160, 50, 30);
        b4.setBounds(70, 80, 50, 30);
        b5.setBounds(70, 120, 50, 30);
        b6.setBounds(70, 160, 50, 30);
        b7.setBounds(130, 80, 50, 30);
        b8.setBounds(130, 120, 50, 30);
        b9.setBounds(130, 160, 50, 30);
        b0.setBounds(190, 80, 50, 30);
        ba.setBounds(190, 120, 50, 30);
        bb.setBounds(190, 160, 50, 30);
        bc.setBounds(250, 80, 50, 30);
        bd.setBounds(250, 120, 50, 30);
        be.setBounds(250, 160, 50, 30);
        f1.add(t1);
        t1.setBounds(10, 40, 300, 30);

    }
}