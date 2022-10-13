public class Main{
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задание 1");
        int[] total = generateRandomArray();
        int sum = 0;
        for (int j : total) {
            sum += j;
            System.out.println(j);
        }
        System.out.println();
        System.out.println("Сумма трат за месяц составила  " + sum);
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        int minimum = total[0];
        for (int i = 0; i < total.length; i++) {
            if (total[i] < minimum) {
                minimum = total[i];
            }
        }
        int maximum = total[0];
        for (int i = 0; i < total.length; i++) {
            if (total[i] > maximum) {
                maximum = total[i];
            }
        }
        System.out.println("Минимальная сумма трат  " + minimum);
        System.out.println("Максимальная сумма трат " + maximum);
        System.out.println();

        //Задача 3
        System.out.println("Задание 3");
        int day = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + day + "рублей");
        System.out.println();

        //Задача 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}