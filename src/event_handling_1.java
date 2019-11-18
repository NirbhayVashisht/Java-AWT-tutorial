/*                          Event and Listener (Java Event Handling)

- Changing the state of an object is known as an event.For example, click on button, dragging mouse etc.
- The java.awt.event package provides many event classes and Listener interfaces for event handling.

*/

/*                          Java Event classes and Listener interfaces

 Event Classes	                    Listener Interfaces

- ActionEvent	                    ActionListener
- MouseEvent	                    MouseListener and MouseMotionListener
- MouseWheelEvent	                MouseWheelListener
- KeyEvent	                        KeyListener
- ItemEvent	                        ItemListener
- TextEvent	                        TextListener
- AdjustmentEvent	                AdjustmentListener
- WindowEvent	                    WindowListener
- ComponentEvent	                ComponentListener
- ContainerEvent	                ContainerListener
- FocusEvent	                    FocusListener
*/

/*                              Steps to perform Event Handling

Following steps are required to perform event handling:
- Register the component with the Listener
- Registration Methods


For registering the component with the Listener, many classes provide the registration methods. For example:

* Button
public void addActionListener(ActionListener a){}

* MenuItem
public void addActionListener(ActionListener a){}

* TextField
public void addActionListener(ActionListener a){}
public void addTextListener(TextListener a){}

* TextArea
public void addTextListener(TextListener a){}

* Checkbox
public void addItemListener(ItemListener a){}

* Choice
public void addItemListener(ItemListener a){}

* List
public void addActionListener(ActionListener a){}
public void addItemListener(ItemListener a){}
*/

/*                      Java Event Handling Code
We can put the event handling code into one of the following places:
- Within class
- Other class
- Anonymous class
*/

//The following example is showing java events handling by implementing ActionListner

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class event_handling_1 extends Frame implements ActionListener {
    TextField tf;
    Button b;

    event_handling_1() {
        tf = new TextField("Click Button");
        tf.setBounds(60, 50, 170, 20);

        b = new Button("Click Me");
        b.setBounds(100,120,80,30);

        //register listener
        b.addActionListener(this); //passing current instance

        //add components and set layout and visibility
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        add(b); add(tf);

    }

    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        new event_handling_1();
    }

}
