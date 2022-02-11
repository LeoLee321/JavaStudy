package black_horse;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The height of the first monk is ");
        int h1 = sc.nextInt();
        System.out.println("The height of the second monk is ");
        int h2 = sc.nextInt();
        System.out.println("The height of the third monk is ");
        int h3 = sc.nextInt();

        int tempHeight = h1 > h2 ? h1 : h2;
        int maxHeight = tempHeight > h3 ? tempHeight : h3;



        System.out.println("The tallest monk is " + maxHeight);
    }
}
