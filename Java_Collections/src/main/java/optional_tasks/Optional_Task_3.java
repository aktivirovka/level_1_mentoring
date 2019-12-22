package optional_tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только регистром букв,
// считать одинаковыми. Использовать класс HashSet.
public class Optional_Task_3 {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/../Java_Collections/src/main/resources/FileForOptionalTask_3")))
        {
            String str;
                while ((str = br.readLine()) != null) {
                    if (str.isEmpty()) {
                        throw new NullPointerException();
                    }
                    System.out.println(str);
                    text.add(str);
            }
        } catch (IOException | NullPointerException exc) {
            System.out.println("Error" + exc);
            System.exit(0);
        }
        if (text.size() == 0) {
            System.out.println("File is empty.");
            System.exit(0);
        }
        Set<String> wordsSet = new HashSet<>();
        for (int i = 0; i < text.size(); i++) {
            String[] arrayWords = text.get(i).split("[ .]");
            for (int j = 0; j < arrayWords.length; j++) {
                wordsSet.add(arrayWords[j].toLowerCase());
            }
        }
        System.out.println("\nAll different words from text:");
        wordsSet.forEach(set -> System.out.print(set + " "));
    }
}
