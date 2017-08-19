package Chapter05;

public class Return {
    public static void main(String args[]){
        int i=3;
        System.out.println("До возврата");
        if(i<4)return;// возврат в вызывающий код
        System.out.println("Дальнейший код не исполняется");
    }
}
