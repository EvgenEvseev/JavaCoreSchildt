package Chapter05;
// Поиск в массиве с применением цикла for в стиле for each
public class Search {
    public static void main(String args[]){
        int nums[]={6,8,3,7,2,6,1,4};
        int val=5;
        boolean found = false;
        // поиск переменной val
        for(int x:nums){if(x==val){found=true;break;}}
        if(found)
            System.out.println("Значение найдено");
        else System.out.println("Значение не найдено");

    }
}
