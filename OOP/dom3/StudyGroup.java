package OOP.dom3;

public class StudyGroup {
    private int studyGroupID;
    private String nameGroup;

    public int getStudyGroupID() {
        return studyGroupID;
    }

    public void setStudyGroupID(int studyGroupID) {
        this.studyGroupID = studyGroupID;
    }

    public StudyGroup(int studyGroupID, String nameGroup) {
        this.studyGroupID = studyGroupID;
        this.nameGroup = nameGroup;
    }

    @Override
    public String toString() {
        return "StudyGroup [ID=" + studyGroupID + ", name=" + nameGroup + "]";
    }

}