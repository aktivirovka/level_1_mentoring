package main_task;

import main_task.сlassification_of_vegetables.Vegetables;

import java.util.*;

public class Salad {
    private String name;
    private List<Vegetables> vegetablesForNewSalad;
    Map<String, Double> map;


    public Salad(String name, List<Vegetables> vegetablesForNewSalad) {
        this.name = name;
        this.vegetablesForNewSalad = vegetablesForNewSalad;
    }

    void recalculationOfKcalDependingOnGramsOfVegetables() {
        map = new HashMap<>();
        for (Vegetables vegetables : vegetablesForNewSalad) {
            String keyForMap = vegetables.getClass().getSimpleName();
            double gramForSalad = vegetables.getGrams();
            double kcalPer100G = vegetables.getKcalPer100G();
            double valueForMap = gramForSalad * kcalPer100G / 100;
            System.out.println(valueForMap);
            map.put(keyForMap, valueForMap);
        }
    }

    double determineTotalCaloriesOfSalad() {
        double kcal = 0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            double value = entry.getValue();
            kcal += value;
        }
        return kcal;
    }

    List<String> getVegetablesWithinCalorieRange(int calorieMin, int calorieMax) {
        List<String> list = new ArrayList<>();
        for (Vegetables vegetables : vegetablesForNewSalad) {
            String keyForMap = vegetables.getClass().getSimpleName();
            double kcalPer100G = vegetables.getKcalPer100G();
            if (kcalPer100G >= calorieMin && kcalPer100G <= calorieMax) {
                list.add(keyForMap);
            }
        }
        return list;
    }

    List<String> sortVegetablesByName() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        Collections.sort(list);
        return list;
    }

    public String getName() {
        return name;
    }
}
