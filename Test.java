import java.sql.Time;
import java.util.*;

class Main {

    public static void main(String[] args) {
        ArrayList<Integer> totalList = new ArrayList<Integer>();
        for (int max = 2; max < 120; max++) {
            ArrayList<Integer> curList = new ArrayList<Integer>();
            int last = 1;
            while (!curList.contains(last)) {
                curList.add(last);
                last = (last * 2) % max;
            }
            totalList.add(curList.size());
        }
        for (int i = 0; i < totalList.size(); i++) {
            System.out.println(i + 2 + " : " + totalList.get(i) + " Impossible: " + (i + 2 - totalList.get(i)));
        }
        for (int i = 0; i < totalList.size(); i++) {
            int cur = i + 2;
            if ((i + 2 - totalList.get(i) == 1)) {
                System.out.print(cur + " ");
            }

        }
        System.out.print("cool");
    }
}