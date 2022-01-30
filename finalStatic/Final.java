package finalStatic;


public class Final {
    public  final int a = 10; // final non-accsess modefiry значение переменной меняться не может


    public void abc(short s){
       final  byte b; // локальная переменная
        b = 10; // сразу должен придать значение
        System.out.println(s + b);

        // можем внутри параметра метода вписать final
    }



    public static void main(String[] args) {
Final t = new Final();
        //t.a = t.a * 2; изменять значения а не получиться
        System.out.println(t.a);
    }

}


// У final(константа) нету дефолтного значение.Всегда должно быть указано значение.
// нельзя изменять.
