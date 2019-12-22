import java.util.Scanner;

//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class JF_MainTask_3 {
    public static void main(String[] args) {
        int randomNumber = 0;

        System.out.println("Enter the number of random numbers and press Enter");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            randomNumber = sc.nextInt();
            if (randomNumber <= 0) {
                System.out.println("You entered a negative number or zero");
                sc.close();
                System.exit(0);
            }
        } else {
            System.out.println("You entered not an integer");
            sc.close();
            System.exit(0);
        }

        System.out.println("Representing random numbers without a new line: ");
        //создание генерации случайных чисел от 0 до 10 в заданном диапазоне количества случайных чисел
        int[] array = new int[randomNumber];
        for (int i = 0; i < randomNumber; i++) {
            int random = (int) (Math.random() * 11);
            array[i] = random;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + "Representing random numbers with a new line");
        for (int number : array) {
            System.out.println(number);
        }
    }
}
