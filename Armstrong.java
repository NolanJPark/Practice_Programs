import java.util.*;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What integer would you like to check?");
        //Takes user input ans stores it as x
        int x = s.nextInt();
        //Int y is the int equal to the sum of the numbers in x to the power of x's length
        int y = 0;
        //Since we're going to mess with x we'll store it as z
        int z = x;
        //A is an empty array list where the individual numbers in x will be stored
        ArrayList<Integer> a = new ArrayList();
        //while loop that gathers and stores the individual numbers within x
        while (x > 0)
        {
            if (x > 9)
                a.add(x%10);
            else
                a.add(x);
            x /= 10;
        }
        //Goes through each int inside arraylist a and adds it to y after taking it to the power of the arraylists size
        for(int i = 0; i < a.size(); i++)
        {
            y += (int)Math.pow(a.get(i), a.size());
        }
        //If else that outputs based on whether z equals y
        if (z == y)
            System.out.print(z+" is an armstrong number");
        else
            System.out.print(z+" isn't an armstrong number");
    }
}
