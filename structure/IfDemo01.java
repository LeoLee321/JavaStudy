package structure;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("���������ݣ� ");
        String s = scanner.nextLine();

        if (s.equals("Hello")){
            System.out.println(s);
        }
        System.out.println("End");
        scanner.close();
    }
}
