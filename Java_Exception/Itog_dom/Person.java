package Java_Exception.Itog_dom;

public class Person {
    String surname; 
    String name;
    String middleName;
    String ddata;
    String phone;
    String gender;

    
    public Person(String surname, String name, String middleName, String ddata, String phone, String gender) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.ddata = ddata;
        this.phone = phone;
        this.gender = gender;
    }


    @Override
    public String toString() {
        
        return String.format("<%s><%s><%s><%s><%s><%s>",surname,name,middleName,ddata,phone,gender);
    }
}
