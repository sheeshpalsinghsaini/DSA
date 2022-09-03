package string;

public class RemoveSpaceWithGivenSymbol {
    
    public static void main(String[] args) {
        
        String str = "my name is sheeshpal singh saini";
        System.out.println(str);
        System.out.println(removeSpace(str));
    }

    public static String removeSpace(String s){
        String temp = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                temp +="@40";
            }else{
                temp +=s.charAt(i);
            }
        }
        return temp;
    }
}
