package homework_Week7;

import java.util.Locale;

public class StrPractice {

    public void strPrac() {
        String a = "my name is viral";
        String b = "I am learning Software testing";
        String c = "my name is viral";

        System.out.println(a.length());
        System.out.println(a.charAt(6));
        System.out.println(a.concat(b));
        System.out.println(a.contains("viral"));
        System.out.println(b.contains("viral"));
        System.out.println(b.startsWith("I"));
        System.out.println(b.endsWith("g"));
        System.out.println(a.equals(c));
        System.out.println(a.equals(b));
        System.out.println(b.indexOf("learning"));
        System.out.println(a.isEmpty());
        System.out.println(c.substring(5,6));
        System.out.println(a.toCharArray());
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(c.trim());

    }



}
