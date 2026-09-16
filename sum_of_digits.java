import java.util.*;
public class sum_of_digits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int copy=num;
        int dig=0;
        int store=0;
        int rev=0;
        while (copy> 0)
        {
          rev=(rev*10)+(copy%10);
          copy=copy/10;
          dig++;
        }
        for(int i=1;i<=dig;i++)
        {
            store=store+(num%10);
            num=num/10;
        }
        System.out.println("sum of digits is "+store);
    }
}
