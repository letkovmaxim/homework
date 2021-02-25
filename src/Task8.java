import java.util.Random;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Random rn = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива >> ");
        int n = input.nextInt();
        float[] arr = new float[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(1000) + rn.nextFloat();
        }

        System.out.println("1. Вывести массив"+"\n"+"2. Увеличить элемент массива на 10%"+"\n"+"3. Выход");

        System.out.print("Выберите действие >> ");
        int pt = input.nextInt();
        while (pt != 3) {

            if (pt == 1) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }

            if (pt == 2) {
                System.out.print("Введите номер элемента >> ");
                int num = input.nextInt();
                while (!(1 <= num & n >= num)) {
                    System.out.print("Введите номер элемента >> ");
                    num = input.nextInt();
                }
                arr[num - 1] = arr[num - 1] * 1.1f;
                System.out.println("Готово!");
            }

            System.out.print("Выберите действие >> ");
            pt = input.nextInt();
        }

    }
}
