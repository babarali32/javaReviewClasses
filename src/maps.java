import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maps {

    public static void main(String[] args) {

        Map<Integer,String> val=new HashMap<>();
        val.put(1,"one");
        val.put(2,"two");
        val.put(3,"three");
        val.put(4,"four");
          Set<Integer> once=val.keySet();
        for (Integer keys:once
             ) {
            System.out.println(keys);
        }

    }
}
