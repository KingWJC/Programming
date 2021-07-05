package observer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Java中awt,按钮的监听事件.
 */
public class V4 {
    public static void main(String[] args) {
        new MyFrame().launch();
    }
}

class MyFrame extends Frame {
    public void launch() {
        Button b = new Button("press me!");
        b.setSize(20,20);
        b.setVisible(true);
        b.addActionListener(new MyActionListener1());
        b.addActionListener(new MyActionListener2());

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setLocation(400, 400);
        this.setSize(200,200);
        this.setVisible(true);
    }

    private class MyActionListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ((Button) e.getSource()).setLabel("press me again!");
            System.out.println("button pressed first!");
        }
    }

    private class MyActionListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed second!");
        }
    }
}