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

        if (value <= 0)
            System.out.println("Красный");
        else if (value > 100)
            System.out.println("Зеленый");
        else
            System.out.println("Желтый");
    }

    public static void compareNumbers() {
        Random random = new Random();

        int a = random.nextInt();
        int b = random.nextInt();

        System.out.println((a >= b) ? "a >= b" : "a < b");
    }

    public static Boolean checkSum(int a, int b) {
        int sum = a + b;

        return (sum > 10 && sum <= 20);
    }

    public static void checkValuePositive(int a) {
        System.out.println((a >= 0) ? "Положительное" : "Отрицательное");
    }

    public static Boolean checkNumber(int a) {
        return (a < 0) ? true : false;
    }

    public static void printCountStrings(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }



}