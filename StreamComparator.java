import java.util.Comparator;

public class StreamComparator implements Comparator<Group> {

    @Override
    public int compare(Group o1, Group o2) {
        int resultOfComparing = o1.getGroupId().compareTo(o2.getGroupId());
        if (resultOfComparing == 0) {
            return o1.getNumberOfStudentsInGroup().compareTo(o2.getNumberOfStudentsInGroup());
        } else {
            return resultOfComparing;
        }    
    }
}
