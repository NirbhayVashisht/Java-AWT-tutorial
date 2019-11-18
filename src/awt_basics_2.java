//following is an example done By creating the object of Frame class (association)

import java.awt.*;

public class awt_basics_2 {
    awt_basics_2(){
        Frame f = new Frame("title of the frame");
        Button b =new Button("Click Me");
        b.setBounds(100,150,80, 30);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.add(b);
    }
    public static void main(String[] args) {
        awt_basics_2 obj = new awt_basics_2();
    }
}
