package TotalJava.String;

import java.util.Locale;

public class StringBuilder {
    public static void main(String[] args ){
        java.lang.StringBuilder str = new java.lang.StringBuilder("");
        str.append("Hello world");
        System.out.println(str.toString());

        System.out.println(str.indexOf("e"));
        System.out.println(str.delete(2,5));

    }
}
