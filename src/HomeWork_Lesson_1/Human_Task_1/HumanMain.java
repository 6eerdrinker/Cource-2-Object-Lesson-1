package HomeWork_Lesson_1.Human_Task_1;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human();

        Human maxim = new Human();
        maxim.name = "Максим";
        maxim.town = "Минск";
        maxim.jobTitle = "бренд - менеджера";
        maxim.yearOfBirth = 1987;

        Human anya = new Human();
        anya.name = "Аня";
        anya.town = "Москва";
        anya.jobTitle = "методиста образовательных программ";
        anya.yearOfBirth = 1993;

        Human katya = new Human();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.jobTitle = "продакт - менеджера";
        katya.yearOfBirth = 1994;

        Human atryom = new Human();
        atryom.name = "Артем";
        atryom.town = "Москва";
        atryom.jobTitle = "директора по развитию бизнеса";
        atryom.yearOfBirth = 1995;
        maxim.human();
        anya.human();
        katya.human();
        atryom.human();
    }
}
