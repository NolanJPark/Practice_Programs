import java.util.*;
public class Reverse_S
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Give me a string to reverse:");
        //Saves user input as str
        String str = s.nextLine();
        //rts is created empty so it can contain the reverse of str
        String rts = "";
        //Goes through every number from the end of str to the first one and adds them to rts in that order
        for (int i = str.length()-1; i > -1; i--)
        {
            //Adds the character at index i from str into rts
            rts += str.substring(i, i+1);
        }
        //Outputs str and the reveresed version of str rts
        System.out.print(str+" reversed is "+rts);
    }
}
