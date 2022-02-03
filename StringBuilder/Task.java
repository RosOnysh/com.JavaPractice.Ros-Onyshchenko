package StringBuilder;

public class Task {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Good DayS ");
        StringBuilder sb2 = new StringBuilder(50);
        StringBuilder sb3 = new StringBuilder();

        System.out.println(sb.length());    // .length()
        System.out.println(sb.charAt(2)); // .charAt()
        System.out.println(sb.indexOf(" "));  //.indexOf()
        System.out.println(sb.indexOf("e", 1)); //.indexOf

        String s = sb.substring(5);

        System.out.println(s);

        String s2 = sb.substring(5, 8); // .substring

        System.out.println(s2);

        System.out.println(sb.subSequence(5, 8));  //.subSequence

       // sb.append(22);
        // System.out.println(sb);

        System.out.println(sb.insert(4,"Word"));

        StringBuilder sb4 = new StringBuilder("Hello world");
        sb4.delete(5,7);

    }
}
