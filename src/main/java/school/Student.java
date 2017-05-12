package school;

import java.util.Date;

/**
 * Created by Formando on 03/05/2017.
 */
public class Student extends Person{
    private int studentNumber;
    private String schoolName;

    public Student(String name, int age, int studentNumber, String schoolName) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.schoolName = schoolName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudentFileName(){
        studentNumber = 123;
        return studentNumber + getName();
    }
}
