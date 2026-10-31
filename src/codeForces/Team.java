package codeForces;
import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1 || n>1000)
        {
            System.exit(0);
        }
        int[][] arr=new int[n][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<3;j++)
            {
               arr[i][j]=sc.nextInt();
            }
        }
        int k=0;
        int f=0;
        for (int[] ints : arr) {
            for (int j = 0; j < 3; j++) {
                if (ints[j] == 1) {
                    k++;
                }
            }
            if (k >= 2)
            {
                f++;
                k = 0;
            }
            else
            {
                k = 0;
            }
        }
        System.out.println(f);
    }
}
