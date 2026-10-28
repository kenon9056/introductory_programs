//Given an integer n, find the absolute difference between
// sum of the squares of first n natural numbers and
// square of sum of first n natural numbers.
import java.util.*;
public class sum_of_squares {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int square=0;
        for(int i=0;i<=n;i++)
        {
            square+=i*i;
        }
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum+=i;
        }
        int sum_sqr=sum*sum;
        int last=Math.abs(square-sum_sqr);
        System.out.println(last);
    }
}
