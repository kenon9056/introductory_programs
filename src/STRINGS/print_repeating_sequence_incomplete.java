//code works only when input is in alphabetical order
package STRINGS;
import java.util.*;
public class print_repeating_sequence_incomplete {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String str = sc.nextLine();
        String copy = "";
        char c = ' ';
        char s = ' ';
        char e = ' ';
        e=str.charAt(0);
        copy+=e;
        for (int i = 0; i < str.length()-1; i++)
        {
            c = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++)
            {
                if (c == str.charAt(j))
                {
                    continue;
                } else
                {
                    s = str.charAt(j);
                    copy = copy + s;
                }

            }
        }
        System.out.println(copy);
    }
}


