package HomeWork_Lesson_1.Car_Task_1;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        Car lada = new Car();
        lada.brand = "Лада";
        lada.model = "Granta";
        lada.productionYear = 2015;
        lada.engineVolume = 1.7;
        lada.color = "желтый";
        lada.productionCountry = "Россия";

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.productionYear = 2020;
        audi.engineVolume = 3.0;
        audi.color = "черный";
        audi.productionCountry = "Германия";

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.productionYear = 2021;
        bmw.engineVolume = 3.0;
        bmw.color = "черный";
        bmw.productionCountry = "Германия";

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.productionYear = 2018;
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.productionCountry = "Южная Корея";

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.productionYear = 2016;
        hyundai.engineVolume = 1.6;
        hyundai.color = "Оранжевого";
        hyundai.productionCountry = "Южная Корея";
        lada.car();
        audi.car();
        bmw.car();
        kia.car();
        hyundai.car();

    }
}
