package STRINGS;
import java.util.*;
public class palindrome {
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word to be cehcked");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(s.compareToIgnoreCase(rev)==0)
        {
            System.out.println("word is palindrome");
        }
        else
        {
            System.out.println("not a palindrome word");
        }
    }
}

