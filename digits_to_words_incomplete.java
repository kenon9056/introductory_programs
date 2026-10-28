import java.util.*;
public class digits_to_words_incomplete {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int copy=num;
        int count=0;
        while(copy>0) {
            copy = copy / 10;
            System.out.println(copy);
            count++;
        }
    }
}
