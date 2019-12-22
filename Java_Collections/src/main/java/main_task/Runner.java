package main_task;
import main_task.сlassification_of_vegetables.*;
import main_task.сlassification_of_vegetables.bulbous.Garlic;
import main_task.сlassification_of_vegetables.pumpkin.Cucumber;
import main_task.сlassification_of_vegetables.rootvegetables.Carrot;
import main_task.сlassification_of_vegetables.rootvegetables.Beet;

import java.util.Arrays;
import java.util.List;

//Определить иерархию овощей. Сделать салат. Подсчитать калорийность. Провести сортировку овощей для салата на основе
// одного из параметров. Найти овощи в салате, соответствующие заданному диапазону калорийности.
public class Runner {
    private static List<Vegetables> vegetablesForNewSalad = Arrays.asList(
            new Beet(150d),
            new Carrot(90d),
            new Cucumber(80d),
            new Garlic(10d)
    );

    public static void main(String[] args) {
        int calorieMin = 20;
        int calorieMax = 100;

        Salad salad = new Salad("Lightness", vegetablesForNewSalad);
        salad.recalculationOfKcalDependingOnGramsOfVegetables();

        System.out.println("The total caloric content of the salad '" + salad.getName() + "' is " +
                salad.determineTotalCaloriesOfSalad() + " kcal");

        List<String> list = salad.getVegetablesWithinCalorieRange(calorieMin, calorieMax);
        if (list.size() > 0){
            System.out.print("List of vegetables in the calorie range per 100g from " + calorieMin +" to "
                    + calorieMax + " kcal is: ");
            list.forEach(value -> System.out.print(value + " "));
        }else {
            System.out.println("List of vegetables in the calorie range per 100g from " + calorieMin +" to "
                    + calorieMax + " kcal is empty");
        }
        list = salad.sortVegetablesByName();
        System.out.print("\nSorting vegetables of salad in alphabetical order: ");
        list.forEach(value -> System.out.print(value + " "));

    }
}
