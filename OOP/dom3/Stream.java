package OOP.dom3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudyGroup> {
    private int streamNamber;
    private List<StudyGroup> groupList;

    public int getStreamNamber() {
        return streamNamber;
    }

    public void setStreamNamber(int streamNamber) {
        this.streamNamber = streamNamber;
    }


    private int counter;

    public Stream(int streamNamber, List<StudyGroup> groupList) {
        this.streamNamber = streamNamber;
        this.groupList =  new ArrayList<StudyGroup>();;
    }

    public List<StudyGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudyGroup> groupList) {
        this.groupList = groupList;
    }

    public void addStudyGroup(StudyGroup group) {
        groupList.add(group);

    }
    
    
    @Override
    public boolean hasNext() {
        return counter < groupList.size();

    }

    @Override
    public StudyGroup next() {
        if (hasNext()) {
            return groupList.get(counter++);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Stream №" + streamNamber + ":" +groupList ;
    }

}