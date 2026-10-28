import java.util.*;
public class armstrong_num {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int num=sc.nextInt();
        if(num<0)
        {
            System.out.println("invalid input (negative numbers can never be armstrong numbers)");
        }
        else {
            int copy = num;
            int k = 0;
            while (copy != 0) {
                copy = copy / 10;
                k++;
            }
            copy = num;
            double arm = 0;
            while (copy != 0) {
                arm += Math.pow((copy % 10), k);
                copy = copy / 10;
            }
            if (arm == num) {
                System.out.println("number is an armstrong number");
            } else {
                System.out.println("not an armstrong number");
            }
        }
    }
}
