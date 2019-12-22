import java.util.Scanner;
//1.Приветствовать любого пользователя при вводе его имени через командную строку.
public class JF_MainTask_1 {
    public static void main(String[] args)  {
        String name;
        System.out.println("Enter your name and press Enter");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello " + name);
        sc.close();

    }
}
