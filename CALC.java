package javax.swing;


import java.awt.BorderLayout;
import static java.awt.Color.white;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;



public class CALC extends JFrame{

    double te; 
	public static void main(String[] args) {
		CALC frame = new CALC();
		frame.setVisible(true);
	}
    JPanel firstPanel = new JPanel();
    JPanel secondPanel = new JPanel();
    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    JButton mult = new JButton("*");
    JButton div = new JButton("/");
    JButton dot = new JButton(".");
    JButton equalsign = new JButton("=");
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton clr = new JButton("c");
    JTextField resultTextField = new JTextField(15);
    
    double temp, solvetemp;
    
    Boolean boolAddition = false;
    Boolean boolSubtract = false;
    Boolean boolDivide = false;
    Boolean boolMul = false;
    
    String display = "";
    String s0,s1,s2,s3;
    
    public CALC(){
        super("Calculator");
        setVisible(true);
        setSize(245,260);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstPanel.setBackground(Color.GRAY);
        
        firstPanel.setLayout(new FlowLayout());
        secondPanel.setBackground(Color.GRAY);
        secondPanel.setLayout(null);
       
        resultTextField.setEditable(false);
        resultTextField.setHorizontalAlignment(JTextField.RIGHT);
        resultTextField.setBackground(white);
        seven.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        seven.setBounds(15,10,50,40);
        eight.setFont(new Font("Tahoma", Font.BOLD, 13));
        eight.setBounds(65,10,50,40);
        nine.setFont(new Font("Tahoma", Font.BOLD, 13));
        nine.setBounds(115,10,50,40);
        add.setBackground(SystemColor.inactiveCaption);
        add.setBounds(165, 10, 50, 40);
        four.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        four.setBounds(15,50,50,40);
        five.setFont(new Font("Tahoma", Font.BOLD, 13));
        five.setBounds(65,50,50,40);
        six.setFont(new Font("Tahoma", Font.BOLD, 13));
        six.setBounds(115,50,50,40);
        sub.setBackground(SystemColor.inactiveCaption);
        sub.setBounds(165, 50, 50, 40);
        one.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        one.setBounds(15,90,50,40);
        two.setFont(new Font("Tahoma", Font.BOLD, 13));
        two.setBounds(65,90,50,40);
        three.setFont(new Font("Tahoma", Font.BOLD, 13));
        three.setBounds(115,90,50,40);
        mult.setBackground(SystemColor.inactiveCaption);
        mult.setBounds(165, 90, 50, 40);
        zero.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        zero.setBounds(15,130,50,40);
        dot.setBounds(65,130,50,40);
        equalsign.setFont(new Font("Tahoma", Font.BOLD, 13));
        equalsign.setForeground(Color.BLACK);
        equalsign.setBackground(SystemColor.desktop);
        equalsign.setBounds(115,130,50,40);
        div.setBackground(SystemColor.inactiveCaption);
        div.setBounds(165, 130, 50, 40);
        
        firstPanel.add(resultTextField);
        clr.setBackground(SystemColor.info);
        clr.setFont(new Font("Tahoma", Font.BOLD, 13));
        firstPanel.add(clr);
        
        secondPanel.add(seven);
        secondPanel.add(eight);
        secondPanel.add(nine);
        secondPanel.add(add);
        
        secondPanel.add(four);
        secondPanel.add(five);
        secondPanel.add(six);
        secondPanel.add(sub);
        
        secondPanel.add(one);
        secondPanel.add(two);
        secondPanel.add(three);
        secondPanel.add(mult);
        
        secondPanel.add(zero);
        secondPanel.add(dot);
        secondPanel.add(equalsign);
        secondPanel.add(div);
        
        getContentPane().add(firstPanel, BorderLayout.NORTH);
        getContentPane().add(secondPanel, BorderLayout.CENTER);
        
        ButtonListener bl = new ButtonListener();
        
        clr.addActionListener(bl);
        add.addActionListener(bl);
        sub.addActionListener(bl);
        mult.addActionListener(bl);
        div.addActionListener(bl);
        dot.addActionListener(bl);
        equalsign.addActionListener(bl);
        zero.addActionListener(bl);
        one.addActionListener(bl);
        two.addActionListener(bl);
        three.addActionListener(bl);
        four.addActionListener(bl);
        five.addActionListener(bl);
        six.addActionListener(bl);
        seven.addActionListener(bl);
        eight.addActionListener(bl);
        nine.addActionListener(bl);
        
        s0 = s1 = s2 = ""; 
    }
    
    
     private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                String s = e.getActionCommand(); 

                // if the value is a number 
                if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
                    // if operand is present then add to second no 
                    if (!s1.equals("")) 
                        s2 = s2 + s; 
                    else
                        s0 = s0 + s; 

                    // set the value of text 
                    resultTextField.setText(s0 + s1 + s2); 
                } 
                else if (s.charAt(0) == 'c') { 
                    // clear the one letter 
                    s0 = s1 = s2 = ""; 

                    // set the value of text 
                    resultTextField.setText(s0 + s1 + s2); 
                } 
                else if (s.charAt(0) == '=') { 

                    // store the value in 1st 
                    if (s1.equals("+")) 
                        te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
                    else if (s1.equals("-")) 
                        te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
                    else if (s1.equals("/")) 
                        te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
                    else if (s1.equals("*")) 
                        te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 

                    // set the value of text 
                    resultTextField.setText(""+te); 

                    // convert it to string 
                    s0 = Double.toString(te); 

                    s1 = s2 = ""; 
                }
                 
                else { 
                    // if there was no operand 
                    if (s1.equals("") || s2.equals("")) 
                        s1 = s; 
                    // else evaluate 
                    else { 
                        double te; 

                        // store the value in 1st 
                        if (s1.equals("+")) 
                            te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
                        else if (s1.equals("-")) 
                            te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
                        else if (s1.equals("/")) 
                            te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
                        else
                            te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 

                        // convert it to string 
                        s0 = Double.toString(te); 

                        // place the operator 
                        s1 = s; 

                        // make the operand blank 
                        s2 = ""; 
                    } 

                    // set the value of text 
                    resultTextField.setText(s0 + s1 + s2); 
                    } 
                }catch(IllegalAccessError iae){
                    JOptionPane.showMessageDialog(rootPane, "Invalid Operation", "Error", JOptionPane.ERROR_MESSAGE);
                }
            catch(NumberFormatException nm){
                JOptionPane.showMessageDialog(rootPane, "Invalid Operation", "Error", JOptionPane.ERROR_MESSAGE);
            }
         }
     }
  



}
