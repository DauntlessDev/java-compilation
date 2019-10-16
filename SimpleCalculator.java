
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SimpleCalculator extends JFrame implements ActionListener{
    
    JLabel firstValueLabel;
    JLabel secondValueLabel;
    JLabel resultLabel;
    
    JTextField firstValueTextField;
    JTextField secondValueTextField;
    JTextField resultTextField;
    
    JButton addButton;
    JButton subButton;
    JButton mulButton;
    JButton divButton;
    JButton resetButton;
    
    public SimpleCalculator(){
        super("My SImple Calculator");
        setLayout(new GridLayout(6,2));
        
        firstValueLabel = new JLabel("First Value:");
        secondValueLabel = new JLabel("Second Value:");
        resultLabel = new JLabel("Result:");
        
        firstValueTextField = new JTextField();
        secondValueTextField = new JTextField();
        resultTextField = new JTextField();
        
        addButton = new JButton("ADD");
        subButton = new JButton("SUB");
        mulButton = new JButton("MUL");
        divButton = new JButton("DIV");
        resetButton = new JButton("RESET");
        
        add(firstValueLabel);
        add(firstValueTextField);
        add(secondValueLabel);
        add(secondValueTextField);
        add(resultLabel);
        add(resultTextField);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(resetButton);
        
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        int value1 = Integer.parseInt(firstValueTextField.getText());
        int value2 = Integer.parseInt(secondValueTextField.getText());
        Integer result=0;
        if(e.getSource()==addButton)
            result = value1+value2;
        else if(e.getSource()==subButton)
            result = value1-value2;
        else if(e.getSource()==mulButton)
            result = value1*value2;
        else if(e.getSource()==divButton)
            result = value1/value2;
        else if(e.getSource()==resetButton)
            result = 0;
        resultTextField.setText(""+result);
    }
    
}
