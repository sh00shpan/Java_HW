package DZ_train;

// Вывести все простые числа от 1 до 1000

public class Urok_1_dz_2 {

    public static void main(String[] args) {

        int limit = 30;

        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}

// 2   3   4   5   6   7   8   9   10  11  12  13  14  15 | i = 10


// 2    | 10 / 2 = 5 |  isPrime = false; -> break


// i = 11

// 2 | 11 % 2 = 1

// 3 | 11 % 3 = 2

// 4 | 11
