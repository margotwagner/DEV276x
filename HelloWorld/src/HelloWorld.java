/*
    This is my multiline comment
 */

// This is my single-line comment

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args)  {
        //System.out.println("Hello World");
        //System.out.println("My name is Margot Wagner");
        //System.out.print("This doesn't have a built-in newline");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        mystery2(list);
    }


    public static void mystery2(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.add(list.get(i));
            } else {
                list.add(0, list.get(i));
            }
        }
        System.out.println(list);
    }
}
