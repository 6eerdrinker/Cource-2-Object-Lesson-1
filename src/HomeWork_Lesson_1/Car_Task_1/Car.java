package HomeWork_Lesson_1.Car_Task_1;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    void car() {
        System.out.println(brand + " " + model + ", " + productionYear + " года выпуска, " + "объем двигателя " + engineVolume +
                " л, " + color + " цвета, "  + " страна сборки - " + productionCountry + ".");
    }

}
