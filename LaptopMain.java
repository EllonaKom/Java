import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LaptopMain {
           public static void main(String[] args) {
          Laptop notebook1 = new Laptop("Asus  ", "4", "256 ", "Linux", "green");
          Laptop notebook2 = new Laptop("Lenovo", "8", "512", "Linux", "black");
          Laptop notebook3 = new Laptop("Lenovo", "8", "1024", "Windows", "black");
          Laptop notebook4 = new Laptop("Huawei", "16", "512", "Windows", "grey");
          Laptop notebook5 = new Laptop("Huawei", "16", "1024", "Windows", "black");
    
          Set<Laptop> notebooks = new HashSet<>(List.of(notebook1, notebook2,
                notebook3, notebook4, notebook5));
    
          Map<String, String> sel = selectCriteria();
        
          sort(sel, notebooks);
    
        //   for (Laptop laptop : notebooks) {
        //     System.out.println(laptop);
        //     System.out.println();
        //     }
    
       }
    
       public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
       // scanner.close();
        return scan;
        
        
     }
    
       public static Map<String, String> selectCriteria() {
          Map<String, String> resultCriterias = new HashMap<>();

    
             System.out.println("Вы хотите выбрать критерий? Если да введите 'y', если нет введите 'n'");
             String question = scanner();
             if (question.equals("n")) {
              System.out.println("До встречи!");
             } else {
    
                System.out.println(
                      "Введите цифру, соответствующую  критерию: \n 1 - Название \n 2 - ОЗУ \n 3 - Объем ЖД \n 4 - Операционная система \n 5 - Цвет");
                String key = scanner();
                System.out.println("Введите значения для выбранного критерия: ");
                String value = scanner();
    
                resultCriterias.put(key, value);
                System.out.println(resultCriterias);
             }
    
         
          return resultCriterias;
    
       }
    
       public static void sort(Map<String, String> criterias, Set<Laptop> notebooks) {
    
          Set<Laptop> temp = new HashSet<>(notebooks);
          for (Laptop notebook : notebooks) {
            
             for (Object pair : criterias.keySet()) {
    
                if (pair.equals("1") && !notebook.getName().equals(criterias.get(pair))) {
                   temp.remove(notebook);
                   
                }
                
                for (Object pair1 : criterias.keySet()) {
    
                   if (pair1.equals("2") && !notebook.getRam().equals(criterias.get(pair1))) {
                      temp.remove(notebook);
    
                   }
                   for (Object pair2 : criterias.keySet()) {
    
                      if (pair2.equals("3") && !notebook.getHardDisk().equals(criterias.get(pair2))) {
                         temp.remove(notebook);
    
                      }
                      for (Object pair3 : criterias.keySet()) {
    
                         if (pair3.equals("4") && !notebook.getOperSystem().equals(criterias.get(pair3))) {
                            temp.remove(notebook);
    
                         }
                         for (Object pair4 : criterias.keySet()) {
    
                            if (pair4.equals("5") && !notebook.getColor().equals(criterias.get(pair4))) {
                               temp.remove(notebook);
    
                            }
                         }
                      }
                   }
                }
             }
    
          }
    //      System.out.println(temp);
          if (temp.isEmpty()) {
             System.out.println("По введенным критериям ничего не нашлось!");
          } else {
             System.out.println("Для Вас есть предложение: \n" + temp.toString());
          }
    
       }
    
    }