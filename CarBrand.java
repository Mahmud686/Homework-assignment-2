
import java.util.Scanner;

public class CarBrand {
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

        // Take user input for the brand name
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the brand name: ");
        String brand = s.nextLine();

        // Display list of cars of the given brand
        displayCars(cars, brand);
    }

    public static void displayCars(Car[] cars, String brand) {
        System.out.println("Cars of brand " + brand + ":");
        boolean get = false;
        for (Car c : cars) {
            if (c.getMake().equalsIgnoreCase(brand)) {
                get = true;
                Car.display(c);
            }
        }

        if (!get) {
            System.out.println("No cars found  " + brand);
        }
    }

   
}