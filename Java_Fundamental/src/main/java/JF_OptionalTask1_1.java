//Ввести n чисел с консоли.
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

import java.util.Scanner;
//Данный код предполагает ввод только целочисленных значений
//уточнение по данному вопросу были посланы 15.11 в askautomationtraining@epam.com
public class JF_OptionalTask1_1 {
    public static void main(String[] args) {

        System.out.println("Enter several integers separated by spaces and press Enter");
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        sc.close();

        String[] arrayString = stringInput.split(" ");
        long[] arrayLong = new long[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            try {
                arrayLong[i] = Long.parseLong(arrayString[i]);
            } catch (NumberFormatException e) {
                System.out.println("Entering numbers was incorrect");
                System.exit(0);
            }
        }
        long lenghtOfTheSmallestNumber = Long.MAX_VALUE;
        long lenghtOfTheLagestNumber = 0;
        long maxNumber = 0;
        long minNumber = 0;

        for (int i = 0; i < arrayLong.length; i++) {
            long timeNumber =Math.abs(arrayLong[i]);
            long count = 0;

            do{
                timeNumber /= 10;
                count += 1;
            } while (timeNumber > 0);

            if (count > lenghtOfTheLagestNumber) {
                lenghtOfTheLagestNumber = count;
                maxNumber = arrayLong[i];
            }
            if (count < lenghtOfTheSmallestNumber) {
                lenghtOfTheSmallestNumber = count;
                minNumber = arrayLong[i];
            }
        }
        System.out.println("The first shortest integer is " + minNumber + " Its length is " + lenghtOfTheSmallestNumber);
        System.out.println("The first longest integer is " + maxNumber + " Its length is " + lenghtOfTheLagestNumber);
    }
}


