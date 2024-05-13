import java.io.*;
import java.util.*;
public class String_anagram
{
    public static void allLetter(String str)
    {
        str = str.toLowerCase();
        boolean allLetterPresent = true;
        for (char ch = 'a'; ch <= 'z'; ch++) 
        {
            if (!str.contains(String.valueOf(ch))) 
            {
                allLetterPresent = false;
                break;
            }
        }
        if (allLetterPresent)
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        allLetter(str);
    }
}