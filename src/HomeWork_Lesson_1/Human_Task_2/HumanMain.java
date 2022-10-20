package HomeWork_Lesson_1.Human_Task_2;

public class HumanMain {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", 1987, "Минск", "бренд - менеджера");
        Human anya = new Human("Аня", 1993, "Москва", "методиста образовательных программ");
        Human katya = new Human("Катя", 1994, "Калининград", "продакт - менеджера");
        Human artyom = new Human("Артем", 1995, "Москва", "директора по развитию бизнеса");
        maxim.human();
        anya.human();
        katya.human();
        artyom.human();
    }
}
