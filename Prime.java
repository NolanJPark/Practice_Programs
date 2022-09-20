import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What number would you like to check? ");
        //Takes user input as x which will be checked if it's prime or not
        int x = s.nextInt();
        //boolean that represents whether x is prime or not
        boolean b = true;
        //If x is < 0 then b is set to false and the for loop won't run
        if (x < 0)
            b = false;
        else
        {
            //runs through every number between 1 and x (not inclusive) since 0&1 are prime and negative numbers aren't prime
            for (int i = 2; i < x; i++) 
            {
                //if x can be completely divided by i then it's not prime b is set to false and the loop ends
                if (x % i == 0) 
                {
                    b = false;
                    break;
                }
            }
        }
        //basic if statment to print output based on whether b is true or false
        if (b) 
            System.out.print(x+" is prime");
        else
            System.out.print(x+" isn't prime");
    }
}
