//Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

import java.util.ArrayList;
import java.util.Scanner;

//Задача сделана с условием, что числа, состоят из 2 и более цифр
//уточнение по данному вопросу были посланы 16.11 в askautomationtraining@epam.com
public class JF_OptionalTask1_2 {
    public static void main(String[] args) {

        System.out.println("Enter several two-and more-digit numbers integers separated by spaces and press Enter");
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        sc.close();

        String[] arrayString = stringInput.split(" ");
        int[] arrayInt = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            try {
                arrayInt[i] = Integer.parseInt(arrayString[i]);
            } catch (NumberFormatException e) {
                System.out.println("Entering numbers was incorrect. " + "\nError: " + e);
                System.exit(0);
            }
        }
        if (isNumbersConsistOfTwoAndMoreDigits(arrayInt)) {
            findTheFirstNumberConsistingOfDifferentDigits(arrayInt);
        }
    }

    private static boolean isNumbersConsistOfTwoAndMoreDigits(int[] array) {
        for (int value : array) {
            if (Math.abs(value) < 10) {
                System.out.println("You entered a single-digit number");
                return false;
            }
        }
        return true;
    }
    private static void findTheFirstNumberConsistingOfDifferentDigits(int[] array){
        for (int i = 0; i < array.length; i++) {
            ArrayList<Integer> digitListOfEveryNumberFromArrayInt = new ArrayList<>();
            int currentValue = array[i];
            while (Math.abs(currentValue) > 0) {
                int remainderOfDivision = currentValue % 10;
                digitListOfEveryNumberFromArrayInt.add(remainderOfDivision);
                currentValue /= 10;
            }

            int countOfUnequalDigits = 0;
            for (int j = 1; j < digitListOfEveryNumberFromArrayInt.size(); j++) {
                if (digitListOfEveryNumberFromArrayInt.get(0).equals(digitListOfEveryNumberFromArrayInt.get(j))) {
                    break;
                } else countOfUnequalDigits++;
            }
            if ((digitListOfEveryNumberFromArrayInt.size() - 1) == countOfUnequalDigits) {
                System.out.println("The first number consisting of different digits is " + array[i]);
                return;
            }
        }

    }
}
