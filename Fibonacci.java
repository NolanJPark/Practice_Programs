import java.util.*;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("How high would you like to go up to?");
        //Highest number the sequence will go to, sequence won't go higher than the input number
        int x = s.nextInt();
        //Empty arraylist so numbers in the sequence can be added
        ArrayList<Integer> a = new ArrayList();
        //If the user's input is negative than Fibonacci won't reach it
        if (x < 0)
            System.out.print("The Fibonacci Sequence doesn't go negative");
        //If the user's input is 0 then Fibonacci only goes to 0
        else if (x == 0)
        {
            a.add(0);
            System.out.print(a);
        }
        else
        {
            //adds 0 & 1 to the arraylist since fibonacci begins with those two to do math
            a.add(0);
            a.add(1);
            //For loop adds the number at index i to the one before that and only goes as long as that sum is less than x
            for (int i = 1; a.get(i-1) + a.get(i) <= x; i++)
            {
                a.add(a.get(i-1) + a.get(i));
            }
            //prints out arraylist since arraylists sort themselves
            System.out.print(a);
        }
    }
}
