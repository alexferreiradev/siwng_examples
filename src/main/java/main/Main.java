package main;

import layouts.boxlayout.Resizing;

import javax.swing.*;

public class Main {

    public static void main(String []vars) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Resizing resizing = new Resizing();
                resizing.setVisible(true);
            }
        });
    }
}
