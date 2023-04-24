// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

package second_dz;

import java.util.Scanner;

public class task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите букву для поиска драгоценных камней : ");
        String diamonds = sc.nextLine();
        char[] charArray_diamonds = diamonds.toCharArray(); // разбиваем строку на массив чаров
        System.out.print("Введите все камни : ");
        String stones = sc.nextLine();
        char[] charArray_stones = stones.toCharArray(); // разбиваем строку на массив чаров
        int count = 0;
        for (int i = 1; i < charArray_stones.length; i++) {
            if (charArray_stones[i] == charArray_diamonds[0]) {
                count += 1;
            }
        }
        System.out.printf("Кол-во драгоценных камней <%s> в куче <%s> = %d", diamonds, stones, count);
    }
}