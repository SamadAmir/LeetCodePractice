import java.util.*;

public class Main {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map = new HashMap<>();
        for (String word:strs)
        {
            char [] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedwords=new String(chars);

            if(!map.containsKey(sortedwords))
                map.put(sortedwords,new ArrayList<>());
            map.get(sortedwords).add(word);
        }
        return new ArrayList<>(map.values());

    }
    public static void main(String[] args) {
        String[] srs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(srs));
    }

}