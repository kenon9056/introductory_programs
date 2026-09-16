import java.util.*;
public class check_perfect_square {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        double num=sc.nextInt();
        double root=Math.sqrt(num);
        double square=(root*root);
        if(square==num)
        {
            System.out.println("number is perfect square of "+root);
            System.exit(0);
        }
        System.out.println("not a perfect square");
    }
}
