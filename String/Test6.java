package String;

public class Test6 {
    public static void main(String[] args) {
        String s1 = "Hello Wrld";
        String s2 = "Yeaa";
        String s3 = s1.concat(s2).trim().replace("Yeaa","Sosat").substring(1,7);
        System.out.println(s3);
        System.out.println(s1.substring(s1.indexOf('w')));
    }
}
