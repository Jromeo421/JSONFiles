package CIT360_ACP;

/**
 *
 * @author Sterling Kendall
 */
public class AddIt implements doArithmatics{
    @Override
    public void execute(Integer uIn1, Integer uIn2){
        Integer addIt = uIn1 + uIn2;
        System.out.println(addIt);
    }
}