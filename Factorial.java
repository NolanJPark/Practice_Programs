import java.util.*;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What number would you like to find the factorial for? ");
        //Saves user input as x
        int x = s.nextInt();
        //If x is negative than the factorial isn't taken
        if (x < 0)
            System.out.println(x+" is negative and therefore its factorial isn't a real number");
        else
        {
            //Sets int y as 1 because even if x is 0 the factorial is equal to something times 1
            int y = 1;
            //Goes through every number between x and 1, x not inclusive, and multiplies y by it
            for (int i = x; i>1; i--)
            {
                y *= i;
            }
            //Outputs x and x's factorial
            System.out.println(x+"! = "+y);
        }
    }
}
