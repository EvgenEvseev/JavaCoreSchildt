package Chapter15;
interface SomeFunc<T>{
    T func(T t);
}
public class GenericFunctionInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str)->{
                String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    };
        System.out.println("Незнакомец превращается в "+reverse.func("Незнакомец"));

        SomeFunc<Integer>factorial=(n)->{
            int result=1;
            for(int i=1;i<=n;i++)
                result=i*result;
            return result;
        };
        System.out.println("Факториал 5 равен"+factorial.func(5));
    }
}
