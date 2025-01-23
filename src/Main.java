import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        printThreeWords(); // 1
        System.out.println();

        checkSumSign(); // 2
        System.out.println();

        printColor(); // 3
        System.out.println();

        compareNumbers(); // 4
        System.out.println();

        System.out.println(checkSum(9, 2)); // 5
        System.out.println();

        checkValuePositive(0); // 6
        System.out.println();

        System.out.println(checkNumber(-1)); // 7
        System.out.println();

        printCountStrings("HI", 5); // 8
        System.out.println();

        System.out.println(checkYearsLeap()); // 9
        System.out.println();

        replaceValueArray(); // 10
        System.out.println();

        fillArray(); // 11
        System.out.println();

        multiplyArray(); // 12
        System.out.println();

        replacDiagonalArray(); // 13
        System.out.println();

        System.out.println(Arrays.toString(returnArray(5, 3))); // 14


    }

    public static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple");
    }

    public static void checkSumSign() {
        Random random = new Random();

        int a = random.nextInt(-50, 50);
        int b = random.nextInt(-50, 50);
        int sum = a + b;

        System.out.println((sum >= 0) ? "Сумма положительная" : "Сумма отрицательная");

    }

    public static void printColor() {
        Random random = new Random();

        int value = random.nextInt(-100, 200);

        if (value <= 0) System.out.println("Красный");
        else if (value > 100) System.out.println("Зеленый");
        else System.out.println("Желтый");
    }

    public static void compareNumbers() {
        Random random = new Random();

        int a = random.nextInt();
        int b = random.nextInt();

        System.out.println((a >= b) ? "a >= b" : "a < b");
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;

        return (sum > 10 && sum <= 20);
    }

    public static void checkValuePositive(int a) {
        System.out.println((a >= 0) ? "Положительное" : "Отрицательное");
    }

    public static boolean checkNumber(int a) {
        return (a < 0) ? true : false;
    }

    public static void printCountStrings(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean checkYearsLeap() {

        LocalDate currentData = LocalDate.now();
        int year = currentData.getYear();

        if (year % 4 == 0) if (year % 100 != 0 || year % 400 == 0) return true;

        return false;
    }

    public static void replaceValueArray() {
        Random random = new Random();

        int[] arr = new int[random.nextInt(1, 21)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 2);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void multiplyArray() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i] * 2 : arr[i];
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void replacDiagonalArray() {
        Random random = new Random();

        int value = random.nextInt(2, 11);

        int[][] matrix = new int[value][value];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] returnArray(int len, int initialValue) {

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}