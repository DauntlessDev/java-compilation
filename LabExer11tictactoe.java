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

public class LabExer11tictactoe extends JFrame{
    JButton buttons[] = new JButton[9]; 
    JPanel tictac = new JPanel();
    JLabel player = new JLabel("Player",SwingConstants.RIGHT);
    JLabel player1 = new JLabel("One's",SwingConstants.CENTER);
    JLabel player2 = new JLabel("Turn",SwingConstants.LEFT);
    
    String playerwin = "";
 
    int alternate = 0;
    
    public LabExer11tictactoe(){
      super("Tic-Tac-Toe");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setBounds(550,250,350,300);
      setResizable(false);
      getContentPane().setLayout(new GridLayout(0,3));
      initializebuttons();
      player.setFont(new Font("Tahoma", Font.BOLD, 16));
      getContentPane().add(player);
      player1.setFont(new Font("Tahoma", Font.BOLD, 16));
      getContentPane().add(player1);
      player2.setFont(new Font("Tahoma", Font.BOLD, 16));
      getContentPane().add(player2);
      
    }
    
    public void initializebuttons(){
        
        JButton dummy = new JButton("");
        Font font = dummy.getFont();
        Font bigFont = font.deriveFont(font.getSize2D() * 5.0f);
        
        for(int i = 0; i <= 8; i++)
        {
            buttons[i] = new JButton();
            buttons[i].setText("");
            buttons[i].setFont(bigFont);
            buttons[i].addActionListener(new buttonListener());
            getContentPane().add(buttons[i]);     
        }
    }
    
    public void resetButtons(){
        alternate = -1;
        for(int i = 0; i <= 8; i++)
        {
            buttons[i].setEnabled(true);
            buttons[i].setText("");
        }
       player1.setText("One's");
    }
    
    private class buttonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            JButton buttonClicked = (JButton)e.getSource();
            
            if(alternate % 2 == 0){
                buttonClicked.setText("X");
                buttonClicked.setEnabled(false);
                player1.setText("Two's");
                playerwin = "One";
            }
            else{
                buttonClicked.setText("O");
                buttonClicked.setEnabled(false);
                player1.setText(" One's");
                playerwin = "Two";
            }
            
            if(checkIfWin() == true){
                JOptionPane.showMessageDialog(rootPane,"Player "+playerwin+" Won!", "Win!",JOptionPane.INFORMATION_MESSAGE);
                int tryagain = JOptionPane.showConfirmDialog(rootPane, "Do you want to try again?","Try Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(tryagain == 1){
                        dispose();
                    }
                    
                    else{
                        resetButtons();
                    }
            }
            else if(checkIfWin () == false && alternate ==8){
                int tryagain = JOptionPane.showConfirmDialog(rootPane, "It's a Tie!\nDo you want to try again?","Tiw!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(tryagain == 1){
                        dispose();
                    }

                    else{
                        resetButtons();
                    }
            }
                
            alternate++;
            
        }
        
        public boolean checkIfWin(){
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
            if ( buttons[a].getText().equals(buttons[b].getText()) && !buttons[a].getText().equals("") ){
                return true;
            }
            else{
                return false;
            }
        }  
    }
    
    public static void main(String[] args) {
        new LabExer11tictactoe();
    }
}

