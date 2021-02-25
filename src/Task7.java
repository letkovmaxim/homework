import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество чисел Фибоначчи >> ");
        long n = input.nextLong();
        long a = 0;
        long b = 1;

        System.out.print(a+" "+b+" ");
        for (int i = 1; i <= n - 2; i++) {
            b = a + b;
            a = b - a;
            System.out.print(b + " ");
        }
    }
}
