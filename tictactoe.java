import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class tictactoe extends JFrame{
    JButton buttonClick[] = new JButton[9]; 
    JPanel ticx = new JPanel();
    JLabel label1 = new JLabel("Player",SwingConstants.RIGHT);
    JLabel labelplayerturn = new JLabel("One's",SwingConstants.CENTER);
    JLabel label2 = new JLabel("Turn",SwingConstants.LEFT);

    String playerwin = "";
 
    int elseChecker = 0;
    
    public tictactoe(){
      super("Tic-Tac-Toe");
      setBackground(Color.WHITE);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setBounds(500,250,300,300);
      setResizable(false);
      getContentPane().setLayout(new GridLayout(0,3));
      initializebuttons();
      label1.setBackground(Color.WHITE);

      label1.setForeground(Color.BLUE);
      label1.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
      getContentPane().add(label1);
      labelplayerturn.setBackground(Color.WHITE);
      labelplayerturn.setForeground(Color.BLUE);
      labelplayerturn.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
      
      label1.setForeground(Color.BLUE);
      getContentPane().add(labelplayerturn);
      label2.setBackground(Color.WHITE);
      label2.setForeground(Color.BLUE);
      label2.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
      getContentPane().add(label2);
      
    }
    
    public void initializebuttons(){
        
        JButton dummy = new JButton("");
        Font font = dummy.getFont();
        Font bigFont = font.deriveFont(font.getSize2D() * 5.0f);
        
        for(int i = 0; i <= 8; i++)
        {
         
            buttonClick[i] = new JButton();
            buttonClick[i].setText("");

            buttonClick[i].setBackground(new Color(255, 240, 255));
            buttonClick[i].setForeground(Color.WHITE);
            buttonClick[i].setFont(new Font("Tw Cen MT", Font.BOLD, 30));
            buttonClick[i].addActionListener(new buttonListener());
            getContentPane().add(buttonClick[i]);     
        }
    }
    
    public void buttonReset(){
        elseChecker = -1;
        for(int i = 0; i <= 8; i++)
        {
            buttonClick[i].setEnabled(true);
            buttonClick[i].setText("");
        }
       labelplayerturn.setText("One's");
    }
    
    private class buttonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            JButton buttonClicked = (JButton)e.getSource();
            
            if(elseChecker % 2 == 0){
                buttonClicked.setText("X");

                buttonClicked.setForeground(Color.RED);
                buttonClicked.setEnabled(false);
                labelplayerturn.setText("Two's");
                label2.setForeground(Color.RED);
                labelplayerturn.setForeground(Color.RED);
                label1.setForeground(Color.RED);
                playerwin = "One";
            }
            else{
                buttonClicked.setText("O");
                buttonClicked.setEnabled(false);
                labelplayerturn.setText(" One's");
                labelplayerturn.setForeground(Color.BLUE);
                label1.setForeground(Color.BLUE);
                label2.setForeground(Color.BLUE);
                playerwin = "Two";
            }
            
            if(ifWin() == true){
                JOptionPane.showMessageDialog(rootPane,"Player "+playerwin+" Won the Game!", "Winner",JOptionPane.INFORMATION_MESSAGE);
                int tryagain = JOptionPane.showConfirmDialog(rootPane, "Play again?","Again", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(tryagain == 1){
                        dispose();
                    }
                    
                    else{
                        buttonReset();
                    }
            }
            else if(ifWin () == false && elseChecker ==8){
                int tryagain = JOptionPane.showConfirmDialog(rootPane, "A DRAW!!!\nDo you want to try again?","Tiw!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(tryagain == 1){
                        dispose();
                    }

                    else{
                        buttonReset();
                    }
            }
                
            elseChecker++;
            
        }
        
        public boolean ifWin(){
            //horizontal win check
            if( checkBoxes(0,1) && checkBoxes(1,2) ){ 
                return true;
            }
            else if( checkBoxes(3,4) && checkBoxes(4,5) ){
                return true;
            }
            else if ( checkBoxes(6,7) && checkBoxes(7,8)){
                return true;
            }
            
            //vertical win check
            else if ( checkBoxes(0,3) && checkBoxes(3,6)){
                return true;  
            }
            else if ( checkBoxes(1,4) && checkBoxes(4,7)){
                return true;
            }
            else if ( checkBoxes(2,5) && checkBoxes(5,8)){
                return true;
            }
            
            //diagonal win check
            else if ( checkBoxes(0,4) && checkBoxes(4,8)){
                return true;  
            }
            else if ( checkBoxes(2,4) && checkBoxes(4,6)){
                return true;
            }
            else{
                return false;
            }
        }
        
        public boolean checkBoxes(int a, int b){
            if ( buttonClick[a].getText().equals(buttonClick[b].getText()) && !buttonClick[a].getText().equals("") ){
                return true;
            }
            else{
                return false;
            }
        }  
    }
    
    public static void main(String[] args) {
        new tictactoe();
    }
}

