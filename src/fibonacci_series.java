import java.util.*;
public class fibonacci_series
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("enter digits of fibonnaci series to be printed");
            int dig = sc.nextInt();
            int k = 0;
            int j = 1;
            int sum = 0;
            for (int i = 1; i <= dig; i++)
            {
                System.out.print(k+ ",");
                sum=k+j;
                k=j;
                j=sum;

            }
        }
    }
}
