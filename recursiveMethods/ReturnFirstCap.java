package recursiveMethods;

public class ReturnFirstCap {
    public ReturnFirstCap(String s){
        System.out.println(first(s));
    }
    public char first(String s){
        if(s.isEmpty()){
            return ' ';
        }
        if(Character.isUpperCase(s.charAt(0))){
            return s.charAt(0);
        }
        else{
            return first(s.substring(1,s.length()));
        }
    }

    
}
