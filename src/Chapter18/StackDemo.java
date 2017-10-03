package Chapter18;
//продемонстрировать применение класса Stack
import java.util.*;

public class StackDemo {
    static void showpush(Stack<Integer>st,int a){
        st.push(a);
        System.out.println("push("+a+")");
        System.out.println("стек: "+st);
    }

    static void showpop(Stack<Integer>st){
        System.out.print("pop -> ");
        Integer a=st.pop();
        System.out.println(a);
        System.out.println("стек: "+st);
    }
    public static void main(String args[]){
        Stack<Integer>sta=new Stack<Integer>();

        System.out.println("стек: "+sta);

        showpush(sta,42);
        showpush(sta,66);
        showpush(sta,99);
        showpop(sta);
        showpop(sta);
        showpop(sta);

        try {
            showpop(sta);
        }catch (EmptyStackException e){
            System.out.println("стек пуст");
        }
    }
}
