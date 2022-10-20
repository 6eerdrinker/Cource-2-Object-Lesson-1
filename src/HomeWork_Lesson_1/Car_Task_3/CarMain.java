package HomeWork_Lesson_1.Car_Task_3;

public class CarMain {
    public static void main(String[] args) {
        Car lada = new Car("Лада", "Granta", 2015, 1.7, null, "Россия");
        Car audi = new Car("", "A8 50 L TDI quattro", 2020, 3.0, "черного",
                "Германия");
        Car bmw = new Car("BMW", null,2021, 3.0, "черного", "Германия");
        Car kia = new Car("KIA", "Sportage 4-го поколения", 2018, 0, "красного",
                "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 0, 1.6, "оранжевого",
                "");
        lada.car();
        audi.car();
        bmw.car();
        kia.car();
        hyundai.car();

    }
}
