//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
public class JF_MainTask_4 {
    public static void main(String[] args) {
        int sum = 0;
        int multiply = 1;
        int [] array = new int[args.length];
        for (int i = 0; i <args.length ; i++) {
            array[i] = Integer.parseInt(args[i]);
            System.out.print(array[i] + " ");
        }
        for (int number: array) {
            sum = sum + number;
            multiply = multiply*number;
        }
        System.out.println("\n" +"The sum of the arguments is " + sum);
        System.out.println("The multiplication of the arguments is " + multiply);






    }
}
