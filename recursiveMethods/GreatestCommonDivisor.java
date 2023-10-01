package recursiveMethods;
// euclidean algorithm
public class GreatestCommonDivisor {
    public GreatestCommonDivisor(int first,int second){
        System.out.println(greatest_common_divisor(first,second));
    }
    public int greatest_common_divisor(int first,int second){
        if(second==0){
            return first;
        }
        if(first<0 || second <0){
            return first;
        }
        return greatest_common_divisor(second, first%second);
    }
}
