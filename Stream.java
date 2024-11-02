import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Group> {
    private List<Group> studyGroups;

    

    public Stream(List<Group> studyGroups) {
        this.studyGroups = studyGroups;
    }

    public List<Group> getstudyGroups() {
        return studyGroups;
    }
    
    public void addstudyGroups(Group group) {
        studyGroups.add(group);
    }

    public void setStudyGroups(List<Group> studyGroups) {
        this.studyGroups = studyGroups;
    }

    

    @Override
    public Iterator<Group> iterator() {
        return new StreamIterator(this);
    }

    
    public void remove(Group group) {
         studyGroups.remove(studyGroups);
     }

    

    
}


