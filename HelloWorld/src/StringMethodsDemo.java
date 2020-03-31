/*
    Created by Margot Wagner 2/28/20
 */
public class StringMethodsDemo {
    public static void main(String[] args) {
        String original = "abcde";

        for (int i = 0; i < original.length(); i++) {
            System.out.println("the character at index " + i + " is: " + original.charAt(i));
        }

        System.out.println("the letter 'a' is at index " + original.indexOf('a'));
        System.out.println("the letter 'a' is at index " + original.indexOf('A'));

        original = original.toUpperCase();
        System.out.println(original);

        String substring = original.substring(0,3);
        System.out.println(substring);

        String str1 = "Frodo Baggins";
        System.out.println(str1.substring(4));
        System.out.println("str1");
    }
}
