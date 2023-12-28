import java.util.*;

public class arrayslist {

    public static void main(String[] args) {

        ArrayList<Integer> one=new ArrayList<>();
        one.add(2);
        one.add(3);
        one.add(4);
        Iterator<Integer> num=one.iterator();
        while (num.hasNext()){
            int a=num.next();

            System.out.println(a);
        }

    }

    }
