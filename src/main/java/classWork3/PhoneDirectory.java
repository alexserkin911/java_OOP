package classWork3;

import java.util.*;

public class PhoneDirectory {

    private static HashMap<String, List<Long>> dictionary;

    public PhoneDirectory() {
        dictionary = new HashMap<>();
    }

        public void add (String name, long phone){

        if(dictionary.containsKey(name)){
            dictionary.get(name).add(phone);
        } else{
            List<Long> arr = new ArrayList<>();
            arr.add(phone);
            dictionary.put(name, arr);
        }
    }

//    public void add (String name, long phone){
//        dictionary.computeIfAbsent(name, k -> new ArrayList<>()).add(phone);
//
//    }

//    public List<Long> get (String name){
//        return dictionary.getOrDefault(name, Collections.emptyList());
//    }

    public void get (String name){
        List<Long> arr = dictionary.get(name);
        for (Long el: arr){
            System.out.println("Number " + name + ": " + el);
        }

    }
}
