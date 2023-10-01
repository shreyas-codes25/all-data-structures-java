package recursiveMethods;
public class sumOfDigits {

    public sumOfDigits(int n){
        System.out.println(sum_Of_Digits(n));
    }
    public int sum_Of_Digits(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 0;
        }
        return n%10+(sum_Of_Digits(n/10));
    }
    
}
