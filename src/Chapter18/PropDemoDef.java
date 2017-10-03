package Chapter18;
// Использования списка свойств по умолчанию
import java.util.*;
public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList=new Properties();
        defList.put("Флорида","Тэллеси");
        defList.put("Висконсин","Мэдисон");
        Properties capitals=new Properties(defList);
        capitals.put("Иллинойс","Спрингфилд");
        capitals.put("Миссури","Джефферсон-Сити");
        capitals.put("Вашингтон","Олимпия");
        capitals.put("Калифорния","Сакраменто");
        capitals.put("Индиана","Индианаполис");

        //получить множество ключей
        Set<?>states=capitals.keySet();

        //выведем все штаты и столицы
        for(Object name:states)System.out.println("Столица штата "+name+" - "+capitals.getProperty((String)name)+".");
        System.out.println();

        //Теперь флорида будет найдена в списке по умолчанию
        String str=capitals.getProperty("Флорида");
        System.out.println("Столица Флориды - "+str);
        String str2=capitals.getProperty("Висконсин");
        System.out.println("Столица Виконсина - "+str2);
    }
}
