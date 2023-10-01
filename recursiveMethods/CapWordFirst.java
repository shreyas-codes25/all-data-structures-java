package recursiveMethods;

public class CapWordFirst {
    public CapWordFirst(String str){
        System.out.println(cap_word(str));
    }
    public static String cap_word(String str){
        if(str.isEmpty()){
            return str;
        }
        char ch = str.charAt(str.length()-1);
        if(str.length()==1){
            return Character.toString(Character.toUpperCase(ch));
        }
        if((str.substring(str.length()-2,str.length()-1).equals(" "))){
            ch = Character.toUpperCase(ch);
        }
        return cap_word(str.substring(0,str.length()-1))+Character.toString(ch);
    }
}
