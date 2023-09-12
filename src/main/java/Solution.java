import java.util.*;

public class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            int count = map.getOrDefault(ch, 0);
            count++;
            map.put(ch, count);
        }


        int countOfDeletions = 0;

        List<Integer> list = new ArrayList<>(map.values());

        list.sort(Comparator.reverseOrder());

        for (int i = 1; i < list.size(); i++) {
            while (list.get(i - 1) <= list.get(i)) {
                int val = list.get(i);
                if (val == 0) break;
                list.set(i, Math.max(val - 1, 0));
                countOfDeletions++;
            }
        }


        return countOfDeletions;
    }


}
