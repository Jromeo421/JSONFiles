/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCcontroller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JRome
 */

//the controller coordinates the communication between the View and the Model
public class CalculatorController {
    
private CalculatorView theView;
private CalculatorModel theModel;

public CalculatorController(CalculatorView theView, CalculatorModel theModel){
    
    this.theView = theView;
    this.theModel = theModel;
    
    
    //this tells the veiw when ever the calculate button is clicked to perform the action performed method in the calculateListener inner class.
    this.theView.addCalculateListener(new CalculateListener());
}

    class CalculateListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            
            int firstInteger, secondInteger = 0;
            
            try{
                
                firstInteger = theView.getFirstInteger();
                secondInteger = theView.getSecondInteger();
                
                theModel.addTwoNumbers(firstInteger, secondInteger);
                
                theView.setCalcSolution(theModel.getCalculationValue());
                
            }
            
            catch (NumberFormatException ex){
                
                System.out.println(ex);
                
                theView.displayErrorMessage("Please Enter 2 Integers");
            }
        }
        
    }
}
