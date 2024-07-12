package sample;

import java.util.ArrayList;
import java.util.List;

public class CollectionSanmple {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(5);
        list.add("スイム");
        list.add("バイク");
        list.add("ラン");

        for(int i = 0;i < list.size();i++){
            String str =list.get(i);
            System.out.println(str);
        }
        
        for(String s : list){
            System.out.println(s);
        }
    }
        
}
