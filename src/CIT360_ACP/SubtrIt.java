
package CIT360_ACP;
/**
 *
 * @author J.J Hugh
 */
public class SubtrIt implements doArithmatics {
    @Override
    public void execute(Integer uIn1, Integer uIn2){
        Integer subtrIt = uIn1 - uIn2;
        System.out.println(subtrIt);
    }
}