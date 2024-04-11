import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup>{
    private final List<StudyGroup> studyGroups;

    public Stream(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }


    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }

    public  int countGroup() {
        return studyGroups.size();
    }
}
