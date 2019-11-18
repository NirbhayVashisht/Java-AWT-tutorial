//following is an example of java event handling by outer class


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class outer implements ActionListener {
    event_handling_2 obj;
    outer(event_handling_2 obj){
        this.obj = obj;
    }

    public void actionPerformed(ActionEvent e){
        obj.tf.setText("Welcome");
    }
}
public class event_handling_2 extends Frame {
    TextField tf;
    Button b;
    event_handling_2(){
        tf = new TextField("Click Button");
        tf.setBounds(60, 50, 170, 20);

        b = new Button("Click Me");
        b.setBounds(100,120,80,30);

        outer o = new outer(this);
        b.addActionListener(o);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
        add(b); add(tf);
    }
    public static void main(String[] args) {
        new event_handling_2();
    }
}
