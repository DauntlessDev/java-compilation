import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/*MagicSquare inherits jframe, which is a class and
implements actionlistener which is an interface */
public class MagicSquareGUI extends JFrame implements ActionListener{
    //creating textfields for the input of the users of rows and columns of the table
    JTextField table11TextField;
    JTextField table12TextField;
    JTextField table13TextField;
    JTextField table21TextField;
    JTextField table22TextField;
    JTextField table23TextField;
    JTextField table31TextField;
    JTextField table32TextField;
    JTextField table33TextField;
    //creating buttons for the programs
    JButton checkButton;
    JButton clearButton;
    JButton exitButton;
    //using constructor to automatically do the instructions inside it when objects are made
    public MagicSquareGUI(){
        //super class(Jframe) constructor call to set the name of program
        super("MAGIC SQUARE");
        //set layout dimension
        setLayout(new GridLayout(4,3));
        // creation of objects for each textfields
        table11TextField = new JTextField();
        table12TextField = new JTextField();
        table13TextField = new JTextField();
        table21TextField = new JTextField();
        table22TextField = new JTextField();
        table23TextField = new JTextField();
        table31TextField = new JTextField();
        table32TextField = new JTextField();
        table33TextField = new JTextField();
        //creation of objects for each buttons
        checkButton = new JButton("CHECK");
        clearButton = new JButton("CLEAR");
        exitButton = new JButton("EXIT");
        //add the created objects to the frame
        add(table11TextField);
        add(table12TextField);
        add(table13TextField);
        add(table21TextField);
        add(table22TextField);
        add(table23TextField);
        add(table31TextField);
        add(table32TextField);
        add(table33TextField);
        add(checkButton);
        add(clearButton);
        add(exitButton);
        /*connect the buttons using action listener with the current instance (this)
        so that the buttons can be clicked and will function */
        checkButton.addActionListener(this);
        clearButton.addActionListener(this);
        exitButton.addActionListener(this);
    }
    
    @Override //uses polymorphism (overriding); overrides the function actionPerformed
    public void actionPerformed(ActionEvent e){
        //code for the exit button/dialog
	if (e.getSource()== exitButton){
            int response = JOptionPane.showConfirmDialog(
                rootPane,
                "Are you sure you want to exit the program?",
                "Confirm exit",
                JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
            if (response==0){
                this.dispose();
            }        
         
        }// if exit button is not clicked, but check or reset then:
	else{
            int[] arrayTable = new int[9]; //create array with size of 9
            int i, j; //declaration variables for looping
            boolean ifMagicSquare, ifNoDuplicate = true, ifComplete = true, ifNoInvalid = true; // for message dialog conditions(validation and checking)
            // initialize array indexes to the the int values of converted textfield which can be accessed by the getter method.
            
            try{
            arrayTable[0] = Integer.parseInt(table11TextField.getText());
            arrayTable[1] = Integer.parseInt(table12TextField.getText());
            arrayTable[2] = Integer.parseInt(table13TextField.getText());
            arrayTable[3] = Integer.parseInt(table21TextField.getText());
            arrayTable[4] = Integer.parseInt(table22TextField.getText());
            arrayTable[5] = Integer.parseInt(table23TextField.getText());
            arrayTable[6] = Integer.parseInt(table31TextField.getText());
            arrayTable[7] = Integer.parseInt(table32TextField.getText());
            arrayTable[8] = Integer.parseInt(table33TextField.getText());
            }catch (NumberFormatException e1){
            ifComplete = false;}
            // for input validation
            for (i=0; i<9; i++) {
                if(arrayTable[i] <= 0 || arrayTable[i] > 9) {
                        ifNoInvalid = false;
                }//checks if inputs of each field is less than or greater 9, if true set ifNoInvalid to false(for the message dialog)
                for(j=0; j<9; j++) {
                    if(i==j)
                            continue;
                    if(arrayTable[i] == arrayTable[j]) {
                            ifNoDuplicate = false;
                    }// checks if fields has duplicates, if true set ifNoDuplicate to false(for message dialog)
                }
            }
            /*boolean checking: stores values of true or false in the variable ifMagicSqaure,
            checking if the sum of each row, each column and diagonals is equal to 15*/
            ifMagicSquare = ((arrayTable[0]+arrayTable[1]+arrayTable[2] == 15)&&(arrayTable[3]+arrayTable[4]+arrayTable[5] == 15) && 
                            (arrayTable[6]+arrayTable[7]+arrayTable[8] == 15) &&(arrayTable[0]+arrayTable[3]+arrayTable[6] == 15) && 
                            (arrayTable[1]+arrayTable[4]+arrayTable[7] == 15) &&(arrayTable[2]+arrayTable[5]+arrayTable[8] == 15) &&
                            (arrayTable[0]+arrayTable[4]+arrayTable[8] == 15) && (arrayTable[2]+arrayTable[4]+arrayTable[6] == 15));

            /* codes for the check button: if else statements to display a dialog
            if the square is not a magicsquare, has invalid input or has duplicates. */               
            if(e.getSource()==checkButton) {
                    if(!ifComplete)
                            JOptionPane.showMessageDialog(null, "Sorry! Incomplete.", "WRONG", JOptionPane.INFORMATION_MESSAGE);
                    else if (ifMagicSquare)
                            JOptionPane.showMessageDialog(null, "Congrats! It is a Magic Square!", "NICE", JOptionPane.INFORMATION_MESSAGE);
                    else if (!ifNoInvalid) 
                            JOptionPane.showMessageDialog(null, "Invalid! A number is more than 9 or less than 1.", "INVALID", JOptionPane.INFORMATION_MESSAGE);
                    else if (!ifNoDuplicate )
                            JOptionPane.showMessageDialog(null, "Try Again! A number has a duplicate.", "DUPLICATE", JOptionPane.INFORMATION_MESSAGE);
                    else
                            JOptionPane.showMessageDialog(null, "Sorry! It is not a Magic Square.", "WRONG", JOptionPane.INFORMATION_MESSAGE);
                    
            /* instructions for the clear button: if clicked, then set 
            all text of each column and rows to blank using the setter method*/
            }else if(e.getSource()==clearButton) {
                    table11TextField.setText(" ");
                    table12TextField.setText(" ");
                    table13TextField.setText(" ");
                    table21TextField.setText(" ");
                    table22TextField.setText(" ");
                    table23TextField.setText(" ");
                    table31TextField.setText(" ");
                    table32TextField.setText(" ");
                    table33TextField.setText(" ");
            }
        }
    }
}
