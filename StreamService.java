import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream studyGroups;

    public StreamService(Stream studyGroups) {
        this.studyGroups = studyGroups;
    }

    public Stream getstudyGroups() {
        return studyGroups;
    }
    public void removeStudent(Group group) {
        for (Group groupItem : studyGroups){
            if(group.equals(groupItem)){
                studyGroups.remove(group);
            }
        }
    }
    public List<Group> getSorted(){
        List<Group> studentList = new ArrayList<>(studyGroups.getstudyGroups());
        studentList.sort(new StreamComparator());
        return studentList;
    }
}