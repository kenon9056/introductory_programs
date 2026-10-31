package codeForces;
import java.util.*;
public class Divisibility_problem {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       int[][] arr=new int[t][2];
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               arr[i][j]=sc.nextInt();
           }
       }

       for(int i=0;i<t;i++)
       {
           if(arr[i][0]%arr[i][1]!=0)
           {
               System.out.println(arr[i][1]-(arr[i][0]%arr[i][1]));
           }
           else
               System.out.println(0);
       }
    }
}
