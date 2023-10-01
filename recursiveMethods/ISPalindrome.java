package recursiveMethods;

public class ISPalindrome {
    public ISPalindrome(String s){
        System.out.println(isPalin(s));
    }
    public Boolean isPalin(String s){
        if(s.length()<=1){
            return true;
        }
        char first = s.charAt(0);
        char last = s.charAt(s.length()-1);

        if(first != last){
            return false;
        }
        String remaining = s.substring(1,s.length()-1);
        return isPalin(remaining);
    }
}

