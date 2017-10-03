package Chapter18;
import java.util.*;
 class Adress {
        private String name;
        private String street;
        private String city;
        private String state;
        private String code;
        Adress(String n,String s,String c,String st,String cd){
            name=n;
            street=s;
            city=c;
            state=st;
            code=cd;
        }

        public String toString(){
            return name+"\n"+street+"\n"+city+"\n"+state+"\n"+code;
        }
}

class MailList{
    public static void main(String[] args) {
        LinkedList<Adress> ml=new LinkedList<>();// класс LinkedList !!!

        //вводим элементы в список
        ml.add(new Adress("Leonid Yakubovich","Lenina 3","Moscow","East","12345"));
        ml.add(new Adress("Eugenij Roismann","Pr.Pobedy 43","Ekaterinburg","Sovietskiy","54321"));
        ml.add(new Adress("Alexander Serij","23 South street","LA","west","23 34 45"));

        //выводим список
        for(Adress element:ml)System.out.println(element +"\n");
        System.out.println();
    }
}
