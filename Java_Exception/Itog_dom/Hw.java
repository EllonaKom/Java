package Java_Exception.Itog_dom;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Hw {
     static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
   
    String data = scanner.nextLine();
    String[] arr = data.split(" ");
    System.out.println(Arrays.toString(arr));
    //Фамилия Имя Отчество дата _ рождения номер _ телефона пол
        
    if (arr.length != 6) throw new IllegalArgumentException(" Неверные данные ");
    if (arr[3].length() != 10 && !arr[3].equals(".")) throw new IllegalArgumentException(" Формат  даты  указан неверно: **.**.**** "); 
    if (arr[4].length() != 7) throw new IllegalArgumentException(" Номер телефона д.б. семизначным ");
    if (!arr[5].equals("m") && !arr[5].equals("f")) throw new IllegalArgumentException(" Пол указан неверно ");
    // String surname = arr[0];; 
    // String name  = arr[1];
    // String middleName = arr[2];
    // String ddata = arr[3];
    // String phone = arr[4];
    // String gender = arr[5];
   
   
    //Person p = new Person("Petrov","Petr","Palysh","12.12.2002","7777777","m");
    Person p = new Person(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
    System.out.println(p.toString());

    String fn = arr[0] + ".txt";
    try (FileWriter fr = new FileWriter(fn,true);){
        fr.write(p.toString() + "\n");
        fr.flush();
    } catch (IOException e) {
        
        e.printStackTrace();
}
}
}