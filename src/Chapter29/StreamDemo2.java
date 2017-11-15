package Chapter29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>(Arrays.asList(7,18,10,24,17,5));

        Optional<Integer>productObj=myList.stream().reduce((a,b)->a*b);
        if(productObj.isPresent()) System.out.println("Произведение в виде обьекта Optional "+productObj.get());

        int product=myList.stream().reduce(1,(a,b)->a*b);
        System.out.println("Произведение в виде значения int "+product);
    }
}
