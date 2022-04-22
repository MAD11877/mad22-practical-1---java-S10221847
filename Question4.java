import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int x=1;
    while (x!=0){
      System.out.print("Enter the size of the base of the triangle: ");
      int base_size=in.nextInt();
      for(int i=base_size;
      i>=0;
      i=i-1){
        for(int j=i;
        j>0;
        j=j-1){
          System.out.print('*');
        }
        System.out.println(' ');

      }
    }

    

    
  }
}
