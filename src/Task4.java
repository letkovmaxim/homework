import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите вес на Земле >> ");
        float weight = input.nextFloat();
        System.out.print("Вес на Луне равен ");
        System.out.println(weight*0.17);
    }
}
