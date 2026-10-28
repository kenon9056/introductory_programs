import java.util.*;
public class palindrome_number {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int copy =num;
        int rev=0;
        while(copy!=0)
        {
            rev=(rev*10)+(copy%10);
            copy=copy/10;
        }
        if(rev==num)
        {
            System.out.println("number is palindrome");
            System.exit(0);
        }
        System.out.println("not palindrome");
    }
}
