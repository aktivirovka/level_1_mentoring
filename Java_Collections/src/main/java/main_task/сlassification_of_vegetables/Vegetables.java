package main_task.сlassification_of_vegetables;


abstract public class Vegetables {
    private double grams;
    protected double kcalPer100G;

    public Vegetables(double grams) {
        if (grams < 0) {
            System.out.println("You can't create vegetable with negative indicators of weight");
            System.exit(0);
        }
        this.grams = grams;
    }
    public double getGrams() {
        return grams;
    }

    public double getKcalPer100G() {
        return kcalPer100G;
    }
}
