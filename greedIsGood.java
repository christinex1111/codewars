import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class greedIsGood {
    public static void main(String[] args) {
        int[] dice = {2,4,4,5,4};
        HashMap <Integer, Integer> count = new HashMap<>();
        HashMap <Integer, Integer> overflow = new HashMap<>();
        int score = 0;

        for (int element : dice) {
            if (count.get(element) == null) {
                count.put(element, 1);
            } else if (count.get(element) != 3) {
                count.put(element, count.get(element) + 1);
            } else if (count.get(element) == 3 && element == 1) {
                count.put(element, count.get(element) + 1);
            } else {
                count.put(element, count.get(element) + 0);
            }
        }

        for (Map.Entry <Integer, Integer> entry : count.entrySet()) {
         
            if (entry.getKey() == 1 && entry.getValue() == 3) {
                score += 1000;
            } if (entry.getKey() == 6 && entry.getValue() == 3) {
                score += 600;
            } if (entry.getKey() == 5 && entry.getValue() == 3) {
                score += 500;
            } if (entry.getKey() == 4 && entry.getValue() == 3) {
                score += 400;
            } if (entry.getKey() == 3 && entry.getValue() == 3) {
                score += 300;
            } if (entry.getKey() == 2 && entry.getValue() == 3) {
                score += 200;
            } if (entry.getKey() == 1 && entry.getValue() == 1) {
                score += 100;
            } if (entry.getKey() == 5 && entry.getValue() == 1) {
                score += 50;
            } if (entry.getValue() == 4) {
                score += 1100;
            } if (entry.getKey() == 1 && entry.getValue() == 2) {
                score += 200;
            } if (entry.getKey() == 5 && entry.getValue() == 2) {
                score += 100;
            }
        
        }
        //System.out.println(count);
        System.out.println(score);
    }
}
