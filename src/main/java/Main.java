import school.Person;
import school.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Formando on 03/05/2017.
 */

public class Main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        Person person = new Person();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String date = sdf.format(new Date());
        System.out.println(date);

        Student student = new Student();
        System.out.println(student.getStudentFileName());
    }

}
