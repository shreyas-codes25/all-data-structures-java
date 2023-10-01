package recursiveMethods;

public class DeciToBi{
    public DeciToBi(int n){
        System.out.println(deciToBi(n));
    }
    public int deciToBi(int n){
        if(n==0){
            return 0;
        }
        return n%2+(10*deciToBi(n/2));

    }
}