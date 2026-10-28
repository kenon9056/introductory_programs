package STRINGS;
import java.util.*;
public class length_of_last_word {
    static void main()
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("enetr a string");
        String s=sc.nextLine();
        int count=0;
        String n=s.trim();
        int k=n.length();
        for(int i=k-1;i>=0;i--)
        {
            if(n.charAt(i)!=' ')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        System.out.println("length of last word="+count);
    }
}
