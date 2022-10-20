package HomeWork_Lesson_1.Human_Task_2;

public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;


    Human(String name, int yearOfBirth, String town, String jobTitle) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;

    }

    void human() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Год рождения  "
                + yearOfBirth + ". Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
