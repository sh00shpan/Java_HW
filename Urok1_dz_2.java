package DZ_train;
//Реализовать простой калькулятор

import java.util.Scanner;

public class Urok1_dz_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 число");
        double num_1 = scanner.nextDouble();

        System.out.println("Введите 2 число");
        double num_2 = scanner.nextDouble();

        System.out.println("Введите операцию + - / *");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num_1 + num_2;
                break;

            case '-':
                result = num_1 - num_2;
                break;

            case '/':
                result = num_1 / num_2;
                break;

            case '*':
                result = num_1 * num_2;
                break;

            default:
                System.out.println("Неверный оператор");
                return;
        }

        System.out.println(num_1 + " " + operator + " " + num_2 + " = " + result);
    }

}
