package Home_Work;

import java.util.Scanner;

public class Dz2_1 {

// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет
// строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b')
// -> "ababab"

    public static void main() {

        System.out.println("Длина строки: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Символ 1: ");
        Scanner sc1 = new Scanner(System.in);
        String c1 = sc1.nextLine();
        System.out.println("Символ 2: ");
        Scanner sc2 = new Scanner(System.in);
        String c2 = sc2.nextLine();
        sc.close();
        sc1.close();
        sc2.close();

        System.out.println(strConcat(N, c1, c2));
    }

    static String strConcat(int arg, String c1, String c2) {

        StringBuffer res = new StringBuffer(c1);
        while (res.length() != arg) {
            res.append(c2);
            if (res.length() != arg ) {
                res.append(c1);

            }
        }
        return res.toString();
    }
}