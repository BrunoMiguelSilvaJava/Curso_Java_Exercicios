package school;

import java.util.Date;

/**
 * Created by Formando on 03/05/2017.
 */
public class Person {
    private static int nPersons = 0;

    private String name;
    private int age;
    private int discount;

    public Person(String name, int age) {
        nPersons++;
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getnPersons() {
        return nPersons;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
