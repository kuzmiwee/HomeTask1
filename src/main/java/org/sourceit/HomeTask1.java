package org.sourceit;

import java.util.Random;

public class HomeTask1 {
    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Метод возвращает значение гипотенузы.
     * Числа должны быть больше 0. Если какое-либо значение
     * меньше 0, возращать 0.
     *
     * @param a должно быть больше 0.
     * @param b должно быть больше 0.
     * @return значение гипотенузы.
     */
    public static double findHypotenuse(double a, double b) {
        double hypotenuseTriangle;
        if ((a <= 0) || (b <= 0)) {
            return (0);
        } else {
            hypotenuseTriangle = Math.sqrt((a * a) + (b * b));
            return (hypotenuseTriangle);
        }
    }

    /**
     * Метод находит периметр треугольника.
     *
     * @param a
     * @param b
     * @param c
     * @return периметр треугольника.
     */
    public static double perimeter(double a, double b, double c) {
        double perimeterTriangle;
        perimeterTriangle = (a + b + c);
        return (perimeterTriangle);
    }

    /**
     * Метод находит площадь прямоугольного треугольника.
     * Значения должны быть больше 0.
     *
     * @param a
     * @param b
     * @return площадь треугольника.
     */
    public static double area(double a, double b) {
        double areaTriangle;
        if ((a <= 0) || (b <= 0)) {
            areaTriangle = ((a * b) / 2);
            return (areaTriangle);
        } else return (0);
    }

    /**
     * Генерирует случайное число в заданных пределах.
     *
     * @param min минимальное значение.
     * @param max саксимальное значение.
     * @return сгенерированное число.
     */
    public static int generateNumberFromRange(int min, int max) {
        int randomInterger;
        Random r = new Random();
        randomInterger = (r.nextInt(max) + min);
        return (randomInterger);
    }

    /**
     * Считает сумму цифр числа.
     * Число может быть любое,
     * как и положительное так и отрицательное.
     *
     * @param number
     * @return сумма цифр.
     */
    public static long calculateSum(long number) {
        long numberLocal = number;
        long sum = 0;
        while (numberLocal > 0) {
            sum += number % 10;
            numberLocal = numberLocal / 10;
        }
        return (sum);
    }

    /**
     * Посчитайте элемент последовательности Фибоначчи.
     * Первый и второй члены последовательности равны единицам,
     * а каждый следующий сумме двух предыдущих.
     *
     * @param till до какого элемента считать.
     * @return элемент последовательности.
     */
    public static int fibonacci(int till) {
        int[] fibonacciArray = new int[till];
        int i = 2;
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;
        while (i < till) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            i++;
        }
        return (fibonacciArray[till - 1]);
    }

    /**
     * "Счастливым" считается билетик у которого
     * сумма первых трёх цифр номера равна сумме последних
     * трёх цифр, как, например, в билетах с номерами 003102 или 567576.
     *
     * @param ticket должен быть от 1 до 999999
     * @return является ли билет счастливым.
     */
    public static boolean isHappy(long ticket) {
        long ticketLocal = ticket, sumLeft = 0, sumRight = 0;
        int i = 0;
        if ((ticketLocal >=1 ) && (ticketLocal <= 999999)) {
            while (ticketLocal > 0) {
                while (i<3) {
                    sumRight += ticketLocal % 10;
                    ticketLocal = ticketLocal / 10;
                    i++;
                }
                sumLeft += ticketLocal % 10;
                ticketLocal = ticketLocal / 10;
            }
            return (sumLeft == sumRight);
        }
        return false;
    }
}
