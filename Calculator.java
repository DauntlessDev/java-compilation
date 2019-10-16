import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Calculator extends JFrame implements ActionListener{
    JLabel firstLabel;
    JLabel secondLabel;
    JLabel resultLabel;
    
    JTextField firstTextField;
    JTextField secondTextField;
    JTextField resultTextField;
    
    JButton addButton;
    JButton subButton;
    JButton mulButton;
    JButton divButton;
    JButton resetButton;
    JButton exitButton;
    
    public Calculator(){
        super("My First GUi Java Program");
        setLayout(new GridLayout(7,2));
        
        firstLabel = new JLabel("First Value: ");
        secondLabel = new JLabel("Second Value: ");
        resultLabel = new JLabel("Result: ");
        
        firstTextField = new JTextField();
        secondTextField = new JTextField();
        resultTextField = new JTextField();
        
        addButton = new JButton("ADD");
        subButton = new JButton("SUB");
        mulButton = new JButton("MUL");
        divButton = new JButton("DIV");
        resetButton = new JButton("RESET");
        exitButton = new JButton("EXIT");
        
        add(firstLabel);
        add(firstTextField);
        add(secondLabel);
        add(secondTextField);
        add(resultLabel);
        add(resultTextField);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(resetButton);
        add(exitButton);

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        resetButton.addActionListener(this);
        exitButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==exitButton){
            int response = JOptionPane.showConfirmDialog(rootPane, 
                    "Do you want to exit the program?",
                    "Just Asking", 
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
                             
            if(response == 0)
                this.dispose();                            
        }
        else{
            
        int value1 = Integer.parseInt(firstTextField.getText());
        int value2 = Integer.parseInt(secondTextField.getText());
        
        if(e.getSource()==addButton)
            resultTextField.setText(""+(value1+value2));
        else if(e.getSource()==subButton)
            resultTextField.setText(""+(value1-value2));
        else if(e.getSource()==mulButton)
            resultTextField.setText(""+(value1*value2));
        else if(e.getSource()==divButton)
            resultTextField.setText(""+(value1/value2));
        else if(e.getSource()==resetButton){
            firstTextField.setText("");
            secondTextField.setText("");
            resultTextField.setText("");
        }
       }
    }
}
