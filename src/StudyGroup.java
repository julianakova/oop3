import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private final List<Student> students;

    public StudyGroup(List<Student> students) {

        this.students = students;
    }


    @Override
    public Iterator<Student> iterator() {

        return new StudyGroupIterator(students);
    }
}