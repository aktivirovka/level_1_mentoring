package optional_tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

//Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
public class Optional_Task_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/../Java_Collections/src/main/resources/FileForOptionalTask_1")))
        {
            String str;
            while ((str = reader.readLine()) != null) {
                    System.out.println(str);
                    list.add(str);
            }
        } catch (IOException | NullPointerException exc) {
            System.out.println("Error " + exc);
        }

        if (list.size() == 0) {
            System.out.println("File is empty.");
            System.exit(0);
        }

        list.sort((Comparator<String>) (o1, o2) -> Integer.compare(o1.length(), o2.length()));
        list.forEach(System.out::println);

    }
}



