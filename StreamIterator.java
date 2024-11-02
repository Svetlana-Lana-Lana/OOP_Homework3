import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<Group> {
    private final List<Group> groupList;
    private int count;

    public StreamIterator(Stream stream) {
        this.groupList = stream.getstudyGroups();
        count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < groupList.size();
    }

    @Override
    public Group next() {
        if (hasNext()) {
            return groupList.get(count++);
        }
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}