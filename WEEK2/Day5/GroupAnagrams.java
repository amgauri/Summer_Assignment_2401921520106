package WEEK2.Day5;


import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> boxes = new HashMap<>();

        for (String word : strs) {
            char[] letters = word.toCharArray();

            // same letters wale words ka sorted form same hoga
            Arrays.sort(letters);
            String key = new String(letters);

            boxes.putIfAbsent(key, new ArrayList<>());
            boxes.get(key).add(word);
        }

        return new ArrayList<>(boxes.values());
    }

    public static void main(String[] args) {
        GroupAnagrams task = new GroupAnagrams();

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(task.groupAnagrams(words));
    }
}
