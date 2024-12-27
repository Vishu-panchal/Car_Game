

import java.awt.*;

import javax.swing.*;

public class Example extends JFrame{
    Example()
    {
        setSize(900,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        Panel panel = new Panel(600,900);
        

        // panel.setBackground(new Color(29,31,29));
        panel.setBackground(Color.BLACK);


        // JLabel label = new JLabel();
        // label.setBounds(0, 0, 200, 20);
        // add(label);
        add(panel);
    }
    public static void main(String[] args) {
        new Example().setVisible(true);
    }
}
