import java.util.Scanner;
//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.
public class JF_MainTask_5 {
    public static void main(String[] args) {
        String month = null;
        System.out.println("Enter a positive integer (from 1 to 12) that corresponds to the month of the year end press Enter");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
           int numberOfMonth = sc.nextInt();
            sc.close();
            switch (numberOfMonth) {
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
                default:
                    System.out.println("You entered the number outside the 1 to 12 limit");
                    System.exit(0);
            }
            System.out.println("You chose " + month);
        } else {
            System.out.println("You entered not a number");
            sc.close();
            System.exit(0);
        }
    }
}