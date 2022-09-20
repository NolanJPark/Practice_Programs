import java.util.*;
public class GCD
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Give me a number");
        //Saves first user input as x
        int x = s.nextInt();
        System.out.println("Give me another number");
        //Saves second user input as y
        int y = s.nextInt();
        //Creates int max which will hold which user input is greatest
        int max;
        //Creates int that'll hold the greastest common divider and sets it to 1 since everything can be divided by 1
        int gcd = 1;
        //Sets max equal to the user input that was greater
        if (x > y)
            max = x;
        else
            max = y;
        //Goes through every number between 1 and max and if x and y can be divided evenly by it gcd is set to it
        for (int i = 1; i <= max; i++)
        {
            if (x%i == 0 && y%i == 0)
                gcd = i;
        }
        //Outputs x and y and their greatest commond denominator
        System.out.print("The greatest common denominator between "+x+" and "+y+" is "+gcd);
    }
}
