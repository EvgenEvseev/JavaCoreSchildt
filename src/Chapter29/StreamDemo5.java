package Chapter29;
import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail{
    String name;
    String phonenum;
    String email;
    NamePhoneEmail(String n,String p,String e){
        name=n;
        phonenum=p;
        email=e;
    }
}

class NamePhone{
    String name;
    String phonenum;
    NamePhone(String n, String p){
        name=n;
        phonenum=p;
    }
}

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail>myList=new ArrayList<>();
        myList.add(new NamePhoneEmail("Jerry","555-55-55","Jerry223@mail.ru"));
        myList.add(new NamePhoneEmail("Marty","999-99-99","MartyDogHot@mail.ru"));
        myList.add(new NamePhoneEmail("Sam","777-77-77","SamNickleback666@mail.ru"));
        System.out.println("Исходные элементы myList ");
        myList.stream().forEach((a)->{
            System.out.println(a.name+" "+a.phonenum+" "+a.email);
        });
        System.out.println();

        Stream<NamePhone>nameAndPhone = myList.stream().map((a)->new NamePhone(a.name,a.phonenum));
        System.out.println("Список имен и телефонов - ");
        nameAndPhone.forEach((a)->{
            System.out.println(a.name+" "+a.phonenum);
        });
    }
}
