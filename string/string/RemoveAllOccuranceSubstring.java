package string;

public class RemoveAllOccuranceSubstring {
    
    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String part = "abc";
        String res = removeAllOccuranceSubString(str, part);
        System.out.println("Resultand String : "+res);
        
    }

    public static String removeAllOccuranceSubString(String str,String part){
        StringBuffer sb = new StringBuffer(str);
        int len = part.length();
        int index = sb.indexOf(part);

        while(index!=-1){
            sb.delete(index,index+len);
            index = sb.indexOf(part);
        }
        return sb.toString();
    }

    
}
/* ip: -> daabcbaabcbc ,substring =abc
 *          ---
 */