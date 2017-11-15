package Chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail2{
    String name;
    String phonenum;
    String email;
    NamePhoneEmail2(String n,String p,String e){
        name=n;
        phonenum=p;
        email=e;
    }
}

class NamePhone2{
    String name;
    String phonenum;
    NamePhone2(String n, String p){
        name=n;
        phonenum=p;
    }
}


public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList=new ArrayList<>();
        myList.add(new NamePhoneEmail("Jerry","555-55-55","Jerry223@mail.ru"));
        myList.add(new NamePhoneEmail("Marty","999-99-99","MartyDogHot@mail.ru"));
        myList.add(new NamePhoneEmail("Sam","777-77-77","SamNickleback666@mail.ru"));

        Stream<NamePhone2>nameandphone=myList.stream().map((a)->new NamePhone2(a.name,a.phonenum));

        List<NamePhone2> npList=nameandphone.collect(Collectors.toList());

        System.out.println("Имена и номера телефонов nameandphone ");
        for(NamePhone2 e:npList) System.out.println(e.name +": "+e.phonenum);

        nameandphone=myList.stream().map((a)->new NamePhone2(a.name,a.phonenum));
        Set<NamePhone2> npSet=nameandphone.collect(Collectors.toSet());
        System.out.println("Имена и номера телефонов во множестве типа Set ");
        for(NamePhone2 e:npSet) System.out.println(e.name+": "+e.phonenum);
    }
}
