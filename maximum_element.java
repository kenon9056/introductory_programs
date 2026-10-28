import java.util.*;
public class maximum_element {
    static void main(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of elements");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("enter the numbers");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int copy=0;
        for(int i=0;i<num-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                continue;
            }
            else
            {
                copy=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=copy;
            }
        }
        System.out.println("largest element ="+arr[num-1]);
    }
}
