import java.util.*;
public class even_and_odd {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("enter the elements");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<num;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("there are "+even+" even numbers and "+odd+" odd numbers");
    }
}
