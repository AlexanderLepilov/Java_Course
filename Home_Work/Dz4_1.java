package Home_Work;

import java.util.ArrayList;
import java.util.Scanner;

public class Dz4_1 {

// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида text~num
// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию
// num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке.
// 3. Если введено exit, завершаем программу

// Пример:
// string~4
// num~3
// print~3
// > num
// print~4
// > string
// my_value~1
// print~1
// > my_value

    public static void main(String[] args) {
        System.out.println("Введите строку и номер под которым хотите её сохранить через дефис (-): ");
        System.out.println("Для выхода введите: exit");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listData = new ArrayList<>();
        while (true) {
            String text = sc.nextLine();
            try {
                if (text.equals("exit")) {
                    break;
                }
                Integer.parseInt(text.split("-")[1]);
                func(text, listData);
            } catch (Exception e) {
                System.out.println("Ошибка, проверьте вводимые данные!");
        }
    }
}

    static void func(String text, ArrayList<String> listData) {
        String[] consData = text.split("-");
            int num = Integer.parseInt(consData[1]);
            int localSize = num - listData.size();
            for (int i = 0; i <= localSize; i++) {
                listData.add(null);
            }
            if (consData[0].equals("print")) {
                System.out.println(listData.get(num));
            } else {
                listData.set(num, consData[0]);
            }
    }

}
