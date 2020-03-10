package uvsq.pglp_3_2;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Employee> Travailleurs=new ArrayList<Employee>();
        Travailleurs.add(new Vendeur(4,500));
        Travailleurs.add(new Manager(3,40));
        int Sum=0;
        for(int a=0;a<Travailleurs.size();a++)
        {
        	Sum=Sum+Travailleurs.get(a).calculSalaire();
        }
        System.out.println(Sum);
    }
}
