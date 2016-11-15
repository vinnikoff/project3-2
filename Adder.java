/**
 * Created by VINNI on 15.11.16.
 */
public class Adder extends Arithmetic
{
    boolean check(Integer a, Integer b)
    {
        boolean rez;
        if (a>=b) rez=true;
        else rez=false;
        return rez;
    }
}