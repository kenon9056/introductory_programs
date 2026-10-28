import java.util.*;
public class remove_duplicates_error {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements to be entered");
        int dig=sc.nextInt();
        int[] arr= new int[dig];
        int[] element=new int[dig];
        System.out.println("enter the elements of array in strictly ascending order");
        for(int i=0;i<dig;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=1;
        for(int i=0;i<dig;i++)
        {
            if(arr[i]==arr[i+1])
            {
                element[i]=arr[i];
                arr[i]='T';
            }
            else if(arr[i]!=arr[i+1])
            {
                
            }
        }
    }
}
