package HomeWork_Lesson_1.Human_Task_3;

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
        testHuman();
    }

    void testHuman(){
        if (name == null|| name.isEmpty()) {
            this.name = "Информация не указана!!!";
        } else {
            this.name = name;
        }
        if (yearOfBirth <= 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);

        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана!!!";
        }else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана!!!";
        } else {
            this.jobTitle = jobTitle;
        }
    }
    void human() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Год рождения  "
                + yearOfBirth + ". Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
