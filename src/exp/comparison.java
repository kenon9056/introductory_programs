package exp;

import java.util.Arrays;

public class comparison {
    static void main(String[] args) {
        String a="harshit";
        String b="harshit";
        //== checks if reference variables are pointing to the same object
        System.out.println(a==b);
        String c=new String("harshit");
        String v=new String("harshit");
        /* new keyword tells java to explicitly create a new object of the same value
        and hence == operator gives false since c and v are pointing to different objects */
        System.out.println(c==v);
        //hence when you only want to check value use the .equals method
        System.out.println(c.equals(v));
        System.out.println(b.equals(b));
        System.out.println(a.equals(v));
        double num=453.0355;
        System.out.printf("%.2f",num);
        System.out.println('a'+'b');//because of absence of %n after %f this statement will not be printed
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));

        System.out.printf("%.2f%n",num);
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));


        System.out.println("a"+1);
        /*when an integer is concatenated with a string it is converted to its wrapper class
        Integer which then calls the toString method*/

        System.out.println("harshit"+new int[]{2,4});
        System.out.println("harshit"+new int[]{});
        System.out.println("hasrhit"+new Integer(56));
        /*whenever there is a object inside println its toString method will be called*/

       // System.out.println(new Integer(56)+new int[]{2,4});
        System.out.println(new Integer(56)+""+new int[]{2,5});

        //+ operator can only be applied to primitives if you want to apply it to complex data types
        //atleast one of them should be string

        //to convert string to array
        String name="kleiny kenon";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(Arrays.toString(name.substring(7).toUpperCase().toCharArray()));
    }
}
