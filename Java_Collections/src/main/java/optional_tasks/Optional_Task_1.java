package optional_tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
public class Optional_Task_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/../Java_Collections/src/main/resources/FileForOptionalTask_1"))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                list.add(str);
            }
        } catch (IOException | NullPointerException exc) {
            System.out.println("Error " + exc);
            System.exit(0);
        }
        if (list.size() == 0) {
            System.out.println("File is empty.");
            System.exit(0);
        }
        System.out.println("\nReverse order of rows:\n  ");
        Collections.reverse(list);
        list.forEach(lists -> System.out.println(lists));


    }

}
