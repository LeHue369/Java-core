package try1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList();

        for(int i = 0; ; i++){
            // input a whole string or infomation
            String[] s = input.nextLine().split(" ");

            //splitting to generate an array
            String name = "";
            for(int j = 1; j < s.length-1; j++){
                name += s[j]+" ";
            }

            Student student = new Student(Integer.parseInt(s[0]),
                    name, Double.parseDouble(s[s.length-1]));

            // student.getName().trim().equals("0") means eliminating the space at the end and the beginning of a string
            if(student.getId() == 0 && student.getName().trim().equals("0") && student.getGpa() == 0) break;

            list.add(student);
        }

        for(Student i: list){
            System.out.println(i);
        }
    }
}
