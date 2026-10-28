import java.util.*;
public class mean_of_array {
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
        int k=0;
        for(int i=0;i<num;i++)
        {
            int t=arr[i];
            k=k+t;
        }
        double mean=k/num;
        double floor=Math.floor(mean);
        System.out.println("mean of elements in array is "+floor);
    }
}
