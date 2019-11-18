//following example shows java events handling by anonymous class

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class event_handling_3 extends Frame {
    TextField tf;
    Button b;

    event_handling_3(){
        tf = new TextField("Click Button");
        tf.setBounds(60, 50, 170, 20);

        b = new Button("Click Me");
        b.setBounds(100,120,80,30);

        b.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                    tf.setText("Welcome");
               }
        });

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        add(b); add(tf);

    }

    public static void main(String[] args) {
        new event_handling_3();
    }
}
