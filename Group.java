public class Group implements Comparable<Group> {
    
    private Integer groupId;
    private Integer numberOfStudentsInGroup;

    public Group(Integer groupId, Integer numberOfStudentsInGroup) {
        this.groupId = groupId;
        this.numberOfStudentsInGroup = numberOfStudentsInGroup;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getNumberOfStudentsInGroup() {
        return numberOfStudentsInGroup;
    }

    public void setNumberOfStudentsInGroup(Integer numberOfStudentsInGroup) {
        this.numberOfStudentsInGroup = numberOfStudentsInGroup;
    }

    @Override
    public String toString() {
        return "Группа [ Id группы = " + groupId + ", количество студенов в группе = " + numberOfStudentsInGroup + "]";
    }
    
    @Override
    public int compareTo(Group o) {
        return this.groupId.compareTo(o.groupId);
    }
}
