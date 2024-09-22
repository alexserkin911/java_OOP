package classWork3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CollectionExamples {

    public static Collection<String> getNames(String path) {
        Scanner in = new Scanner(Objects.requireNonNull(CollectionExamples.class.getResourceAsStream(path)));
        List<String> list = new ArrayList<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> hashSet = new HashSet<>();

        while (in.hasNextLine()) {
            String[] data = in.nextLine().split(",");
            for (String value : data) {
//                int value = Integer.parseInt(el);
                list.add(value);
                treeSet.add(value);
                hashSet.add(value);
            }
        }
        return hashSet;
    }

    public static Map<String, Integer> getWordsCount(String path) {
        TreeMap<String, Integer> map = new TreeMap<>();
        Scanner in = new Scanner(Objects.requireNonNull(CollectionExamples.class.getResourceAsStream(path)));


        while (in.hasNextLine()) {
            String[] data = in.nextLine().split(",");
            for (String key : data) {
                map.put(key, map.getOrDefault(key, 0) + 1);

            }
        }
        return map;
    }

    public static Map<String, String> loadDictionary(String path) {
        TreeMap<String, String> map = new TreeMap<>();
        Scanner in = new Scanner(Objects.requireNonNull(CollectionExamples.class.getResourceAsStream(path)));

        while (in.hasNextLine()) {
            String[] data = in.nextLine().split(" — ");
            String eng = data[0];
            String ru = data[1];

            map.put(eng, ru);
            map.put(ru, eng);

        }
        return map;
    }

    public static void main(String[] args) {


        System.out.println(loadDictionary("dictionary.txt").get("dog"));

//        loadDictionary("dictionary.txt").forEach((key, value) -> {
//            System.out.println(key + "-" + value);
//        });


//        System.out.println(getWordsCount("names.csv"));
//
//        for (var mapEntry : getWordsCount("names.csv").entrySet()) {
//            System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());
//        }
//
//        System.out.println("*********************************************");
//        getWordsCount("names.csv").forEach((key, value) -> {
//            System.out.println(key + "-" + value);
//        });

    }
}
