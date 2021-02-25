import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число >> ");
        int a = input.nextInt();
        int tmp = a;
        int b = 0;
        while (tmp> 0) {
            b = b*10 + tmp%10;
            tmp = tmp/10;
        }
        if (a == b) {
            System.out.println("Число является палиндромом.");
        }
        else {
            System.out.println("Число не является палиндромом.");
        }
    }
}
