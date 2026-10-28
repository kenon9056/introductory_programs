import java.util.*;
public class factorial {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num==0)
        {
            System.out.println("factorial="+0);
        }
        else if(num<0)
        {
            System.out.println("negative integer");
        }
        else
        {
            int copy=num;
            int facto=1;
            for(int i=1;i<=num;i++)
            {
                facto*=i;
            }
            System.out.println("factorial of "+num+"="+facto);
        }
    }
}
