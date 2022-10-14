public class Main{
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
        public static void main (String[]args){
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
            int mininumArrayElement = total[0];
            for (int i = 0; i < total.length; i++) {
                if (total[i] < mininumArrayElement) {
                    mininumArrayElement = total[i];
                }
            }
            int maximumArrayElement = total[0];
            for (int i = 0; i < total.length; i++) {
                if (total[i] > maximumArrayElement) {
                    maximumArrayElement = total[i];
                }
            }
            System.out.println("Минимальная сумма трат  " + mininumArrayElement);
            System.out.println("Максимальная сумма трат " + maximumArrayElement);
            System.out.println();

            //Задача 3
            System.out.println("Задание 3");
            int averageValueForTheMonth = sum / 30;
            System.out.printf("Средняя сумма трат за месяц составила  " + averageValueForTheMonth + "рублей");
            System.out.println();

            //Задача 4
            System.out.println("Задание 4");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
    }