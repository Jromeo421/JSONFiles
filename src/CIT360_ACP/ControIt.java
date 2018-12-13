package CIT360_ACP;

import java.util.HashMap;

/**
 *
 * @author Sterling Kendall
 */
public class ControIt {
    public static HashMap<String, doArithmatics> key = new HashMap <String, doArithmatics>();
    public void ControIt(){
        
    }
    
    public static void handleOperator(String operand, Integer uIn1, Integer uIn2){
        key.put(("+"), new AddIt());
        key.put(("-"), new SubtrIt());
        key.put(("*"), new MultIt());
        key.put(("/"), new DividIt());
        key.put(("^"), new ExponIt());
        
        doArithmatics handler = key.get(operand);
        handler.execute(uIn1, uIn2);
    }
}