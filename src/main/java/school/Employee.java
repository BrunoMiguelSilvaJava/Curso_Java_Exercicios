package school;

import java.util.Date;

/**
 * Created by Formando on 12/05/2017.
 */
public class Employee extends Person {
    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void writeOutput() {
        System.out.println("Name = " + getName());
        System.out.println("Age = " + getAge());
        System.out.println("Company Name = " + company);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(
                String.format("Company Name: %s",
                        this.company));
    }
}
