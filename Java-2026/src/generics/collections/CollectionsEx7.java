package generics.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
    Frequency / How many times a word appears in a sentence
 */
public class CollectionsEx7 {
    public static void main(String[] args) {

        String sentence = "this is sample sentence this is for map example";
        String[] words = sentence.split(" ");

        /*Interface*/                           /*Implementation*/
        Map<String, Integer> wordFrequency = new HashMap<String, Integer>();

        /*Sorted Order */
        TreeMap<String, Integer> wordFrequency2 = new TreeMap<>();

        for(String word : words){
            Integer value = wordFrequency.get(word); //currecnt value
            if(value == null){
                value = 1;
            }else{
                value = value +1;
            }

            wordFrequency.put(word, value);

        }

        System.out.println(wordFrequency);

        System.out.println();
        System.out.println("Sorted Order");
        for(String word : words){
            Integer value = wordFrequency2.get(word); //currecnt value
            if(value == null){
                value = 1;
            }else{
                value = value +1;
            }

            wordFrequency2.put(word, value);

        }

        System.out.println(wordFrequency2);
    }
}

/*

 wordFrequency
    this - 2
    is - 2
    sample - 1
    sentence - 1
    this - 2
 */
//for(String word : words){
//        if(wordFrequency.containsKey(word)){
//        wordFrequency.put(word, wordFrequency.get(word) + 1);
//        }else{
//        wordFrequency.put(word, 1);
//            }
//                    }

