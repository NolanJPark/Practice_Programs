import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What word would you like to check?");
        //Saves user input as str which will be checked if it's a palindrome
        String str = s.nextLine();
        //Boolean that represents whether str is a palindrome or not
        boolean b = true;
        //For loop that goes through half of str
        for (int i = 0; i < str.length()/2; i++)
        {
            //Compares i to it's opposite which is str.length()-i-1 to str.length()-1
            if (!str.substring(i,i+1).equalsIgnoreCase(str.substring(str.length()-i-1, str.length()-i)))
                b = false;
        }
        //basic if statement to print output based on whether b is true or false
        if (b)
            System.out.print(str+" is a palindrome");
        else
            System.out.print(str+" isn't a palindrome");
    }
}
