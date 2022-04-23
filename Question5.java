import java.util.Scanner;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of integers you are going to input: ");
    int integer_count=in.nextInt();
    ArrayList<Integer>intList=new ArrayList<>();
    for (int i=0;
    i<integer_count;
    i++){
      System.out.println("Enter integer "+(i+1));
      int integerr=in.nextInt();
      intList.add(integerr);
    }
    for (int i=0;
    i<len(intList);
    i++){
      int temp_int=intList.get(i);
      int count=0;
      for(int x=0;
      x<len(intList);
      i++){
        if (temp_int=intList.get(x)){
          count+=1;
        }
      if 
      
      }
    }

    
  }
}
