/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCcontroller;
import java.awt.event.ActionListener;
import javax.swing.*;
 
public class CalculatorView extends JFrame{
    
    private final JTextField firstInteger = new JTextField(10);
    private final JLabel additionLabel = new JLabel("+");
    private final JTextField secondInteger = new JTextField(10);
    private final JButton calculateButton = new JButton("Calculate");
    private final JTextField calcSolution = new JTextField(10);
    
    CalculatorView(){
        
        JPanel calcPanel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
                
        calcPanel.add(firstInteger);
        calcPanel.add(additionLabel);
        calcPanel.add(secondInteger);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        
        this.add(calcPanel);
        
        
}
    
        public int getFirstInteger(){
            
            return Integer.parseInt(firstInteger.getText());
        }
        
        public int getSecondInteger(){
            
            return Integer.parseInt(secondInteger.getText());
        }
        
        public int getCalcSolution(){
            
            return Integer.parseInt(calcSolution.getText());
        }
        
       public void setCalcSolution(int solution){
           
           calcSolution.setText(Integer.toString(solution));
        }
        
        void addCalculateListener(ActionListener listenForCalcButton){
        
        calculateButton.addActionListener(listenForCalcButton);

        }
        
        void displayErrorMessage(String errorMessage){
            
            JOptionPane.showMessageDialog(this, errorMessage);
        }
}
