package searching;
import java.util.*;
public class binary_search_2Darray {
   public static void main() {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the row and column respectively");
       int row=sc.nextInt();
       int col=sc.nextInt();
       int[][] arr=new int[row][col];
       System.out.println("enter the elemnts");
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
                arr[i][j]=sc.nextInt();
           }
       }
       System.out.println("enter the element to be found");
       int target=sc.nextInt();
       int start=0;
       int end=col-1;
       boolean flag=true;
       while(start<row && end>=0)
       {
           if(arr[start][end]==target)
           {
               System.out.println("element found at row "+(start+1)+" column "+(end+1));
               flag=false;
               break;
           }
           else if(arr[start][end]<target)
           {
               start++;
           }
           else
           {
               end--;
           }
       }
       if(flag==true)
       {
           System.out.println("element not present");
       }
   }
}
