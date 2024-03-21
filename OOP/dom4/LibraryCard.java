package OOP.dom4;
import java.util.ArrayList;

public class LibraryCard <K, V> { // K number, V listinfo
    private K number;

    public LibraryCard(K number) {
    this.number = number;
    }
    private ArrayList<V> listInfo = new ArrayList<>();


    public ArrayList<V> getListInfo() {
        return listInfo;
        }
        
        public void setListInfo(V info) {
        listInfo.add(info);
        }
        
        @Override
        public String toString() {
        return " №{ " + number +
        " info=  " + listInfo +
        '}';
        }
        }