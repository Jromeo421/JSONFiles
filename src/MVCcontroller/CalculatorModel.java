/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCcontroller;

/**
 *
 * @author JRome
 */
public class CalculatorModel {
    
    private int calculationValue;
    
    public void addTwoNumbers(int firstInteger, int secondInteger){
        
        calculationValue = firstInteger + secondInteger;
    }
    
        public int getCalculationValue(){
            
        return calculationValue;
            
        }
}