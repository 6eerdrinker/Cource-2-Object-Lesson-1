package HomeWork_Lesson_1.Car_Task_3;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, int productionYear, double engineVolume, String color, String productionCountry){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionCountry = productionCountry;
        testCar();
    }
    void testCar(){
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null||color.isEmpty()) {
            this.color = "белого";}
        else {
            this.color = color;
        }

        if (productionCountry == null||productionCountry.equals("")) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }}

    void car() {
        System.out.println(brand + " " + model + ", " + productionYear + " года выпуска, " + "объем двигателя " + engineVolume +
                " л, " + color + " цвета, " + " страна сборки - " + productionCountry + ".");
    }

}
