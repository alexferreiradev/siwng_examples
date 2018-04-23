package layouts.boxlayout;

import javax.swing.*;
import java.awt.*;

public class Resizing extends JFrame {

    public static final int M_W = 50;
    public static final int M_H = 50;
    public static final int P_W = 70;
    public static final int P_H = 40;
    public static final int MAX_W = 100;
    public static final int MAX_H = 100;

    public Resizing() throws HeadlessException {
        super("Teste de resize");

//        getContentPane().setLayout(new BorderLayout(0,0));
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
//        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        getContentPane().setPreferredSize(new Dimension(1000,700));

        JPanel flowTestJp = new JPanel();
        JPanel boxTestJp = new JPanel();
        setPanelConfig(flowTestJp, Color.BLUE, new FlowLayout(FlowLayout.LEFT), M_W, M_H, P_W, P_H, MAX_W, MAX_H);
        setPanelConfig(boxTestJp, Color.BLUE, new BoxLayout(boxTestJp, BoxLayout.PAGE_AXIS), M_W, M_H, P_W, P_H, MAX_W, MAX_H);

        addTestComponents(flowTestJp);
        addTestComponents(boxTestJp);

        getContentPane().add(flowTestJp);
        getContentPane().add(boxTestJp);

        pack();
    }

    private void addTestComponents(JPanel layoutPanelTesting) {
        JPanel flowJp = new JPanel();
        JPanel boxJp = new JPanel();
        JPanel borderJp = new JPanel();

        setPanelConfig(flowJp, Color.YELLOW, new FlowLayout(FlowLayout.LEFT), M_W, M_H, P_W, P_H, MAX_W, MAX_H);
        setPanelConfig(boxJp, Color.GREEN, new BoxLayout(boxJp, BoxLayout.PAGE_AXIS), M_W, M_H, P_W, P_H, MAX_W, MAX_H);
        setPanelConfig(borderJp, Color.RED, new BorderLayout(0,0), M_W, M_H, P_W, P_H, MAX_W, MAX_H);

        layoutPanelTesting.add(flowJp);
        layoutPanelTesting.add(boxJp);
        layoutPanelTesting.add(borderJp);
    }

    private void setPanelConfig(JComponent component, Color color, LayoutManager layoutManager, int mW, int mH, int pW, int pH, int maxW, int maxH) {
        component.setBackground(color);
        component.setLayout(layoutManager);
        component.setMinimumSize(new Dimension(mW, mH));
        component.setPreferredSize(new Dimension(pW, pH));
        component.setMaximumSize(new Dimension(maxW, maxH));
    }
}
