//NOTE : This was tutorial was made with the help from javatpoint.com

/*                                       Java AWT Tutorial

- Java AWT (Abstract Window Toolkit) is an API to develop GUI or window-based applications in java.
- Java AWT components are platform-dependent i.e. components are displayed according to the view of operating system.
- AWT is heavyweight i.e. its components are using the resources of OS.
- The java.awt package provides classes for AWT api such as TextField, Label, TextArea, RadioButton,
  CheckBox, Choice, List etc.

* Container
- The Container is a component in AWT that can contain another components like buttons, textfields, labels etc.
- The classes that extends Container class are known as container such as Frame, Dialog and Panel.

* Window
- The window is the container that have no borders and menu bars.
- You must use frame, dialog or another window for creating a window.

* Panel
- The Panel is the container that doesn't contain title bar and menu bars.
- It can have other components like button, textfield etc.

* Frame
- The Frame is the container that contain title bar and can have menu bars.
- It can have other components like button, textfield etc.
*/

/*                        Useful Methods of Component class

Method                                                          	Description
public void add(Component c)	                inserts a component on this component.
public void setSize(int width,int height)	    sets the size (width and height) of the component.
public void setLayout(LayoutManager m)	        defines the layout manager for the component.
public void setVisible(boolean status)	        changes the visibility of the component, by default false.*/

/*To create simple awt example, you need a frame.
There are two ways to create a frame in AWT.
- By extending Frame class (inheritance)
- By creating the object of Frame class (association)*/



// Following is an example by inheriting Frame class

import java.awt.*;

public class awt_basics_1 extends Frame {
    awt_basics_1(){
        Button b = new Button("Click ME"); //creating a button
        b.setBounds(30,100,80, 30); //x,y,w,h

        setSize(300,300); //w,h
        setLayout(null);  //set Layout Manager to null
        setVisible(true);  // set visibility to true , by default it is false
        add(b);
    }
    public static void main(String[] args) {
        awt_basics_1 first = new awt_basics_1();
    }
}
