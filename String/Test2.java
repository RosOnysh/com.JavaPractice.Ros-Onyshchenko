package String;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("privet");

     /*
        String s2 = s1.substring(6);
        System.out.println(s2);

        String s3 = s1.substring(3,7);
        System.out.println(s3);
*/
        String s4 = s1.replace('r', 'Z' );
        System.out.println(s4);
        System.out.println(s1);


        String s5 = "Helor";
        String s6 = " Friend";
        System.out.println(s5.concat(s6));

    }
}
