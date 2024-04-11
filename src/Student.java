import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {
    /*- Создать класс СтудентКомпаратор реализующий интерфейс Comparator
- Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)*/


    private String name;
    private Integer age;

    private String stream;


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    public String getStream() {
        return stream;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", stream='" + getStream() + '\'' +
                '}' + "\n";
    }

    public Student(String name, int age, String stream) {
        this.name = name;
        this.age = age;
        this.stream = stream;

    }

    @Override
    public int compareTo(Student o) {
        int nameComparison = name.compareTo(o.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return age.compareTo(o.getAge());
    }
}