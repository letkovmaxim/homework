import java.util.Random;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Random rn = new Random();
        Scanner input = new Scanner(System.in);

        char trg = (char)(rn.nextInt(26) + 'a');
        char guess;

        System.out.print("Введите букву >> ");
        guess = Character.toLowerCase(input.next().charAt(0));

        while ((int) guess != (int) trg) {

            if ((int) guess < (int) trg) {
                System.out.println("You’re too low!");
            } else {
                System.out.println("You’re too high!");
            }

            System.out.print("Введите букву >> ");
            guess = Character.toLowerCase(input.next().charAt(0));
        }

        System.out.println("Right!");
    }
}
