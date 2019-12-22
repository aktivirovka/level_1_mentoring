//2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class JF_MainTask_2 {
    public static void main(String[] args) {
        System.out.println("Reverse order of command line arguments: ");
        for (int i = args.length-1; i >=0 ; i--) {
            System.out.println(args[i]);

        //Для запуска кода необходимо открыть cmd и перейти в соотв. каталог в Java.
            // Набрать javac имяКласса.java. Далее набрать java имя класса и (через пробел) аргументы командной строки.


        }
    }
}
