import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Окунов", LocalDate.of(1999, 1, 1), 3.5f));
        listStudents.add(new Student("Иванов", LocalDate.of(2000, 7, 22), 4.0f));
        listStudents.add(new Student("Ветров", LocalDate.of(2001, 12, 12), 5.0f));
        listStudents.add(new Student("Петров", LocalDate.of(2002, 9, 14), 4.8f));
        listStudents.add(new Student("Шестов", LocalDate.of(2003, 10, 9), 3.9f));
        listStudents.add(new Student("Пилтов", LocalDate.of(2004, 1, 11), 4.1f));

        StudentGroup studentGroup = new StudentGroup(listStudents);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
    }
}