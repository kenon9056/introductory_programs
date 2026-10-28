package STRINGS;
import java.util.*;
public class count_char {
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter the word");
        String s=sc.nextLine();
        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
            else
            {
                continue;
            }
        }
        System.out.println("number of characters are "+count);
    }
}

