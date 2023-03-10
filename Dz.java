
import java.util.ArrayList;
import java.util.Arrays;

public class Dz {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 4));
        System.out.println(isPositive(5));
        printString("null ", 3);
        System.out.println(isLeapYear(25));
        System.out.println(Arrays.toString(createArray(5, 4)));

        createBinArr();
        multMass();
        marix(7);
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int sum = a + b;
        if (10 > sum | sum > 20) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x * 2 > x) {
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        // for (int i = 0; i < repeat; i++) {
        //     System.out.println(source);
        // }
        System.out.println(source.repeat(repeat));
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year % 4 == 0 | year % 400 == 0 & year % 100 != 0) {
            return true;
        }
        return false;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initalValue;
        }
        return arr;
    }


    private static void createBinArr(){
        //  1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        //  * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
        //  * заменить 0 на 1, 1 на 0;

        int[] binArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for(int i = 0; i < binArr.length; i++){
            if (binArr[i] == 1){
                binArr[i] = 0;
            }
            else{
                binArr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(binArr));
    }

    public static void multMass() {
        // * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
        // * циклом, и числа меньшие 6 умножить на 2;
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void marix(int arg) {

        //  * 3. Создать квадратный двумерный целочисленный массив (количество строк и
        //  * столбцов одинаковое),
        //  * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
        //  * только одну из диагоналей, если обе сложно).
        //  * Определить элементы одной из диагоналей можно по следующему принципу: индексы
        //  * таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        //  * * Также заполнить элементы побочной диагонали

        int[][] arr = new int [arg] [arg];
        for (int k = 0; k < arr.length; k++) {
            for (int k2 = 0; k2 < arr.length; k2++) {
                if (arr[k] == arr[k2] | arr[k2] == arr[arr.length - k - 1]) {
                    arr[k][k2] = 1;
                }
                System.out.printf("%d ", arr[k][k2]);
            }
            System.out.println();
        }

    }

}

