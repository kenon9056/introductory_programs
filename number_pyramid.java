import java.util.*;
public class number_pyramid {
    static void main() {
        Scanner sc=new Scanner(System.in);
        for(int j=1;j<=5;j++)
        {
            for(int i=1;i<=j;i++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
