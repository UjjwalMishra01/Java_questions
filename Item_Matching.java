package src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Item_Matching {
    public static void main(String[] args) {
    List<List<String>> List = new ArrayList<>();
        List.add(java.util.List.of("phone", "blue", "pixel"));
        List.add(java.util.List.of("computer", "green", "lenovo"));
        List.add(java.util.List.of("phone", "gold", "iphone"));
        Item_Matching item_matching = new Item_Matching();
        int index=0;
        int count = item_matching.countMatches(List, "type","phone");
        System.out.println(count);
    }
    public  int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        int i =0;
        int size = items.size();
        if(ruleKey.equals("name"))
        {
            i = 2;
        } else if(ruleKey.equals("type")) {
            i = 0;
        }
        else if(ruleKey.equals("color"))
        {
            i = 1;
        }
        for( int j =0; j<size;j++)
        {
            String element = items.get(j).get(i);
            if(element.equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
