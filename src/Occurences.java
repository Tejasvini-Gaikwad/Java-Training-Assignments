import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Occurences {
    private String word;
    public Occurences(String word) {
        System.out.println(Arrays.toString(word.split(" ")));
        this.word = word;
        String[] wordArray = word.split(" ");
        HashMap<String, Integer> hash= new HashMap<>();
        for(int i = 0; i < wordArray.length; i++) {

            if(hash.containsKey(wordArray[i])){
                hash.put(wordArray[i], hash.get(wordArray[i])+1);
            }else{
                hash.put(wordArray[i], 1);
            }
        }
        for (String key : hash.keySet()) {
            System.out.println("Word: " + key + ", Count: " + hash.get(key));
        }
    }

    public static void main(String[] args) {
        Occurences occ = new Occurences("people love to love people");
    }
}
