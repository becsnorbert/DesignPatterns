package decorator;

// Kávékeverék osztály.
public abstract class Beverage {
    //Szükségünk lesz a leírásra, hogy mit tartalmaz.
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    // Illetve egy árra
    public abstract double cost();
}
