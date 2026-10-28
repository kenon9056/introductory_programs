//Given an array arr[] consisting of only 0's and 1's.
// Modify the array in-place to segregate 0s onto the left side and
// 1s onto the right side of the array.
import java.util.*;
public class segregate_0and_1 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elemnets");
        int dig=sc.nextInt();
        int[] arr=new int[dig];
        System.out.println("enter 0's and 1's");
        for(int i=0;i<dig;i++)
        {
            arr[i]=sc.nextInt();
        }
        int zero=0;
        int one=0;
        for(int i=0;i<dig;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]==1)
            {
                one++;
            }
        }
        for(int i=0;i<zero;i++)
        {
            arr[i]=0;
        }
        for(int i=zero;i<dig;i++)
        {
            arr[i]=1;
        }
        System.out.println("sorted array:-");
        for(int i=0;i<dig;i++)
        {
            if(i<dig-1)
            {
                System.out.print(arr[i] + ",");
            }
            else
            {
                System.out.print(arr[i]);
            }
        }
    }
}
