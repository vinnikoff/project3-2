/**
 * Created by VINNI on 15.11.16.
 */
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Integer a=1;
        Integer b=2;
        Arithmetic arithmetic = new Arithmetic();
        Integer summ=arithmetic.add(a, b);
        System.out.println(summ);
        Adder add = new Adder();
        boolean rez=add.check(a, b);
        System.out.println(rez);

    }
}