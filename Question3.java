import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int integerr=in.nextInt();
    int answer=integerr*integerr;
    System.out.println("Answer is "+answer);

  }
}
