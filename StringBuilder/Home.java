package StringBuilder;

public class Home {
    public static boolean ravenstvo (StringBuilder sb1, StringBuilder sb2){
        boolean result = true;
       if (sb1.length() == sb2.length()){
           for (int i = 0; i < sb1.length(); i++) {
               if (sb1.charAt(i) != sb2.charAt(i))
                   result = false;
               break;
           }

       }  else {
           result = false;
       }
        return result;
    }
}


 class HomeTest{
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("Hello");
        StringBuilder sb4 = new StringBuilder("Hello");
        StringBuilder sb5 = new StringBuilder("Hello");
        boolean a = Home.ravenstvo(sb3,sb4);
        System.out.println(a);
        System.out.println(Home.ravenstvo(sb4,sb5));
        System.out.println(Home.ravenstvo(new StringBuilder(""),new StringBuilder("")));

    }
}
