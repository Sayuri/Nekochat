import javax.swing.*;
import java.awt.*;

public class LittleApp extends JFrame{
    private JLabel label = new JLabel("neko-neko nya-nya");

    public LittleApp() {
        super("Little app");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
    }
}