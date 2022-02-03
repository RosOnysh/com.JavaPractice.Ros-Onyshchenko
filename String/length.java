package String;

public class length {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(3);
        System.out.println(c1);

        int b = s1.indexOf('t');
        System.out.println(b);

        int b2 = s1.indexOf("vetS");
        System.out.println(b2);

        int b3 = s1.indexOf("a", 5);
        System.out.println(b3);



        // startsWith нельзя использовать char в этом методе


        boolean b1 = s1.startsWith("abc");
        System.out.println(b1);


        boolean b4 = s1.startsWith("abd",7);
        System.out.println(b4);


        // endsWith return boolean

        boolean b5 = s1.endsWith("cd");
        System.out.println(b5);


    }
}
