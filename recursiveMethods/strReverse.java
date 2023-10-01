package recursiveMethods;

public class strReverse{
    public strReverse(String s){
        System.out.println(str_rev(s));
    }
    public String str_rev(String s){
        if(s.isEmpty()){
            return s;
        }
        else{
            return str_rev(s.substring(1))+s.charAt(0);
        }
    }
}