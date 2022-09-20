import java.util.*;
public class Repeated_Chars
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Give me a word to find duplicates in");
        //Saves user input as str
        String str = s.nextLine();
        //First for loop goes through each letter is str
        for (int i = 0; i < str.length(); i++)
        {
            //goes through each letter in str that's after index i
            for (int j = i+1; j < str.length(); j++)
            {
                //checks if the char in str at index i is equal to the one at index j, if it is it prints this char with ' around it
                if (str.substring(i,i+1).equalsIgnoreCase(str.substring(j,j+1)))
                    System.out.print("'"+str.substring(i,i+1)+"'"+" ");
            }
        }
    }
}
