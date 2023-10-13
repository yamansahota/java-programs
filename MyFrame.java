import java.awt.*;

public class MyFrame extends Frame {

    public MyFrame() {
        setTitle("My Frame");
        setSize(300, 300);
        setLayout(new FlowLayout());

        Button button = new Button("Button 1");
        // button.setSize(100, 50);
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}