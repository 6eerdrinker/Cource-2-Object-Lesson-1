package HomeWork_Lesson_1.Car_Task_2;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, int productionYear, double engineVolume, String color, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    void car() {
        System.out.println(brand + " " + model + ", " + productionYear + " года выпуска, " + "объем двигателя " + engineVolume +
                " л, " + color + " цвета, "  + " страна сборки - " + productionCountry + ".");
    }

}
