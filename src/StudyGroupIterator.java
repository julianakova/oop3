import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student> {
    private final List<Student> students;

    public int count;

    public StudyGroupIterator(List<Student> students) {
        this.students = students;
    }


    @Override
    public boolean hasNext() {
        return count < students.size();
    }

    @Override
    public Student next() {
        return students.get(count++);
    }


}