import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneLib{
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        AddPhNum("Иванов", 2345512 , bookPhone);
        AddPhNum("Энов",1083450 , bookPhone);
        AddPhNum("Хабибулина",2900405 , bookPhone);
        AddPhNum("Иванов",4212789 , bookPhone);
        AddPhNum("Энов",82145678 , bookPhone);
        AddPhNum("Петров",2450001 , bookPhone);
        Print(bookPhone);
    }
    public static void AddPhNum(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)){
            map.get(key).add(value);
        }else{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void Print(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + " ";
            }
            System.out.printf("%s: %s\n", item.getKey(), phones);
        }
    }
}