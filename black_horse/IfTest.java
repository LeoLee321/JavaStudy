package black_horse;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a score: ");
        while (true) {
            float score = sc.nextFloat();

            if (score > 100 || score < 0) {
                System.out.println("Wrong score");
            } else if (score >= 95 && score <= 100) {
                System.out.println("Reward a laptop");
            } else if (score >= 90 && score <= 94) {
                System.out.println("Reward a keyboard");
            } else if (score >= 85 && score <= 89) {
                System.out.println("Reward a mouse");
            } else if (score >= 80 && score <= 84) {
                System.out.println("Reward a football");
            } else {
                System.out.println("Fat beating");
            }

        }
    }
}
