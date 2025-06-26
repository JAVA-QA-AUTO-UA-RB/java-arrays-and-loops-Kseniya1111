import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] secretCode = {2, 4, 6, 8, 10};
        boolean IsPasswordCorrect;


            System.out.println("Старий Замок приховує магічний Рунний Код, який складається з 5 чисел.Невелика підказка-кожне з них можна поділити на 2");

            do {
                IsPasswordCorrect = true;
                System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");

                for (int i = 0; i < secretCode.length; i++) {
                    int userInput = scanner.nextInt();
                    if (userInput != secretCode[i]) {
                        IsPasswordCorrect = false;
                    }
                }

                if (!IsPasswordCorrect) {
                    System.out.println("Невірний код. Спробуйте ще.\n");
                }

                scanner.nextLine(); // очистить после nextInt()

            } while (!IsPasswordCorrect);

            System.out.println("Замок відкрито! Заходьте всередину.");


            int[] magicSum = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
            int sum = 0;
            System.out.println("А зараз тобі потрібно порахувати суму всіх чисел на секретній дошці:");
            System.out.println("Натисни Enter, щоб побачити результат...");
            scanner.nextLine();
            for (int i = 0; i < magicSum.length; i++) {
                sum += magicSum[i];
            }
            System.out.println("Сума магічних чисел: " + sum);
            System.out.println("Натисни Enter, щоб продовжити...");
            scanner.nextLine();

            int[] magicAttacks = {8, 16, 24, 32, 40};
            boolean AllNumbersAreCorrect = true;
            for (int Attack : magicAttacks) {
                if (Attack % 2 != 0) {
                    AllNumbersAreCorrect = false;
                    break;
                }


            }
            if (AllNumbersAreCorrect) {
                System.out.println("Атаки парні! Захист активовано!");
            } else {
                System.out.println("Увага! Непарна атака!");


            }

        }

}