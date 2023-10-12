
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mahmu
 */
public class CarPrice {
    public static void main(String[] args) {
        // Create an array of Car objects
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2018, "Blue", 25000.0, "ABC123"),
            new Car(2, "Honda", "Civic", 2019, "Red", 22000.0, "XYZ789"),
            new Car(3, "Ford", "Fusion", 2017, "Silver", 20000.0, "PQR456"),
            new Car(4, "Toyota", "Corolla", 2015, "Black", 18000.0, "DEF456"),
            new Car(5, "Ford", "Mustang", 2020, "Yellow", 35000.0, "GHI789"),
            new Car(6, "Chevrolet", "Malibu", 2016, "White", 23000.0, "JKL456"),
            new Car(7, "Nissan", "Altima", 2021, "Gray", 28000.0, "MNO789")
        };

        // Take user input for the year of manufacture and price
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = s.nextInt();
        System.out.print("Enter the price: ");
        double Price = s.nextDouble();

        // Display list of cars of the given year with price higher than the specified one
        displayCarPrice(cars, year, Price);
    }

    private static void displayCarPrice(Car[] cars, int year, double Price) {
        System.out.println("Cars of year " + year + " with price higher than" + Price + ":");
        boolean found = false;
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > Price) {
                found = true;
                Car.display(car);
            }
        }

        if (!found) {
            System.out.println("No cars found for year " + year + " with price higher than" +Price + ".");
        }
    }

 
}




