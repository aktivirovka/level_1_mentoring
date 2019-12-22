//Ввести с консоли n - размерность матрицы a [n] [n].
// Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
// Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.

import java.util.Scanner;

public class JF_OptionalTask2_1 {
    public static void main(String[] args) {
        int sizeOfMatrix = 0;
        System.out.println("Enter a positive integer more than 1 and press Enter" + "\n" + "If you enter several numbers, only the first one will be taken");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            sizeOfMatrix = sc.nextInt();
            sc.close();
            if (sizeOfMatrix <= 1) {
                System.out.println("You entered a number less than two");
                System.exit(0);
            }
        } else {
            System.out.println("Entering number was incorrect");
            sc.close();
            System.exit(0);
        }

        int intervalOfRandomNumbers = 10;
        int[][] array = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (intervalOfRandomNumbers + 11) - intervalOfRandomNumbers);
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }

            System.out.println("\nThe largest number of increasing elements of the matrix going in a row is " + getCountOfDigitsInRow(array, true));
            System.out.println("The largest number of decreasing elements of the matrix going in a row is " + getCountOfDigitsInRow(array, false));
    }

    private static int getCountOfDigitsInRow(int[][] array, boolean isIncreasing) {

        int currentCount = 1;
        int maxCount = 0;
        int lastValue = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                boolean comparison = (isIncreasing) ? lastValue < array[i][j] : lastValue > array[i][j];

                if (comparison) {
                    currentCount++;
                } else {
                    if (currentCount >= maxCount) {
                        maxCount = currentCount;
                        currentCount = 1;
                    }
                }
                lastValue = array[i][j];
            }
        }
        return (currentCount > maxCount) ? currentCount : maxCount;
    }

}