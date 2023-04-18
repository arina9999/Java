package first_dz;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        int first_number = in.nextInt();
        System.out.print("Введите первое число : ");
        int second_number = in.nextInt();
        System.out.print("Введите действие, которо хотите совершить с числами : ");
        String move = in.next();
        switch (move) {
            case "+":
                System.out.printf("Сумма чисел %d + %d = %d", first_number, second_number,
                        first_number - second_number);
                break;
            case "-":
                System.out.printf("Разность чисел %d - %d = %d", first_number, second_number,
                        first_number - second_number);
                break;
            case "*":
                System.out.printf("Произведение чисел %d * %d = %d", first_number,
                        second_number,
                        first_number * second_number);
                break;
            case "/":
                System.out.printf("При делении числа %d / %d результат = %d", first_number,
                        second_number,
                        first_number / second_number);
                break;
            default:
                System.out.println("Введите корректную операцию над числами (+,-,*,/)");
                break;
        }
        in.close();
    }
}
