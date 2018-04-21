package layouts.boxlayout;

import javax.swing.*;
import java.awt.*;

public class Resizing extends JFrame {

    public Resizing() throws HeadlessException {
        super("Teste de resize");
        JPanel jPanel = new JPanel();
        getContentPane().add(jPanel);
        getContentPane().setBackground(Color.BLUE);
        jPanel.setBackground(Color.YELLOW);
        jPanel.setPreferredSize(new Dimension(50,50));

        pack();
    }
}
