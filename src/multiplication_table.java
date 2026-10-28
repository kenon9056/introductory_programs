import java.util.*;
public class multiplication_table {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number whose table is to be printed");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num*i);
        }
    }
}
