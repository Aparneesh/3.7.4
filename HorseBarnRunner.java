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
    ArrayList<Horse> barnSpaces = barn.getSpaces();

    Collections.shuffle(barnSpaces);
    System.out.println(barnSpaces);

    for(int i = 0; i < barnSpaces.size() - 1; i = i + 2){
      System.out.println(barnSpaces.get(i) + " and " + barnSpaces.get(i + 1));
    }



  
    


  }
} 