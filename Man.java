package exercises.codewars;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 17.03.2018
 */
public class Man {
    private String name;
    private int age;
    private String lastName;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Имя " + name + " Фамилия " + lastName + " Возраст " + age;
    }
}

class Test {
    public static void main(String[] args) {
        Man Vovan = new Man("Volkov", 23);
        System.out.println("" + 1 + 3);
    }
}
