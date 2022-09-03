package string;

// import java.util.HashMap;
// import java.util.Map;

public class PrintOccuranceChar {
    
    public static void main(String[] args) {
        
        String str = "ababcabcbac";
        // using hashmap
        // HashMap<Character,Integer> count = new HashMap<>();

        // for(int i=0;i<str.length();i++){
        //     if(!count.containsKey(str.charAt(i)))
        //         count.put(str.charAt(i), 1);
        //     else
        //         count.put(str.charAt(i), count.get(str.charAt(i))+1);
        // }
        
        // for(Map.Entry map : count.entrySet()){
        //     System.out.println(map.getKey()+" : "+map.getValue());
        // }

        //using count[26] array: contain count of each character.
        int []count = new int[26];

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                System.out.println((char)('a'+i)+" => "+count[i]);
            }
        }
    }
}
