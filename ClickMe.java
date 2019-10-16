import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ClickMe extends JFrame implements ActionListener{
    JButton clickMeJButton;
    
    public ClickMe(){
        super("My First GUI Java Program");
        setLayout(null);
        clickMeJButton = new JButton("CLICK ME");
        clickMeJButton.setBounds(0, 0, 200, 200);
        add(clickMeJButton);
        clickMeJButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== clickMeJButton)
            JOptionPane.showMessageDialog(rootPane, "Hey you clicked me!", "Details", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
