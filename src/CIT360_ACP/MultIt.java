/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT360_ACP;

/**
 *
 * @author J.J Hugh
 */
public class MultIt implements doArithmatics {
        @Override
    public void execute(Integer uIn1, Integer uIn2){
        Integer multIt = uIn1 * uIn2;
        System.out.println(multIt);
    }
}
