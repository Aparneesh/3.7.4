/*
 * Activity 3.7.3
 */
import java.util.ArrayList;
import java.util.*;

public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    HorseBarn barn = new HorseBarn();
    ArrayList <Horse> randHorse = new ArrayList<Horse>();
    ArrayList<Horse> barnSpaces = barn.getSpaces();

    int[] randNums = RandomPermutation.next(10);
    System.out.println(java.util.Arrays.toString(randNums));

    for(int r: randNums){
      randHorse.add(barnSpaces.get(r));
    }

    System.out.println(randHorse);

    for(int i = 0; i < randHorse.size(); i = i + 2){
      try{
        System.out.println(randHorse.get(i) + " and " + randHorse.get(i + 1));
      } catch (Exception e) {
        System.out.println(randHorse.get(i) + " doesn't have a pair");
      }
    }



  
    


  }
} 