package lamda_expression.ex2;

public class Main {
    public static void main(String[] args) {
        MyFunction myFunction = (text1, text2) -> {
            System.out.println(text1 +" and "+ text2);// body of interface's method
        };

        myFunction.apply("Hello World", "for the first time");


    }
}
