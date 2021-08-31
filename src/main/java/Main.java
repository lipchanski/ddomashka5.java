import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sbuffer = new StringBuilder("Java still hard for me!!!");
        char result = sbuffer.charAt(24);
        System.out.println("Последний символ строки - " + result);

        String checkstringend = "Java still hard for me!!!";
        boolean a;
        a = checkstringend.endsWith("???");
        System.out.println(a);
        a = checkstringend.endsWith("!!!");
        System.out.println(a);

        String startstr = "Java still hard for me!!!";
        boolean b;
        b = startstr.startsWith("Java easy");
        System.out.println(b);
        b = startstr.startsWith("Java still hard");
        System.out.println(b);

        String имеет = "Java still hard for me";
        String substring = "still";
        System.out.println(имеет.contains(substring));

        System.out.println(sbuffer.indexOf("hard"));

        String rpl = "Java still hard for me";
        System.out.println(rpl.replace('a', 'o'));

        String mystring = "Java still hard for me";
        String caps = mystring.toUpperCase();
        System.out.println(caps);

        String mystring2 = "JAVA STILL HARD FOR ME";
        String low = mystring2.toLowerCase();
        System.out.println(low);

        System.out.println(sbuffer.substring(11, 15));


        values("Ваня", "5", "Математике");
        values("Женя", "5", "Истории");
        values("Лёня", "5", "ОБЖ");
        values("Максим", "5", "Труд");

    }

    String name = "name";
    String mark = "mark";
    String subject = "subject";

    public static void values(String name, String mark, String subject) {
        System.out.printf("Студент %15s получил %5s по предмету %15s \n", name, mark, subject);


    }

}
