public class dz5 {
    public static void main(String[] args) {
        StringBuffer sbuffer = new StringBuffer("Java still hard for me!!!");
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

        String cnt = "Java still hard for me";
        String substring = "still";
        System.out.println(cnt.contains(substring));

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



    }
}
