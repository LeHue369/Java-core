package tryCatch_throwException;

import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Main {
    public static void main(String[] args) throws Exception {
        //1.Try-catch exceptions helps us handle exceptions
        // Ex1
        try {
            int[] a = {4, 5, 1};
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your index is out of bounds");
        }catch (Exception e){// use A|B to create union catch blocks
            throw new TimeoutException("this operation is too long!");
        }finally {
            System.out.println("exception can't be found");
        }
        // Ex2
       handleEx();
    }
    public static void handleEx(){
            Scanner scan = new Scanner(System.in);
            System.out.println("What's your favorite number?");
            int n = scan.nextInt();
            System.out.println(n);// entering a string
    }
}
