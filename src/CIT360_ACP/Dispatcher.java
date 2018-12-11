/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT360_ACP;

/**
 *
 * @author JRome
 */
public class Dispatcher {
    
    private final SalaryView salaryView;
    private final UserView userView;
    private final AccountView accountView;
    
    
    
    public Dispatcher(){
        
        salaryView = new SalaryView();
        userView = new UserView();
        accountView = new AccountView();
        
        
    }


    public void dispatch(String request)
    {
            if(request.equalsIgnoreCase("USER"))
            {
               userView.show();
            }
            else if(request.equalsIgnoreCase("SALARY"))
            {
                salaryView.show();
            }
            else 
            {
                accountView.show();
            }
        }
    }