package OOP.dom3;
import java.util.ArrayList;
import java.util.List;

// Создать класс Поток содержащий в себе список УчебныхГрупп и
// реализующий интерфейс Iterator
// � Создать класс StreamComparator, реализующий сравнение количества групп
// входящих в Поток
// � Создать класс ПотокСервис, добавив в него метод сортировки списка
// потоков, используя созданный StreamComparator
// � Модифицировать класс Контроллер, добавив в него созданный сервис
// � Модифицировать класс Контроллер, добавив в него метод сортирующий
// список потоков, путем вызова созданного сервиса

public class Main {
    public static void main(String[] args) {
        StudyGroup studyGroup1 = new StudyGroup(1, "Группа_1");
        StudyGroup studyGroup2 = new StudyGroup(2, "Группа_2");
        StudyGroup studyGroup3 = new StudyGroup(3, "Группа_3");
        StudyGroup studyGroup4 = new StudyGroup(4, "Группа_4");
        StudyGroup studyGroup5 = new StudyGroup(5, "Группа_5");
        StudyGroup studyGroup6 = new StudyGroup(6, "Группа_6");
        StudyGroup studyGroup7 = new StudyGroup(7, "Группа_7");
        StudyGroup studyGroup8 = new StudyGroup(8, "Группа_8");
        List<StudyGroup> groupAllList = new ArrayList<>();
        groupAllList.add(studyGroup1);
        groupAllList.add(studyGroup2);
        groupAllList.add(studyGroup3);
        groupAllList.add(studyGroup4);
        groupAllList.add(studyGroup5);
        groupAllList.add(studyGroup6);
        groupAllList.add(studyGroup7);
        groupAllList.add(studyGroup8);

        List<StudyGroup> groupList = new ArrayList<>();

        Stream stream1 = new Stream(1, groupList);
        stream1.addStudyGroup(studyGroup1);
        stream1.addStudyGroup(studyGroup2);
        stream1.addStudyGroup(studyGroup5);
        Stream stream2 = new Stream(2, groupList);

        stream2.addStudyGroup(studyGroup3);
        stream2.addStudyGroup(studyGroup4);
        stream2.addStudyGroup(studyGroup6);
        stream2.addStudyGroup(studyGroup7);
        Stream stream3 = new Stream(3, groupList);
        stream3.addStudyGroup(studyGroup8);

        java.util.Iterator<StudyGroup> iterator = groupAllList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        System.out.println();
        List<Stream> streams = List.of(stream3, stream1, stream2);

        for (Stream stream : streams) {
            System.out.println(stream);

        }
    }
}