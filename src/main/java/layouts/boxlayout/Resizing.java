package layouts.boxlayout;

import javax.swing.*;
import java.awt.*;

public class Resizing extends JFrame {

    public static final int M_W = 50;
    public static final int M_H = 5;
    public static final int P_W = 50;
    public static final int P_H = 50;
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
        JPanel borderTestJp = new JPanel();

        int maxH = 50;
        int mH = 50;
        int pH = 50;
        setPanelConfig(flowTestJp, Color.BLUE, new FlowLayout(FlowLayout.LEFT), mH, mH, pH, pH, maxH, maxH);
        setPanelConfig(borderTestJp, Color.BLACK, new BorderLayout(0,0), 50, 400, pH, pH, 500, 500);
        setPanelConfig(boxTestJp, Color.CYAN, new BoxLayout(boxTestJp, BoxLayout.LINE_AXIS), 5, 5, pH, pH, 100, 100);

        addTestComponents(flowTestJp);
        addTestComponents(borderTestJp);
        Component component0 = borderTestJp.getComponent(0);
        Component component1 = borderTestJp.getComponent(1);
        Component component2 = borderTestJp.getComponent(2);
        borderTestJp.remove(component0);
        borderTestJp.remove(component1);
        borderTestJp.remove(component2);
        borderTestJp.add(component0, BorderLayout.NORTH);
        borderTestJp.add(component1, BorderLayout.CENTER);
        borderTestJp.add(component2, BorderLayout.EAST);
        addTestComponents(boxTestJp);

        getContentPane().add(flowTestJp);
        getContentPane().add(borderTestJp);
        getContentPane().add(boxTestJp);

        pack();
    }

    private void addTestComponents(JPanel layoutPanelTesting) {
        JPanel flowJp = new JPanel();
        JPanel boxJp = new JPanel();
        JPanel borderJp = new JPanel();

        setPanelConfig(flowJp, Color.YELLOW, new FlowLayout(FlowLayout.LEFT), M_W, M_H, 50, 100, 100, 100);
        setPanelConfig(boxJp, Color.GREEN, new BoxLayout(boxJp, BoxLayout.PAGE_AXIS), 50, 100, 500, 100, 500, 200);
        setPanelConfig(borderJp, Color.RED, new BorderLayout(0,0), 50, M_H, 50, P_H, 500, 100);

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
