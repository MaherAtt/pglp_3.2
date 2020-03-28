package uvsq.pglp_3_2;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args){
    ArrayList<Employee> travailleurs = new ArrayList<Employee>();
    travailleurs.add(new Vendeur(4,500));
    travailleurs.add(new Manager(3,40));
    int sum=0;
    for (int a = 0;a < travailleurs.size();a++)
      {
       sum=sum+travailleurs.get(a).calculSalaire();
      }
        System.out.println(sum);
    }
}
