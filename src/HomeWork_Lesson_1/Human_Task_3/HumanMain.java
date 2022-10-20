package HomeWork_Lesson_1.Human_Task_3;

public class HumanMain {
    public static void main(String[] args) {
        Human maxim = new Human("", 1987, "Минск", "бренд - менеджера");
        Human anya = new Human("Аня", -1993, "Москва", "методиста образовательных программ");
        Human katya = new Human("Катя", 1994, "Калининград", null);
        Human artyom = new Human("Артем", 1995, "", "директора по развитию бизнеса");
        maxim.human();
        anya.human();
        katya.human();
        artyom.human();
    }
}
