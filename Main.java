import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Group group1 = new Group(23, 50);
        Group group2 = new Group(56, 53);
        Group group3 = new Group(45, 60);

        List<Group> studyGroups = new ArrayList<>();
        studyGroups.add(group1);
        studyGroups.add(group2);
        studyGroups.add(group3);
        

        Stream stream = new Stream(studyGroups);
        StreamIterator iterator = new StreamIterator(stream);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        StreamService service = new StreamService(stream);
        for (Group group : service.getSorted()){
            System.out.println(group);
        }
    }
}
