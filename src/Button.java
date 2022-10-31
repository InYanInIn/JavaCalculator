import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Button extends JButton {
    Button(String text, ActionListener e){

        Font myFont = new Font("Serif",Font.BOLD, 25);
        this.addActionListener(e);
        this.setText(text);
        this.setFocusable(false);
        this.setFont(myFont);
    }
}
